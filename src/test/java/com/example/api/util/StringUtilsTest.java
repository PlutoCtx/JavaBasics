package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 字符串工具类测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:48
 */

public class StringUtilsTest {

    @Test
    public void testStringUtilsReverse(){
        String str = "Java你爸爸是我";
        System.out.println(StringUtils.reverse(str));
    }


    @Test
    public void testStringUtilsArrayToString(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        array =new int[1];
        System.out.println(Arrays.toString(array));
        System.out.println(StringUtils.arrayToString(array));
    }
}
