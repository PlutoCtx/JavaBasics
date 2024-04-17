package com.example.oop.interfaces;

import com.example.object.oop.interfaces.service.services.UserService;
import com.example.object.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * 用户服务接口测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 15:50
 */

public class UserServiceTest {
        public static void main(String[] args) {
            System.out.println("当前地网站名称是"+ UserService.WEB_SITE_NAME);
            PCUserServiceImpl pcUserService = new PCUserServiceImpl();
            pcUserService.login();

            pcUserService.resetPassword();

            UserService.statistics();
        }
}
