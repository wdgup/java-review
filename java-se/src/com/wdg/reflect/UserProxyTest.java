package com.wdg.reflect;

/**
 * User: wangdaogang
 * Date: 2020/4/20
 * Description: No Description
 */
public class UserProxyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl()).getProxy();
        userService.doSomeThing();
    }
}
