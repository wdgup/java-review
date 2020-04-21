package com.wdg.sort;

/**
 * User: wangdaogang
 * 希尔排序
 * Date: 2020/4/16
 * Description: No Description
 */
public class ShellSort extends AbstractSort {
    @Override
    public Comparable[] sort(Comparable[] comparable) {
        int length = comparable.length;
        int h = 1;
        while (h < length/3){
            h = h*3 +1;
        }
        while (h > 0){
            for (int i = h; i < length; i++) {
                for(int j =i;j>=h;j-=h){
                    if (greater(comparable[j - h], comparable[j])) {
                            exchage(comparable,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            h/=3;
        }
        return comparable;
    }
}
