package com.wdg.purchase;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.wdg.puchase.PurchaseListListenser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 买货清单
 * @author: wangdaogang
 * @create: 2020/02/18
 **/
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class PurchaseListTest {

    @Test
    public void test2() throws FileNotFoundException {
        String filePath  = "/Users/wangdaogang/Downloads/买货清单列表.xlsx";
        PurchaseListListenser listenser = new PurchaseListListenser();
        EasyExcel.read(filePath,listenser).sheet().doRead();
        List<Map<Integer, String>> list = listenser.getList();
        Map<Integer, String> map = list.get(0);
        List<String> formKey = new ArrayList<String>();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            if(!formKey.contains(entry.getValue())){
                formKey.add(entry.getValue());
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < formKey.size(); i++) {
            sb.append(formKey.get(i)).append(",,");
        }
        System.out.println('"'+sb.toString()+'"');
    }


}
