package com.wdg.stack;

import java.util.Objects;

/**
 * User: wangdaogang
 * Date: 2020/4/16
 * 自定义栈
 * Description: No Description
 */
public class CustomStack<T> {

    private final int MAX_VALUE = 1024;

    private Object[] list;

    private int currentNode;

    public CustomStack(int value){
        if(value <= 0){
            throw new RuntimeException("value must greater zero");
        }
        list = new Object[value];
        currentNode = -1;
    }
    public CustomStack(){
        list = new Object[MAX_VALUE];
        currentNode = -1;
    }

    public boolean isEmpty(){
        return currentNode == -1;
    }

    public Object push(Object data){
        if(isFull()){
            throw new RuntimeException("current stack has full");
        }
        if(Objects.isNull(data)){
            throw new RuntimeException("data must not be null");
        }
        list[++currentNode] = data;
        return data;
    }

    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return list[currentNode];
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("current stack is empty");
            return null;
        }
        return list[currentNode--];
    }

    public boolean isFull(){
        return currentNode == MAX_VALUE;
    }

    public void print(){
        while(currentNode >= 0){
            System.out.print(peek() + "");
            currentNode--;
        }
    }
}
