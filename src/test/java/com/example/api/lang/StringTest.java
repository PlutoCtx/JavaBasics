package com.example.api.lang;

import org.testng.annotations.Test;

/**
 * 字符串构造方法和常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:32
 */

public class StringTest {

    /**
     * String对象创建的几种方式
     */
    @Test
    public void testStringInstance(){
        //方式1：直接使用字面值来创建对象
        String str1 = "abc";
        System.out.println("str1 = " + str1);

        //""表示空字符串
        //使用指定的字符串来创建对象
        String str2 = new String("");
        System.out.println("Hello" + str2 + "World");

        //方式3：使用字符数组创建String对象
        //65表示A
        char[] chars = {'a','b','c','d'};
        String str3 = new String(chars);
        System.out.println("str3 = " + str3);

        //方式4：使用字节数组创建String对象
        byte[] bytes = {65,66,67,68};
        String str4 = new String(bytes);
        System.out.println("str4 = " + str4);
    }

    /**
     * 字符串常量相等性判断
     */
    @Test
    public void testStringConstantsEquals(){
        //因为HelloWorld常量只会在常量池存储一份
        String str1 = "HelloWorld";
        String str2 = "HelloWorld";
        //因此str1 == str2的结果是true
        System.out.println("str1 == str2 = " + (str1 == str2));
        //因此str1.equals(str2)的结果是true
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));
    }

    /**
     * 字符串变量相等性判断
     */
    @Test
    public void testStringVariableEquals(){
        //因为new会开辟新的地址空间 所以地址值是不一样的
        String str1 = new String("HelloWorld");
        String str2 = new String("HelloWorld");

        //因此str1 == str2的结果是false
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1对象的哈希值：" + (str1.hashCode()));
        System.out.println("str2对象的哈希值：" + (str2.hashCode()));
        //因此str1.equals(str2)的结果是true
        //equals比较的是内容，结果为true
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));
    }


    /**
     * 字符串相等性判断
     */
    @Test
    public void testStringConstantVariableEquals(){
        //常量区
        String str1 = "HelloWorld";
        //堆区
        String str2 = new String("HelloWorld");

        //false
        System.out.println("str1 == str2 = " + (str1 == str2));

        //因此str1.equals(str2)的结果是true
        //equals比较的是内容，结果为true
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));

    }

    @Test
    public void testStringLength(){
        String str = "我是你爸爸，54545";
        System.out.println(str + "的字符串长度是" + str.length());
    }


    /**
     * 字符串拼接的使用
     */
    @Test
    public void testStringConcat(){
        String str = "我是你爸爸，54545";
        String dest = str.concat("java");
        System.out.println(str + "拼接后的结果是" + dest);

        String str2 = "我是你爸爸，54545";
        str2+="java";
        System.out.println("str2 = " + str2);
    }

    /**
     * 获取字符串中指定索引的字符
     */
    @Test
    public void testStringCharAt(){
        String str = "我是你爸爸";
        System.out.println(str + "的第一个字符是" + str.charAt(0));
        System.out.println(str + "的最后一个字符是" + str.charAt(str.length() - 1));
    }

    /**
     * 字符串反转
     */
    @Test
    public void testStringInversion(){
        String str = "HelloWorld";
        System.out.println("反转之前字符串的内容是：" + str);
        String inversionResult = inversion(str);
        System.out.println("反转之后字符串的内容是：" + inversionResult);
    }


    public String inversion(String str){
        String newStr = new String("");
        for (int i = str.length() - 1; i >= 0  ; i--) {
            char ch = str.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }

    /**
     * 数组转换为字符串测试
     */
    @Test
    public void testArrayToString(){
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(arrayToString(array));
    }


    /**
     * 将数组转换为字符串
     * @See java.util.Arrays #toString(int[]) [1,2,3]
     * @param array
     * @return
     */
    public String arrayToString(int[] array){
        String str = "[";
        if (array.length == 0){
            return "[]";
        }
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                //不是最后的数字就拼接数字和逗号
                //str += str.concat(array[i] + ",");
                str += array[i] + ",";
            }else if (i < array.length){
                //如果是最后一个数字则拼接数字和]
                str += array[i] + "]";
            }

        }
        return str;
    }


    /**
     * 查找指定子字符串在父字符串中的索引
     * 查找指定子字符串在父字符串中最后一次出现的索引
     */
    @Test
    public void testStringIndexOfLastIndexOf(){
        String str = "我是你爸爸hahaha";
        int index = str.indexOf("ha");
        System.out.println("ha在" + str + "第一次出现的索引是" + index);

        String findStr = "java";
        findStr = "a";
        int firstIndex = str.indexOf("a");
        System.out.println(findStr + "在" + str + "中第一次出现的索引是" + firstIndex);

        int secondIndex = str.indexOf(findStr, firstIndex + 1);
        System.out.println(findStr + "在" + str + "中第二次出现的索引是" + secondIndex);

        int lastIndex = str.lastIndexOf("a");
        System.out.println(findStr + "在" + str + "中最后一次出现的索引是" + lastIndex);
    }


    /**
     * 字符串截取
     */
    @Test
    public void testStringSubString(){
        String str = "我是你爸爸hahaha";
        String substringResult = str.substring(4);
        System.out.println(str + "从4号索引截取的结果是" + substringResult);

        //不包含结束索引的字符，但包含了开始的字符
        substringResult = str.substring(0,4);
        System.out.println(str + "从0号索引开始截取到3号索引位置的结果是" + substringResult);
    }


    /**
     * equalsIgnoreCase()方法比较字符串时忽略大小写
     */
    @Test
    public void testStringEqualsIgnoreCase(){
        String str1 = "我是你爸爸hahaha";
        String str2 = "我是你爸爸HaHaHa";
        //false
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        //true
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));

    }


    /**
     * 字符串的非空判断
     * 字符串的空格判断
     */
    @Test
    public void testStringIsEmptyIsBlank(){
        //空字符串
        String str1 = "";
        //null 可以赋值所有的引用数据类型，null表示空，但是具体的含义是对象没有在堆内存分配内存空间，也没有存储对象的数据
        String str2 = null;

        //true
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        //NullPointerException
        //System.out.println("str2.isEmpty() = " + str2.isEmpty());

        //str3存储的是空格
        String str3 = " ";
        //false 空格不是空
        System.out.println("str3.isEmpty() = " + str3.isEmpty());
        //true 判断字符串是否是空格
        System.out.println("str3.isBlank() = " + str3.isBlank());
    }


    /**
     * contains()方法用于判断str1是否包含str2
     */
    @Test
    public void testStringContains(){
        //父串
        String str1 = "我是你爸爸hahaha";
        //子串
        String str2 = "hahaha";

        System.out.println("str1.contains(str2) = " + str1.contains(str2));
    }


    /**
     * contains()和replace()方法的结合使用
     */
    @Test
    public void testStringContainsReplace(){
        String message = "我的密码是：666666";
        System.out.println("修改之前的消息的内容是" + message);

        if (message.contains("密码")){
            //脱敏
            String replaceResult = message.replace("6", "*");
            System.out.println("修改之后的消息的内容是" + replaceResult);
        }
    }


    /**
     * endsWith方法判断字符串是否以指定后缀结尾
     * startsWith方法判断字符串是否以指定前缀开头
     *
     * 应用场景：文件查找
     *
     */
    @Test
    public void testStringStartWithEndsWith(){
        String fileName = "StringTest.java";
        String prefix = "String";
        boolean startsWith = fileName.startsWith(prefix);
        System.out.println(fileName + "是否以" + prefix + "开头" + startsWith);

        String suffix = ".java";
        boolean endsWith = fileName.endsWith(suffix);
        System.out.println(fileName + "是否以" + suffix + "结尾" + endsWith);
    }


    /**
     * 大小写转换
     */
    @Test
    public void testStringToUpperCaseToLowerCase(){
        String str = "Java,Python,Go";
        System.out.println(str + "转换为大写之后的结果：" + str.toUpperCase());
        System.out.println(str + "转换为小写之后的结果：" + str.toLowerCase());
    }


    /**
     * 字符串转字符数组
     * 字符串转字节数组
     */
    @Test
    public void testStringToCharArrayGetBytes(){
        String str = "Hello World";
        //将字符串转换为字符数组
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();

        //增强for循环
        for (char ch : chars) {
            System.out.print(ch);
        }

        System.out.println();
        byte[] bytes = str.getBytes();

        //转换成字节数组的结果
        //将字符串转成对应的编码值
        for (byte by : bytes) {
            System.out.print(by + " ");
        }
    }


    /**
     * trim()方法去空格
     */
    @Test
    public void testStringTrim(){
        String str = "  Hello World  ";
        System.out.println("去空格之前的字符串：" + str);
        String trimResult = str.trim();
        System.out.println("去空格之后的字符串：" + trimResult);
    }


    /**
     * split() 按照指定的规则切割字符串，返回字符串数组
     */
    @Test
    public void testStringSplit(){
        String str = "Java,Python,Go";
        System.out.println("切割之前的字符串：" + str);

        String[] splitResult = str.split(",");
        System.out.print("切割之后的字符串数组：");

        for (String language : splitResult) {
            System.out.print(language + " ");
        }

    }


}
