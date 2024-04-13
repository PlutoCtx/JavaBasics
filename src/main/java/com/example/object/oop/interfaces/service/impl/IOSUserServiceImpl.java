package com.example.object.oop.interfaces.service.impl;

/**
 * IOS用户服务
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:36
 */

public class IOSUserServiceImpl extends AppUserServiceImpl{
    @Override
    public void register() {
        System.out.println("Android用户注册成功");
    }


    @Override
    public void login() {
        System.out.println("Android端用户登录成功");
    }


}

