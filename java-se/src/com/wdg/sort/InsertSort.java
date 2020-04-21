package com.wdg.sort;

/**
 * 插入排序
 * User: wangdaogang
 * Date: 2020/4/16
 * Description: No Description
 */
public class InsertSort extends AbstractSort {
    @Override
    public Comparable[] sort(Comparable[] comparable) {
        for (int i = 1; i < comparable.length; i++) {
            int top = i;
            int index = i -1;
            while(index >=0 && greater(comparable[index],comparable[top])){
                exchage(comparable,index,top);
                index--;
                top--;
            }
        }
        return comparable;
    }
}
