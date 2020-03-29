package com.wdg.repository;

import com.wdg.entity.ExcelColumn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnRepository extends MongoRepository<ExcelColumn, String> {


    ExcelColumn findColumnByUserAndTemplate(String user,String template);
}
