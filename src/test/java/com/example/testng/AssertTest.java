package com.example.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 断言使用的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:36
 */

public class AssertTest {

    @Test
    public void testAssert(){
        Assert.assertEquals(11,11);
    }
}
