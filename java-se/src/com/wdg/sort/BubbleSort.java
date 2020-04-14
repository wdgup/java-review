package com.wdg.sort;

/**
 * User: wangdaogang
 * Date: 2020/3/27
 * Description: No Description
 */
public class BubbleSort {

    public static Comparable[] sort(Comparable[] comparable){
        for (int i = comparable.length -1;i > 0; i--){
            for (int j =0;j < comparable.length -1;j++){
                if(greater(comparable[j],comparable[j+1])){
                    exchage(comparable,j,j+1);
                }
            }
        }
        return comparable;
    }

    private static boolean greater(Comparable c1, Comparable c2){
        return c1.compareTo(c2) > 0;
    }

    private static void exchage(Comparable[] arr,int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
