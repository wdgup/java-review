package com.wdg.repository;

import com.wdg.entity.ExcelTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@Repository
public interface ExcelTemplateRepository extends MongoRepository<ExcelTemplate,String> {



    List<ExcelTemplate> findByUserIs(String user);


}
