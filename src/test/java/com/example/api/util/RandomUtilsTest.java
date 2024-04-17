package com.example.api.util;

import org.testng.annotations.Test;

/**
 * 随机数工具类测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:48
 */

public class RandomUtilsTest {

    @Test
    public void testVerificationCode(){
        for (int i = 0;i < 10; i++){
            System.out.println(RandomUtils.verificationCode(4));
        }
    }


    @Test
    public void testRandomPassword(){
        for (int i = 0;i < 10; i++){
            //密码长度
            System.out.println(RandomUtils.randomPassword(10));
        }
    }
}
