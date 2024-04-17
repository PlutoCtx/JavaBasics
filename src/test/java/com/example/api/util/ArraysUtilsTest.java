package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 自定义数组工具类测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:45
 */

public class ArraysUtilsTest {

    @Test
    public void testGeneratorArray(){
        int[] numbers = ArraysUtils.generatorArray(10);
        System.out.println("生成的数组的内容" + Arrays.toString(numbers));
    }
}
