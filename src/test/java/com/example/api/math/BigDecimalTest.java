package com.example.api.math;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:34
 */

public class BigDecimalTest {


    /**
     * 浮点数的精度问题
     */
    @Test
    public void testFloatPrecision(){
        System.out.println("1.0 - 0.1 = " + (1.0-0.1));
        System.out.println("1.0 - 0.32 = " + (1.0-0.32));
    }


    /**
     * 错误的构造方法
     */
    @Test
    public void testBigDecimalConstructor(){
        BigDecimal left = new BigDecimal(1.0);
        BigDecimal right = new BigDecimal(0.32);

        BigDecimal subtractResult = left.subtract(right);
        System.out.printf("%s - %s = %s \n",left,right,subtractResult);
    }


    /**
     * 正确的构造方法
     */
    @Test
    public void testBigDecimalConstructorString(){
        BigDecimal left = new BigDecimal("1.0");
        BigDecimal right = new BigDecimal("0.32");

        BigDecimal subtractResult = left.subtract(right);
        System.out.printf("%s - %s = %s \n",left,right,subtractResult);
    }


    /**
     * BigDecimal的除法运算 当除不尽的时候可能会发生算术异常ArithmeticException
     *
     */
    @Test
    public void testBigDecimalDivide(){
        BigDecimal left = new BigDecimal("10.0");
        BigDecimal right = new BigDecimal("3.0");
        /**
         * scale 2表示保留两位小数
         * RoundingMode.HALF_UP表示四舍五入
         */
        BigDecimal divideResult = left.divide(right,2, RoundingMode.HALF_UP);

        System.out.printf("%s / %s = %s \n",left,right,divideResult);



    }



}
