package com.example.oop.interfaces.service.Impl;


import com.example.object.oop.interfaces.service.services.LogService;
import com.example.object.oop.interfaces.service.services.UserService;

/**
 * app服务用户测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:51
 */

public class AppUserServiceImplTest {
    public static void main(String[] args) {
        System.out.println(UserService.WEB_SITE_NAME);
        System.out.println(LogService.WEB_SITE_NAME);

        UserService.statistics();

    }
}
