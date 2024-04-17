package com.example.api.util;

/**
 * 自定义数组工具类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:59
 */

public class ArraysUtils {


    /**
     * 产生一个整数数组，数组的值是随机的，在int的范围之内
     *
     * @param length
     * @return
     */
    public static int[] generatorArray(int length){
        if (length < 1){
            throw new RuntimeException("数组长度太短，不合法");
        }
        return RandomUtils.randomArray(length);

    }
}
