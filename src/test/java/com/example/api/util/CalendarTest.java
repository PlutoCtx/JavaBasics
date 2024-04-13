package com.example.api.util;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历的常用方法测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:46
 */

public class CalendarTest {


    /**
     * 获取Calendar实例的两种方法
     */
    public void testCalendarInstance(){
        Calendar gregorianCalendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
    }

    /**
     * 通过Calendar获取日历相关的日期、时间信息
     */
    @Test
    public void testCalendarGet(){
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        //月份是从0开始的
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日期的时间信息：%d年 %d月 %d日 %d时 %d分 %d秒 \n",year,month,day,hour,minute,second);
        //月份
//        Calendar.JANUARY;
//        Calendar.FEBRUARY;
//        Calendar.MARCH;
//        Calendar.APRIL;
//        Calendar.MAY;
//        Calendar.JUNE;
//        Calendar.JULY;
//        Calendar.AUGUST;
//        Calendar.SEPTEMBER;
//        Calendar.OCTOBER;
//        Calendar.NOVEMBER;
//        Calendar.DECEMBER;

        //周几
//        Calendar.MONDAY;
//        Calendar.TUESDAY；
//        Calendar.WEDNESDAY;
//        Calendar.THURSDAY;
//        Calendar.FRIDAY;
//        Calendar.SATURDAY;
//        Calendar.SUNDAY;
/*
        Calendar.YEAR;
        Calendar.MONTH;
        Calendar.DAY_OF_YEAR;
        Calendar.DAY_OF_MONTH;
        Calendar.HOUR;
        Calendar.HOUR_OF_DAY;
        Calendar.MINUTE;
        Calendar.SECOND;


        Calendar.AM;
        Calendar.PM;
        Calendar.AM_PM;
        Calendar.DATE;
        Calendar.DAY_OF_WEEK;
        Calendar.DAY_OF_WEEK_IN_MONTH;
        Calendar.WEEK_OF_YEAR;
        Calendar.WEEK_OF_MONTH;



        Calendar.ALL_STYLES;
        Calendar.DST_OFFSET;
        Calendar.ERA;
        Calendar.FIELD_COUNT;
        Calendar.MILLISECOND;
        Calendar.NARROW_FORMAT;
        Calendar.NARROW_STANDALONE;
        Calendar.SHORT;
        Calendar.SHORT_FORMAT;
        Calendar.ZONE_OFFSET;
        Calendar.SHORT_STANDALONE;
        Calendar.LONG_FORMAT;
        Calendar.UNDECIMBER;
        Calendar.LONG_STANDALONE;
        */
    }


    /**
     * 日历的修改
     */
    @Test
    public void testCalendarSetAdd(){
        //以当前系统时间创建日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("日历对象修改之前的年份是" + calendar.get(Calendar.YEAR));

        calendar.set(Calendar.YEAR,1999);
        System.out.println("日历对象修改之后的年份是" + calendar.get(Calendar.YEAR));

        calendar.add(Calendar.YEAR,26);
        System.out.println("日历对象添加26年之后的年份是" + calendar.get(Calendar.YEAR));

    }


    @Test
    public void testCalendarSetTime(){
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        int year = calendar.get(Calendar.YEAR);
        //月份是从0开始的
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日期的时间信息：%d年 %d月 %d日 %d时 %d分 %d秒 \n",year,month,day,hour,minute,second);
    }


    /**
     * 两个日历对象的比较
     */
    @Test
    public void testCalendarBeforeAfter(){
        Calendar calendar1 = Calendar.getInstance();
        Date offsetDate = new Date(2000);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(offsetDate);

        System.out.println("calendar1 日历对象对应的年份" + calendar1.get(Calendar.YEAR));
        System.out.println("calendar2 日历对象对应的年份" + calendar2.get(Calendar.YEAR));

        System.out.println("calendar1.before(calendar2) = " + calendar1.before(calendar2));
        System.out.println("calendar1.after(calendar2) = " + calendar1.after(calendar2));

    }



}
