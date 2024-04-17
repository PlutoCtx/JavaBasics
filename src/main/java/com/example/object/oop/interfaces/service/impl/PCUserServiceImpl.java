package com.example.object.oop.interfaces.service.impl;

import com.example.object.oop.interfaces.service.CommonUserService;
import com.example.object.oop.interfaces.service.services.UserService;

/**
 * PC端用户接口服务实现
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:37
 */

public class PCUserServiceImpl extends CommonUserService implements UserService {
    @Override
    public void login() {
        getSecurityService().securityCheck();
        System.out.println("PC端用户登录成功");
    }

    @Override
    public void resetPassword() {
        System.out.println("你的密码重置成功");
    }

    @Override
    public void register() {
        //组合+继承
        getSecurityService().securityCheck();
        boolean result = getValidationService().validation("jack");
        if (result){
            System.out.println("PC端用户登录成功");
        }else {
            System.out.println("PC端用户登录失败");
        }
    }
}
