package com.example.api.util;

import org.testng.annotations.Test;

import java.time.Instant;
import java.util.Date;

/**
 * 日期时间工具类常用方法的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/14 9:51
 */

public class DateTimeUtilsTest {


    @Test
    public void testUTCTimeToDate(){

        Instant instant = Instant.now();
        System.out.println(instant);
        //2022-08-14T01:55:59.272315700Z
        String utcTime = "2022-08-14T01:55:59.272Z";
        Date date = DataTimeUtils.utcTimeToDate(utcTime);
        System.out.println("UTC时间" + utcTime + "转换成Date的结果是" + date);
        //java.time.Instant instant = Instant.now();
        //System.out.println(instant);

        //String utcTime = "";
        //DateTimeUtils.utc
    }




    @Test
    public void testDateToUTCTime(){

//        Instant instant = Instant.now();
//        System.out.println(instant);
//        //2022-08-14T01:55:59.272315700Z
//        String utcTime = "2022-08-14T01:55:59.272Z";
        Date date = new Date();
        String utcTime = DataTimeUtils.dateToUtcTime(date);
        System.out.println("当前日期" + date + "转换成UTC时间的结果是" + utcTime);
        //java.time.Instant instant = Instant.now();
        //System.out.println(instant);

        //String utcTime = "";
        //DateTimeUtils.utc
    }

}
