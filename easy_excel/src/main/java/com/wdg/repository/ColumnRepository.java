package com.wdg.repository;

import org.apache.poi.ss.formula.functions.Column;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnRepository extends MongoRepository<Column, String> {

}
