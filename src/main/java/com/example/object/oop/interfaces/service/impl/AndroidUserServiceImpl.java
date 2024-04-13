package com.example.object.oop.interfaces.service.impl;

/**
 * android用户服务
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:34
 */

public class AndroidUserServiceImpl extends AppUserServiceImpl{
    @Override
    public void register() {
        System.out.println("Android用户注册成功");
    }


    @Override
    public void login() {
        System.out.println("Android端用户登录成功");
    }

    public String getDeviceInfo() {
        return "androidsji";
    }
}
