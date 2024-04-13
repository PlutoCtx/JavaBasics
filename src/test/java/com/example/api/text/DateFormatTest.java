package com.example.api.text;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化常用方法的测试用例
 *
 * y 表示年份
 * M 表示月份
 * d 表示日（一个月的第几天）
 * H 表示小时
 * m 表示分钟
 * s 表示秒钟
 *
 * 标准的日期格式
 * yyyy-MM-dd HH:mm:ss
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:38
 */

public class DateFormatTest {

    /**
     * format(Date date)    将日期对象转换为日期字符串，按照指定的日期格式
     */
    @Test
    public void testDateFormatFormat(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = dateFormat.format(date);
        System.out.println("当前时间的默认格式：" + date);
        System.out.println("当前时间的格式化结果：" + formatDate);
    }


    /**
     * 日期字符串 转换为 日期对象
     * parse(String source)    将日期字符串转换为日期对象，按照指定的日期格式
     */
    @Test
    public void testDateFormatParse(){
        //日期字符串和日期格式一定要匹配，否则会出现解析异常
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date parseDate = dateFormat.parse("2022-07-28 20:39:35");
            System.out.println("日期字符串 转换为 日期对象的结果：" + parseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }


}
