package com.example.api.lang;

import org.testng.annotations.Test;

/**
 * JavaBasics
 * 错误
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/15 23:38
 * @since JDK17
 */

public class ErrorTest {

    public void createStackOverFlowError() {
        System.out.println("I'm StackOverFlowError");
        createStackOverFlowError();
    }

    /**
     * 栈溢出错误
     */
    @Test
    public void testCreateStackOverFlowError() {
        createStackOverFlowError();
    }
}
