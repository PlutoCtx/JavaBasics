package com.example.api.lang;

import com.example.api.lang.exception.RegisterException;

import java.util.Scanner;

/**
 * JavaBasics
 * 注册异常的使用
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/16 0:43
 * @since JDK17
 */

public class RegisterExceptionUsedTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入你的用户名：");
        String userName = input.nextLine();

        if (userName.equals("Max")) {
            try {
                throw new RegisterException("用户名以被注册");
            } catch (RegisterException e) {
                System.out.println("请更换用户名后重试");
            } finally {
                input.close();
            }
        } else {
            System.out.println("用户名注册成功");
        }
    }

}
