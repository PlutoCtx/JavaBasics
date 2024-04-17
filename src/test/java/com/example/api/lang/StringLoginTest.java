package com.example.api.lang;

import java.util.Scanner;

/**
 * 模拟用户登录
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:31
 */

public class StringLoginTest {
    final static String userName = "Max";
    final static String password = "195467";
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        doLogin(3);
    }


    /**
     *
     * @param count
     */
    public static void doLogin(int count){
        int maxLoginCount = count ;

        for (int i = 0; i < count; i++) {
            System.out.println("请输入用户名");

            String inputUserName = input.next();

            System.out.println("请输入密码");
            String inputPassword = input.next();

            if (userName.equals(inputUserName) && password.equals(inputPassword)){
                System.out.println("Login Success");
            }else {
                System.out.println("Login Failed");
                maxLoginCount--;
                System.out.println("你还有" + maxLoginCount + "次机会");
            }

        }
    }

}
