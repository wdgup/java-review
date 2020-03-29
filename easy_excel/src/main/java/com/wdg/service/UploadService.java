package com.wdg.service;

import com.wdg.common.Result;
import com.wdg.enums.FileEnum;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
public interface UploadService {

    Result<MultipartFile> checkFile(HttpServletRequest request, FileEnum fileEnum);


    Result uploadFile(HttpServletRequest request, FileEnum fileEnum);
}
