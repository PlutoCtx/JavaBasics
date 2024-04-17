package com.example.api.math;

import org.testng.annotations.Test;

import java.math.BigInteger;

/**
 * 超大整数常用方法测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:34
 */

public class BigIntegerTest {

    @Test
    public void testIntLongLimit(){
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("int表示的最大值是" + intMaxValue);

        long longMaxValue = Long.MAX_VALUE;
        System.out.println("long表示的最大值是" + longMaxValue);
    }


    /**
     * BigInteger构造方法的使用
     */
    @Test
    public void testBigIntegerConstructor(){
        BigInteger bigInteger = new BigInteger("9223372036854775807000");
        String data = bigInteger.toString();
        System.out.println("data = " + data);
    }


    /**
     * 使用BigInteger完成两个超大整数的加法运算
     */
    @Test
    public void testBigIntegerAdd(){
        BigInteger left = new BigInteger("9223372036854775807000");
        BigInteger right = new BigInteger("1000000000000000000000");
        BigInteger addResult = left.add(right);
        System.out.printf("%s + %s = %s \n",left,right,addResult);
    }

    /**
     * 使用BigInteger完成两个超大整数的减法运算
     */
    @Test
    public void testBigIntegerSubtract(){
        BigInteger left = new BigInteger("9223372036854775807000");
        BigInteger right = new BigInteger("1000000000000000000000");
        BigInteger subtractResult = left.subtract(right);
        System.out.printf("%s - %s = %s \n",left,right,subtractResult);
    }

    /**
     * 使用BigInteger完成两个超大整数的乘法运算
     */
    @Test
    public void testBigIntegerMultiply(){
        BigInteger left = new BigInteger("9223372036854775807000");
        BigInteger right = new BigInteger("1000000000000000000000");
        BigInteger multiplyResult = left.multiply(right);
        System.out.printf("%s * %s = %s \n",left,right,multiplyResult);
    }


    /**
     * 使用BigInteger完成两个超大整数的除法运算
     */
    @Test
    public void testBigIntegerDivide(){
        BigInteger left = new BigInteger("9223372036854775807000");
        BigInteger right = new BigInteger("1000000000000000000000");
        BigInteger divideResult = left.divide(right);
        System.out.printf("%s / %s = %s \n",left,right,divideResult);
    }


    /**
     * 使用BigInteger的类型转换
     */
    @Test
    public void testBigIntegerTypeConversion(){
        BigInteger left = new BigInteger("9223372036854775807000");
        BigInteger right = new BigInteger("1000000000000000000000");
        BigInteger divideResult = left.divide(right);

        System.out.printf("%s / %s = %s \n",left,right,divideResult);

        int intValue = divideResult.intValue();
        System.out.println("intValue = "  +intValue);

        long longValue = divideResult.longValue();
        System.out.println("longValue = " + longValue);
    }
}
