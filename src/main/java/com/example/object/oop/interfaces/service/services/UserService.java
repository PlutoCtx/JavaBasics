package com.example.object.oop.interfaces.service.services;

/**
 * 用户服务接口
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 15:44
 */

public interface UserService extends LoginService, RegisterService {

    /**
     * 网站名称
     * 常量
     */
    String WEB_SITE_NAME = "淘宝网";

    /**
     * 登录
     * 抽象方法 默认是public abstract的
     */
    @Override
    void login();


    /**
     * 重置密码
     * 默认方法的定义
     */
    default void resetPassword(){
        System.out.println("请输入手机号并点击发送验证码");
        sendCode();
        System.out.println("请输入收到的手机验证码");
        System.out.println("请输入你的新密码");
        System.out.println("请确认你的新密码");
        System.out.println("你的密码重置成功");
    }

    /**
     * 发送验证码
     * 私有成员方法
     */
    private void sendCode(){
        System.out.println("你好，验证码是：xxxxxx,请勿告知他人");
    }




    /**
     * 统计网站注册的用户信息（人数）
     * 静态方法
     */
    static void statistics(){
        long count = getAllUserInfo();
        System.out.println("用户的注册人数是" + count);
    }

    /**
     * 从数据库查询所有的用户信息
     * 私有静态方法
     * @return
     */
    private static long getAllUserInfo(){
        System.out.println("从数据库查询所有的用户信息");
        int count = 1_000_000_000;
        return count;
    }
}

