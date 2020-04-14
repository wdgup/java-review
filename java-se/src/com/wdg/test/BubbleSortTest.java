package com.wdg.test;

import com.wdg.sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: wangdaogang
 * Date: 2020/3/27
 * Description: No Description
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] raw = IntStream.generate(() -> new Random().nextInt(100)).limit(10).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(raw));
        Comparable[] result = BubbleSort.sort(raw);
        System.out.println(Arrays.toString(result));
    }
}
