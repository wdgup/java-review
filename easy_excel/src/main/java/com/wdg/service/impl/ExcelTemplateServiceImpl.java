package com.wdg.service.impl;

import com.wdg.common.Result;
import com.wdg.entity.ExcelTemplate;
import com.wdg.repository.ExcelTemplateRepository;
import com.wdg.service.ExcelTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@Slf4j
@Service
public class ExcelTemplateServiceImpl implements ExcelTemplateService {

    @Autowired
    private ExcelTemplateRepository excelTemplateRepository;

    @Override
    public Result addTemplate(ExcelTemplate template) {
        List<ExcelTemplate> templateList = excelTemplateRepository.findByUserIs(template.getUser());
        if(!CollectionUtils.isEmpty(templateList)){
            if(templateList.stream().anyMatch(t -> t.getName().equals(template.getUser()))){
                return new Result(110,"已存在该模板，请重新输入模板");
            }
        }
        template.setCreateTtime(new Date());
        template.setUpdateTime(new Date());
        excelTemplateRepository.save(template);
        return Result.ok();
    }
}
