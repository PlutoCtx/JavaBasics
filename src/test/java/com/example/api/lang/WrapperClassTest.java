package com.example.api.lang;

import org.testng.annotations.Test;

/**
 * 包装类常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:33
 */

public class WrapperClassTest {


    /**
     * 字符串转换为整数的测试案例
     */
    @Test
    public void testIntegerParseInt(){
        String str = "1000";
        int value = Integer.parseInt(str);
        System.out.println("value = " + value);
    }


    /**
     * int转换为Ingeter
     */
    @Test
    public void testIntegerValueOf(){
        int value = 100;
        Integer integer = Integer.valueOf(value);
        System.out.println("integer = " + integer);
    }

    /**
     * == 表示判断对象地址是否相等
     * Integer缓存 -128 ~ +127
     */
    @Test
    public void testIntegerCache(){
        int value = 127;
        Integer source = Integer.valueOf(value);
        Integer target = Integer.valueOf(value);
        //true
        System.out.println("source ==  target = " + (source == target));

        value = 128;
        source = Integer.valueOf(value);
        target = Integer.valueOf(value);
        //false
        System.out.println("source ==  target = " + (source == target));
        //true equals比较的是对象的属性值value，而不是地址
        System.out.println("source.equals(target) = " + (source.equals(target)));
    }


    @Test
    public void testAutoBox(){
        int number = 10;
        Integer value = Integer.valueOf(100);

        //自动拆箱 将包装类赋值给对应的基本数据类型
        number = value;
        System.out.println("自动拆箱的结果：value = " + number);

        //自动装箱 将基本数据类型赋值给对应的包装类
        value = number;
        System.out.println("自动装箱的结果：number = " + value);
    }


    /**
     * 大小写字母转换
     */
    @Test
    public void testCharacterToUpperLowerCase(){
        char ch = 'A';
        char lower = Character.toLowerCase(ch);
        System.out.println("大写字母A转换成小写字母的结果是：" + lower);

        char upper = Character.toUpperCase(lower);
        System.out.println("小写字母a转换成大写字母的结果是：" + upper);
    }


    /**
     * 大小写字母的判断
     */
    @Test
    public void testCharacterIsUpperLower(){
        char ch = 'A';
        System.out.println("A是否是大写字母" + Character.isUpperCase(ch));

        char upper = 'a';
        System.out.println("a是否是大写字母" + Character.isUpperCase(upper));
    }


    /**
     * 获取字符数组中指定索引字符的unicode编码
     */
    @Test
    public void testCharacter(){
        char[] chars = {'a','中'};
        int index = 1;
        int unicode = Character.codePointAt(chars,index);
        System.out.println("中对应的unicode编码值是" + unicode);

    }


}
