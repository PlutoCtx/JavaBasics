package com.example.api.time;

import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 查找并修改成特殊的日期API测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 8:17
 */

public class TemporalAdjustersTest {

    /**
     * 测试TemporalAdjustersTest的常用方法
     */
    @Test
    public void testTemporalAdjustersTest(){

        LocalDate currentDate = LocalDate.now();
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        //2022年8月1日
        System.out.println("将当前日期改成这个月的第一天的日期信息" + currentDate.with(temporalAdjuster));
        //2022年9月1日
        System.out.println("将当前日期改成下个月的第一天的日期信息" + currentDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        //2022年1月1日
        System.out.println("将当前日期改成今年的第一天的日期信息" + currentDate.with(TemporalAdjusters.firstDayOfYear()));

        System.out.println("将当前日期改成本月的第一次星期X的日期信息" + currentDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY)));
        System.out.println("将当前日期改成本月的最后一次星期X的日期信息" + currentDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY)));


        //2023年1月1日
        System.out.println("将当前日期改成今年的第一天的日期信息" + currentDate.with(TemporalAdjusters.firstDayOfYear()));

        //2022年8月1日
        System.out.println("将当前日期改成这个月的最后一天的日期信息" + currentDate.with(TemporalAdjusters.lastDayOfMonth()));
        //2022年9月1日
        System.out.println("将当前日期改成这个月的最后一天的日期信息" + currentDate.with(TemporalAdjusters.lastDayOfMonth()));
        //2022年1月1日
        System.out.println("将当前日期改成今年的最后一天的日期信息" + currentDate.with(TemporalAdjusters.lastDayOfYear()));

    }

































}
