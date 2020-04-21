package com.wdg.sort;

/**
 * User: wangdaogang
 * Date: 2020/4/16
 * 选择排序
 * Description: No Description
 */
public class SelectSort extends AbstractSort {

    @Override
    public Comparable[] sort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < comparable.length - 2; j++) {
                if(greater(comparable[minIndex] , comparable[j])){
                    minIndex = j;
                }
            }
            exchage(comparable,minIndex,i);
        }
        return comparable;
    }
}
