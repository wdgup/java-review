package com.wdg.thread;

/**
 * User: wangdaogang
 * Date: 2020/4/17
 * Description: No Description
 */
public class ThreadDemo1 {
    static  int i = 1;
    public static void main(String[] args) {
        synchronized (ThreadDemo1.class){
            System.out.println("11111111111");
        }
    }
}
