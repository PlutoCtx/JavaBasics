package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Date;

/**
 * 日期时间常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:46
 */

public class DateTimeTest {

    @Test
    public void testDateConstructor(){
        Date currentDate = new Date();
        System.out.println("当前时间：" + currentDate);


        /*
         * 标准基准时间 1970年1月1日 00:00:00
         * 中国标准基准时间 1970年1月1日 08:00:00
         * 2000毫秒 等于2秒
         * 1970年1月1日 08:00:02
         */
        Date offsetDate = new Date(2000);
        System.out.println("offsetDate = " + offsetDate);
    }

    /**
     * 获取时间
     * 设置时间
     * @See Date#getTime()  获取当前时间距离标准基准时间的毫秒数
     * @See Date#setTime(long)  设置当前时间距离标准基准时间偏移量的毫秒数
     */
    @Test
    public void setDateGetTimeSetTime(){
        Date currentDate = new Date();
        System.out.println("当前时间距离标准基准时间的毫秒数：" + currentDate.getTime());
        System.out.println("当前时间距离标准基准时间的毫秒数：" + System.currentTimeMillis());

        Date offsetDate = new Date();
        offsetDate.setTime(2000);
        System.out.println("currentDate = " + offsetDate);
    }


    @Test
    public void testDateBeforeAfter(){
        Date date1 = new Date();
        date1.setTime(2000);

        Date date2 = new Date();

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        //比较date1是否在date2之前
        System.out.println("date1.before(date2) = " + date1.before(date2));
        System.out.println("date1.before(date2) = " + date1.after(date2));

    }
}
