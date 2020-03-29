package com.wdg.service.impl;

import com.wdg.common.Result;
import com.wdg.common.Tips;
import com.wdg.constant.Constants;
import com.wdg.enums.FileEnum;
import com.wdg.file.ImportFactory;
import com.wdg.service.UploadService;
import com.wdg.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Objects;
import java.util.UUID;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@Service
@Slf4j
public class UploadServiceImpl implements UploadService {

    @Value("${upload.path}")
    private String uploadPath;
    @Value("${static.file.path}")
    private String url;
    @Autowired
    private ImportFactory importFactory;
    @Override
    public Result<MultipartFile> checkFile(HttpServletRequest request, FileEnum fileEnum) {
        if(!(request instanceof MultipartHttpServletRequest)){
           return new Result(Tips.UPLOAD_PARAM_ERROR);
        }
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        MultiValueMap<String, MultipartFile> multiFileMap = multipartHttpServletRequest.getMultiFileMap();
        if(CollectionUtils.isEmpty(multiFileMap)){
            return new Result(Tips.UPLOAD_PARAM_ERROR);
        }
        //检查文件后缀
        //MultipartFile file = multiFileMap.entrySet().stream().map(temp -> temp.getValue().get(0)).findFirst().get();
        MultipartFile file = multiFileMap.get("file").get(0);
        return checkSufix(file,fileEnum);
    }


    private Result<MultipartFile> checkSufix(MultipartFile file,FileEnum fileEnum){
        if(Objects.isNull(file) || Objects.isNull(fileEnum)){
            return new Result(Tips.UPLOAD_PARAM_ERROR);
        }
        String filename = file.getOriginalFilename();
        switch (fileEnum){
            case XSLX:{
                String sufix = filename.substring(filename.lastIndexOf(".")+1);
                if("XLSX".equalsIgnoreCase(sufix)){
                    return new Result(Tips.OK,file);
                }
            }
            break;
        }
        return new Result(Tips.UPLOAD_FILE_ERROR);
    }
    @Override
    public Result uploadFile(HttpServletRequest request, FileEnum fileEnum) {
        try {
            Result<MultipartFile> checkResult = checkFile(request, fileEnum);
            if(Constants.SUCCESS_CODE  != checkResult.getCode()){
                return checkResult;
            }
            MultipartFile file = checkResult.getData();
            String sufix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String folder = DateUtils.formatCurrentDate(Constants.DATE_FORMAT_2);
            String newFileName = UUID.randomUUID().toString() + sufix;
            String currentFilePath = uploadPath+folder + File.separator + newFileName;
            writeFile(currentFilePath,file.getInputStream());
            String url = this.url + newFileName;
            importFactory.execute(currentFilePath,"","");
            return Result.ok();
        } catch (IOException e) {
            log.error("上传文件出错：{}",e.getMessage());
            return new Result(Tips.UPLOAD_PARAM_ERROR);
        }
    }

    private void writeFile(String filePath, InputStream inputStream) throws IOException {
            File file = new File(filePath);
            createFolder(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            int len ;
            byte[] arr = new byte[1024];
            while((len = inputStream.read(arr)) != -1){
                fos.write(arr,0,len);
            }
            fos.close();
            inputStream.close();
    }

    private void createFolder(String filePath) {
        String folder = filePath.substring(0, filePath.lastIndexOf(File.separator) + 1);
        File file = new File(folder);
        if(!file.exists()){
            file.mkdirs();
        }
//        String str = filePath.replaceAll(File.separator + File.separator, File.separator);
//        int index = str.indexOf(":");
//        String cd = str.substring(0, str.indexOf(":") + 1);
//        String first = "";
//        for (int i = index + 2; i < filePath.length(); i++) {
//            if(filePath.substring(i,i+1).equals(File.separator)){
//                first = str.substring(0,i+1);
//                break;
//            }
//        }
//        String[] split = str.substring(str.indexOf(first)).split(File.separator);
//        for (String name : split){
//            File file = new File(first + name);
//            if(file.isDirectory() && !file.exists()){
//                file.mkdirs();
//            }
//        }
    }
}
