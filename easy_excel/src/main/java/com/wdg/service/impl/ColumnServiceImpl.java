package com.wdg.service.impl;

import com.wdg.common.DataResult;
import com.wdg.common.Result;
import com.wdg.common.Tips;
import com.wdg.constant.Constants;
import com.wdg.entity.ExcelColumn;
import com.wdg.repository.ColumnRepository;
import com.wdg.service.ColumnService;
import com.wdg.vo.ColumnCondition;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@Service
@Slf4j
public class ColumnServiceImpl implements ColumnService {

    @Autowired
    private MongoTemplate mongoTemplate;

    private ColumnRepository columnRepository;
    @Override
    public Result save(ExcelColumn column) {
         column.setOrder(Objects.isNull(column.getOrder()) ? 0 : column.getOrder());
         mongoTemplate.save(column);

        return Result.ok();
    }

    @Override
    public void inserOrUpdate(ExcelColumn column) {
        ExcelColumn res = columnRepository.findColumnByUserAndTemplate(column.getUser(), column.getTemplate());
        if(Objects.nonNull(res)){
            BeanUtils.copyProperties(column,res);
            res.setUpdateTime(new Date());
        }else{
            column.setUpdateTime(new Date());
            column.setCreateTtime(new Date());
            columnRepository.save(res);
        }
    }

    @Override
    public Result<DataResult<ExcelColumn>> dataList(ColumnCondition condition) {
        if(Objects.isNull(condition))
            return new Result<>(Tips.PARAM_ERROR);

        Criteria criteria = new Criteria();
        if(StringUtils.isNotBlank(condition.getColumnType())){
            criteria.and("columnType").is(condition.getColumnType());
        }
        int pageNo = condition.getPageNo();
        int pageSize = condition.getPageSize();
        Query query = new Query(criteria);
        Long total = mongoTemplate.count(query, Constants.T_EXCEL_COLUMN);
        query.skip(1L * (pageNo - 1) * pageSize).limit(pageSize);
        List<ExcelColumn> list = mongoTemplate.find(query, ExcelColumn.class, Constants.T_EXCEL_COLUMN);
        //根据order 排序
        List<ExcelColumn> result = list.stream().sorted((o1, o2) ->
                o2.getOrder().compareTo(o1.getOrder())).collect(Collectors.toList());
        return new Result<>(Tips.OK,new DataResult<>(pageNo,pageSize,total,result));
    }

}
