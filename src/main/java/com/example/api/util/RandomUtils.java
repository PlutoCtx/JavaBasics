package com.example.api.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数工具类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 17:00
 */

public class RandomUtils {

    /**
     * 特殊字符
     */
    private static final String SPECIAL_CHARS = "!@#$%^&*";

    public static Random random(){
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return threadLocalRandom;
    }



    /**
     * 随机验证码
     * @param length
     * @return
     */
    public static String verificationCode(int length){
        char[] chars = new char[length];
        if (length == 4 || length == 6){
            //Random random = new Random();
            for (int i = 0;i < length; i++){
                chars[i] = (char)('0' + random().nextInt(10));
            }
        }else {
            throw new RuntimeException("手机验证码的长度不合适");
        }
        return new String(chars);
    }

    /**
     * 生成一个随机字符(有大小写字母、数字以及特殊字符组成)
     * @param random
     * @return
     */
    private static char nextChar(Random random){
        switch (random.nextInt(4)){
            case 0:
                return (char) ('0' + random.nextInt(10));
            case 1:
                return (char) ('A' + random.nextInt(26));
            case 2:
                return (char) ('a' + random.nextInt(26));
            default:
                return SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
        }
    }


    /**
     * 随机密码
     * @param length
     * @return
     */
    public static String randomPassword(int length){
        if (length < 6){
            throw new RuntimeException("密码长度太短，不够安全");
        }
        //Random random = new Random();

        //ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        char[] chars = new char[length];
        for (int i = 0;i < length; i++ ){
            chars[i] =  nextChar(random());
        }
        return new String(chars);
    }


    /**
     * 生成一个指定长度的数组，数组的元素是int类型的随机数
     * @param length
     * @return
     */
    public static int[] randomArray(int length){
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = random().nextInt();
        }
        return numbers;
    }
}
