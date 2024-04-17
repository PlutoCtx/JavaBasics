package com.example.joda.time;

import com.example.api.util.DataTimeUtils;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import java.time.LocalDate;

/**
 * Joda-Time常用API的方法使用测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 9:12
 */

public class JodaTimeTest {

    @Test
    public void testDateTime(){
        DateTime currentDateTime = DateTime.now();
        System.out.println("今天的日期时间信息：" + currentDateTime.toString(DataTimeUtils.STANDARD_DATE_TIME_FORMAT));

        DateTime tomorrowDateTime = currentDateTime.plusDays(1);
        System.out.println("明天的日期时间信息：" + tomorrowDateTime.toString(DataTimeUtils.STANDARD_DATE_TIME_FORMAT));
    }


    /**
     * LocalDate的日期计算
     */
    @Test
    public void testLocalDate(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("当前日期信息：" + currentDate);

        //计算当前日期的3个月后的最后一天
        LocalDate threeMonthAfterLastDay = currentDate.plusMonths(3);//.withDayOfMonth(3);
        //LocalDate threeMonthAfterLastDay = currentDate.plusMonths(3).dayOfMonth().withMaxMonthAfterLastDay;
        System.out.println("计算当前日期的3个月后" + threeMonthAfterLastDay);

        //计算当前日期的2个月前的第一天
        LocalDate twoMonthAgo = currentDate.minusMonths(2).withDayOfMonth(2);
        System.out.println("计算当前日期的2个月前" + twoMonthAgo);

    }






}
