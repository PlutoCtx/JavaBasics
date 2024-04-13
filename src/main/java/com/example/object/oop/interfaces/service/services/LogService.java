package com.example.object.oop.interfaces.service.services;

/**
 * 日志服务
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 15:43
 */

public interface LogService {

    /**
     * 测试
     */
    String WEB_SITE_NAME = "淘宝网2";

    /**
     * 记录用户操作日志
     */
    void log();
//    /**
//     * 统计网站注册的用户信息（人数）
//     * 静态方法
//     */
//    static void statistics(){
//        System.out.println("用户的注册人数是" + 1000000);
//    }
}
