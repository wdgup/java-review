package com.wdg.puchase;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: wangdaogang
 * @create: 2020/02/18
 **/
public class PurchaseListListenser  extends  AnalysisEventListener<Map<Integer,String>> {


    private List<Map<Integer,String>> list  = new ArrayList<Map<Integer,String>>();


    public void invoke(Map<Integer,String> o, AnalysisContext analysisContext) {
        System.out.println(o);
        list.add(o);

    }

    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

   public List<Map<Integer,String>> getList(){
        return list;
   }



}
