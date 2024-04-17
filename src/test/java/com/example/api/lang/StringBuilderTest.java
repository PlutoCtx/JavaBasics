package com.example.api.lang;

import org.testng.annotations.Test;

/**
 * StringBuilder常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:30
 */

public class StringBuilderTest {

    /**
     * StringBuilder对象的两种创建方式
     */
    @Test
    public void testStringBuilderConstructor(){
        StringBuilder empty = new StringBuilder();
        System.out.println("empty.length() = " + empty.length());

        StringBuilder str = new StringBuilder("我是你爸爸");
        System.out.println("empty.length() = " + str.length());
    }


    /**
     * StringBuilder对象的两种创建方式
     */
    @Test
    public void testStringBuilderAppend(){
        StringBuilder builder = new StringBuilder();
        StringBuilder one = builder.append("一二三四五");
        StringBuilder two = builder.append("六七八");
        builder.append("九十").append("十一十二").append("十三十四");


        System.out.println(builder);
        System.out.println("one == two = " + (one == two));
        //内容
        System.out.println("one.equals(two) = " + one.equals(two));
        System.out.println(one);
        System.out.println(two);
    }


    /**
     * StringBuilder 实现字符串反转
     */
    @Test
    public void testStringBuilderReverse(){

        String str = "Java你爸爸是我";
        StringBuilder builder = new StringBuilder(str);
        System.out.println("反转之前的字符串：" + str);
        System.out.println("反转之后的字符串：" + builder.reverse());
    }


    /**
     * 在指定位置插入数据
     */
    @Test
    public void testStringBuilderInsert(){
        String str = "我是你爸爸hahah";
        StringBuilder builder = new StringBuilder(str);
        builder.insert(1,"195467");
        System.out.println("字符串插入的结果：" + builder);
    }

    /**
     * StringBuilder和String的相互转换
     */
    @Test
    public void testBuilder2String(){
        //String转StringBuilder
        String str = "我是你爸爸";
        StringBuilder builder = new StringBuilder();
        //StringBuilder转String
        String toStringResult = builder.toString();
    }

}
