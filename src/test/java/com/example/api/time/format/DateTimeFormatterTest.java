package com.example.api.time.format;

import com.example.api.util.DataTimeUtils;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:44
 */

public class DateTimeFormatterTest {
    LocalDate currentDate = LocalDate.now();

    LocalTime currentTime = LocalTime.now();

    LocalDateTime currentDateTime = LocalDateTime.now();

    @Test
    public void testLocalDateFormat(){
        System.out.println("标准时间日期格式：" + currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //public static final String STANDARD_DATE_FORMAT = "yyyy年MM月dd日";
        //DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_FORMAT);
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("自定义日期格式：" + currentDate.format(customDateTimeFormatter));
    }


    @Test
    public void testLocalDateParse(){
//        标准日期格式：2022-08-01
//        自定义日期格式：2022年08月01日
        System.out.println("日期字符串转换为LocalDate对象后日期信息：" + LocalDate.parse("2022-08-01"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("日期字符串转换为LocalDate对象后日期信息：" + LocalDate.parse("2022年08月01日",customDateTimeFormatter));
    }

    @Test
    public void testLocalTimeFormat(){
        System.out.println("标准时间日期格式：" + currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        //public static final String STANDARD_DATE_FORMAT = "yyyy年MM月dd日";
        //DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_FORMAT);
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println("自定义日期格式：" + currentTime.format(customDateTimeFormatter));
    }


    @Test
    public void testLocalTimeParse(){
        /**
         * 标准时间日期格式：08:45:42.187183
         * 自定义日期格式：08时45分42秒
         */
        System.out.println("日期字符串转换为LocalTime对象后日期信息：" + LocalTime.parse("08:45:42.187183"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println("日期字符串转换为LocalTime对象后日期信息：" + LocalTime.parse("08时45分42秒",customDateTimeFormatter));
    }

    /**
     * LocalDateTime转字符串
     */
    @Test
    public void testLocalDateTimeFormat(){
        System.out.println("标准时间日期格式：" + currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println("自定义日期格式：" + currentDateTime.format(customDateTimeFormatter));
    }

    /**
     * 字符串转LocalDateTime
     */
    @Test
    public void testLocalDateTimeParse(){
        /*
         * 标准时间日期格式：2022-08-02T08:55:45.1618688
         * 自定义日期格式：2022-08-02T08:55:45
         */
        System.out.println("日期字符串转换为LocalDateTime对象后日期时间信息：" + LocalDateTime.parse("2022-08-02T08:55:45.1618688"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println("日期字符串转换为LocalDateTime对象后日期时间信息：" + LocalTime.parse("2022-08-02T08:55:45",customDateTimeFormatter));

        //2022-08-02T08:55:45.161
        customDateTimeFormatter = DateTimeFormatter.ofPattern(DataTimeUtils.STANDARD_DATE_T_TIME_MIL_FORMAT);
        System.out.println("日期字符串转换为LocalDateTime对象后日期时间信息：" + LocalDateTime.parse("2022-08-02T08:55:45.161",customDateTimeFormatter));
    }
}
