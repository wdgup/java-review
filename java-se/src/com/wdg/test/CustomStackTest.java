package com.wdg.test;

import com.wdg.stack.CustomStack;

import java.util.UUID;

/**
 * User: wangdaogang
 * Date: 2020/4/16
 * Description: No Description
 */
public class CustomStackTest {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println(str);
        CustomStack stack = new CustomStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.substring(i,i+1));
        }
        stack.print();

    }
}
