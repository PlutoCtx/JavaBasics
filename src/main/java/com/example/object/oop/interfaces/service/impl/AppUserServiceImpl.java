package com.example.object.oop.interfaces.service.impl;

import com.example.object.oop.interfaces.service.CommonUserService;
import com.example.object.oop.interfaces.service.services.LogService;
import com.example.object.oop.interfaces.service.services.UserService;

/**
 * app用户服务实例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:35
 */

public class AppUserServiceImpl extends CommonUserService implements UserService, LogService {
    @Override
    public void register() {
        log();
        System.out.println("app用户注册成功");
    }

    @Override
    public void login() {
        log();
        System.out.println("app用户登录成功");
    }


    @Override
    public void log() {
        System.out.println("记录app用户的操作日志成功");
    }

}
