package com.example.api.lang;

import org.testng.annotations.Test;

/**
 * JavaBasics
 * 异常的使用
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/15 23:28
 * @since JDK17
 */

public class ExceptionTest {

    /**
     * 算术异常
     */
    @Test
    public void testCreateArithmeticException() {
        System.out.println("程序开始执行");
        // 0不能当做除数，此处会引发ArithmeticException异常
        System.out.println(1 / 0);
        // 由于没有处理ArithmeticException，JVM终止程序的运行，该语句不会执行
        System.out.println("程序结束执行");
    }


}
