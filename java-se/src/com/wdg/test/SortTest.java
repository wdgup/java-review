package com.wdg.test;

import com.wdg.sort.*;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: wangdaogang
 * Date: 2020/3/27
 * Description: No Description
 */
public class SortTest {
    public static void main(String[] args) {
        AbstractSort bubbleSort = new BubbleSort();
        AbstractSort selectSort = new SelectSort();
        AbstractSort insertSort = new InsertSort();
        AbstractSort shellSort = new ShellSort();
        Integer[] raw ;
        raw = IntStream.generate(() -> new Random().nextInt(10000)).limit(10000).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(raw));
        long start1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(bubbleSort.sort(raw)));
        long end1 = System.currentTimeMillis();
        System.out.println("---------------"+(end1-start1)+"----------------------");

        raw = IntStream.generate(() -> new Random().nextInt(10000)).limit(10000).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(raw));
        long start2 = System.currentTimeMillis();
        System.out.println(Arrays.toString(selectSort.sort(raw)));
        long end2 = System.currentTimeMillis();
        System.out.println("---------------"+(end2-start2)+"----------------------");

        raw = IntStream.generate(() -> new Random().nextInt(10000)).limit(10000).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(raw));
        long start3 = System.currentTimeMillis();
        System.out.println(Arrays.toString(insertSort.sort(raw)));
        long end3 = System.currentTimeMillis();
        System.out.println("---------------"+(end3-start3)+"----------------------");


        raw = IntStream.generate(() -> new Random().nextInt(10000)).limit(10000).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(raw));
        long start4 = System.currentTimeMillis();
        System.out.println(Arrays.toString(shellSort.sort(raw)));
        long end4 = System.currentTimeMillis();
        System.out.println("---------------"+(start4-end4)+"----------------------");
    }
}
