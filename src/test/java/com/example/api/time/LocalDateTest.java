package com.example.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Java8-日期API 本地日期常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:40
 */

public class LocalDateTest {

    LocalDate now = LocalDate.now();

    @BeforeClass
    public void initLocalDate(){
        System.out.println("当前的日期信息：" + now);
    }


    /**
     * 获取LocalDate对象的两种方式
     */
    @Test
    public void testLocalDateInstance(){
        LocalDate now = LocalDate.now();
        System.out.println("当前的日期信息：" + now);

        LocalDate currentDate = LocalDate.of(2020, 07, 30);
        System.out.println("当前的日期信息：" + currentDate);
    }


    /**
     * 通过LocalDate获取日期相关的信息
     */
    @Test
    public void testLocalDateGetDateInfo(){
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();

        System.out.println("当前的日期信息：" + year + "年" + month.getValue() + "月" + dayOfMonth + "日");

        boolean leapYear = now.isLeapYear();
        System.out.println("当前的年份是否是闰年：" + leapYear);

        LocalDate customDate = LocalDate.of(2012, 05, 06);
        System.out.println("2012年是否是闰年：" + customDate.isLeapYear());

        System.out.println("今年有" + now.lengthOfYear() + "天");
    }


    /**
     * LocalDate的日期修改
     */
    @Test
    public void testLocalDateUpdate(){
        LocalDate withYear = now.withYear(2018);
        System.out.println("将当前的年份改为2018年之后的日期信息：" + withYear);

        LocalDate withMonth = now.withMonth(6);
        System.out.println("将当前的月份改为6月之后的日期信息：" + withMonth);

        LocalDate withDayOfMonth = now.withDayOfMonth(15);
        System.out.println("将当前的日期改为15日之后的日期信息：" + withDayOfMonth);


        //链式编程 将当前日期改为某一指定日期
        LocalDate finalDate = now.withYear(2016).withMonth(6).withDayOfMonth(16);
        System.out.println("修改后的日期：" + finalDate);

        LocalDate withDate = now.with(ChronoField.YEAR, 2019);
        System.out.println("修改当前年份为2019后的日期信息：" + withDate);

    }


    /**
     * 日期的算术运算
     */
    @Test
    public void testLocalDatePlusMinus(){

        //日期相加
        LocalDate oneYearLaterDate = now.plusYears(1);
        System.out.println("一年以后的日期信息：" + oneYearLaterDate);

        LocalDate plusMonths = now.plusMonths(4);
        System.out.println("4个月以后的日期信息：" + plusMonths);

        LocalDate plusDays = now.plusDays(10);
        System.out.println("10天以后的日期信息：" + plusDays);


        //日期的减法
        LocalDate minusYears = now.minusYears(4);
        System.out.println("5年前的日期信息：" + minusYears);

        LocalDate fiveDaysBeforeDate = now.minus(5, ChronoUnit.DAYS);
        System.out.println("5天以前的日期信息：" + fiveDaysBeforeDate);


    }


    /**
     * 日期的判断
     */
    @Test
    public void testLocalDateIsBeforeIsAfter(){
        //日期相加
        LocalDate oneYearLaterDate = now.plusYears(1);
        System.out.println("一年以后的日期信息：" + oneYearLaterDate);

        //日期的减法
        LocalDate minusYears = now.minusYears(4);
        System.out.println("5年前的日期信息：" + minusYears);

        boolean before = now.isBefore(oneYearLaterDate);
        System.out.println("当前日期是否在5年以前的日期之前：" + before);

        boolean after = now.isAfter(oneYearLaterDate);
        System.out.println("当前日期是否在5年以前的日期之后：" + after);

    }


}
