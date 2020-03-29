package com.wdg.controller;

import com.wdg.common.Result;
import com.wdg.enums.FileEnum;
import com.wdg.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/importExcel")
    public Result importFile(HttpServletRequest request){
        return uploadService.uploadFile(request, FileEnum.XSLX);
    }
}
