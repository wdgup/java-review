package com.wdg.file;

import com.wdg.common.Result;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@Component
public class ImportFactory {


    @Async
    public Result execute(String filePath,String userCode,String template){
        return null;
    }
}
