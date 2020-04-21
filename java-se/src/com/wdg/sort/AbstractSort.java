package com.wdg.sort;

/**
 * User: wangdaogang
 * Date: 2020/4/16
 * Description: No Description
 */
public abstract class AbstractSort {

    public abstract Comparable[] sort(Comparable[] comparable);


    protected  boolean greater(Comparable c1, Comparable c2){
        return c1.compareTo(c2) > 0;
    }

    protected  void exchage(Comparable[] arr,int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
