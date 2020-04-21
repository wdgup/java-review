package com.wdg.sort;

/**
 * User: wangdaogang
 * Date: 2020/3/27
 * 冒泡排序
 * Description: No Description
 */
public class BubbleSort extends AbstractSort{

    @Override
    public  Comparable[] sort(Comparable[] comparable){
        for (int i = comparable.length -1;i > 0; i--){
            for (int j =0;j < comparable.length -1;j++){
                if(greater(comparable[j],comparable[j+1])){
                    exchage(comparable,j,j+1);
                }
            }
        }
        return comparable;
    }

}
