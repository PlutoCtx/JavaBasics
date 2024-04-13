package com.example.testng;

import org.testng.annotations.*;

/**
 * TestNG使用的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:37
 */

public class MyTest {

    @Test
    public void testTestAnnotation1(){
        System.out.println("执行testTestAnnotation1方法");
    }

    @Test
    public void testTestAnnotation2(){
        System.out.println("执行testTestAnnotation2方法");
    }

    @BeforeMethod
    public void testBeforeMethodAnnotation(){
        System.out.println("执行testBeforeMethodAnnotation方法");
    }

    @AfterMethod
    public void testAfterMethodAnnotation(){
        System.out.println("执行testAfterMethodAnnotation方法");
    }

    @BeforeClass
    public void testBeforeClassAnnotation(){
        System.out.println("执行testBeforeClassAnnotation方法");
    }

    @AfterClass
    public void testAfterClassAnnotation(){
        System.out.println("执行testAfterClassAnnotation方法");
    }




}
