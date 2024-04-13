package com.example.api.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

/**
 * Objects常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:47
 */

public class ObjectsTest {


    /**
     * 测试String的equals()方法，体会什么叫空指针异常
     * @See String #equals(Object)
     */
    @Test
    public void testStringEquals(){
        // TODO PlutoCtx-2024/4/14: test failed
        String str1 = null;
        String str2 = "max";
        System.out.println(str1.equals(str2));
    }


    /**
     * 测试Objects的equals()方法，体会如何解决空指针异常
     * @See java.util.Objects #equals(Object,Object)
     */
    @Test
    public void testObjectsEquals(){
        String str1 = null;
        String str2 = "max";
        boolean result = Objects.equals(str1, str2);
        //System.out.println(Objects.equals(str1, str2));
        //断言结果不报错
        //因此 尽量使用Objects的equals()方法 以防止空指针异常
        Assert.assertEquals(result,false);

    }


    /**
     * 测试Objects类的nonNull()方法
     * @See Object #nonNull(Object)
     */
    @Test
    public void testObjectsNonNull(){
        //String str = "max";     //true
        //String str = "";     //true
        String str = null;     //true

        System.out.println(Objects.nonNull(str));
        Assert.assertEquals(Objects.nonNull(str),true);
    }



    /**
     * 测试Objects类的requireNonNull()方法
     *
     * 如果该方法传递的是null，就会抛出NPE(空指针)异常
     *
     *
     * @See Object #nonNull(Object)
     */
    @Test
    public void testObjectsRequireNonNull(){
        /*
         * 会抛出异常
         *
         * */
//        String str = null;     //true
//        Objects.requireNonNull(str);


        //String str = "max";     //true
        String str1 = "max";     //true
        String result = Objects.requireNonNull(str1);
        System.out.println("result = " + result);

//        System.out.println(Objects.nonNull(str));
//        Assert.assertEquals(Objects.nonNull(str),true);
    }



}
