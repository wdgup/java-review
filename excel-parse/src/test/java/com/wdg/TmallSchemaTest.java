package com.wdg;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @author: wangdaogang
 * @create: 2020/02/05
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TmallSchemaTest {

    private static final String TmallShopSchema = "TmallShopSchema";
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void getSchema(){
        Query query = new Query();
        Criteria criteria = new Criteria();
        criteria.and("shopId").is("gap").and("cid").is("201232409");
        query.addCriteria(criteria);
        List<JSONObject> list = mongoTemplate.find(query, JSONObject.class, TmallShopSchema);
        System.out.println(list);

        Set<String> schemaTypes = new HashSet<String>();
        Set<String> types = new HashSet<String>();
        for (JSONObject obj: list) {
            String schemaType = obj.getString("schemaType");
            String type = obj.getString("type");
            schemaTypes.add(schemaType);
            types.add(type);
        }
        System.out.println(schemaTypes);
        System.out.println(types);
    }
}
