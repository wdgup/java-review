package com.wdg.file;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@Slf4j
public class ObjectListener extends AnalysisEventListener<Object> {

    private List<Map<Integer,Object>> list = new ArrayList<>();
    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        if(o instanceof Map){
            Map<Integer, Object> data = (Map<Integer, Object>) o;
            log.info("解析到一条数据:{}，当前行:{}", JSON.toJSONString(data),analysisContext.getCurrentRowNum());
            list.add(data);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("当前sheet:{}-{}，所有数据解析完成，获取条数：{}",
                analysisContext.getCurrentSheet().getSheetNo(),
                analysisContext.getCurrentSheet().getSheetName(),
                list.size());
    }
}
