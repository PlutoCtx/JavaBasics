package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Arrays常用方法测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:45
 */

public class ArraysTest {

    private static final int length = 1_0000;

    /**
     * @See Arrays#sort(int[])
     */
    @Test
    public void testArraysSort(){
        int[] numbers = ArraysUtils.generatorArray(10);
        System.out.println("排序之前数组的内容" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("排序之后数组的内容" + Arrays.toString(numbers));
    }


    /**
     * 统计Arrays.sort()方法的耗时
     */
    @Test
    public void testArraysSortTime(){
        int[] numbers = ArraysUtils.generatorArray(length);
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        long endTime = System.currentTimeMillis();
        DataTimeUtils.calculatorTime(startTime,endTime);
    }


}
