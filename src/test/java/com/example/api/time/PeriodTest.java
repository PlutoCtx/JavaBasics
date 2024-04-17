package com.example.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:43
 */

public class PeriodTest {

    @Test
    public void testPeriodBetween(){
        LocalDate startDate = LocalDate.of(2021, 06, 01);
        LocalDate endDate = LocalDate.of(2024, 07, 19);

        Period period = Period.between(startDate, endDate);
        System.out.println(period);

        System.out.println("两个日期相距的年份：" + period.getYears());
        System.out.println("两个日期相距的月份：" + period.getMonths());
        System.out.println("两个日期相距的天数：" + period.getDays());

    }
}
