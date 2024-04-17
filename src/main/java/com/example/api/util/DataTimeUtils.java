package com.example.api.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期/时间工具类
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:59
 */

public class DataTimeUtils {
    /**
     * 标准日期时间格式
     */
    public static final String STANDARD_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String STANDARD_DATE_FORMAT = "yyyy年MM月dd日";
    public static final String STANDARD_TIME_FORMAT = "HH时mm分ss秒";
    public static final String STANDARD_DATE_T_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String STANDARD_DATE_T_TIME_MIL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    public static final String STANDARD_UTC_DATE_T_TIME_MIL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";


    /**
     * 统计程序的耗时
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return  返回耗时
     */
    public static long calculatorTime(long startTime,long endTime){
        if (startTime > endTime){
            throw new RuntimeException("参数非法");
        }
//        System.out.println("开始时间：" + startTime);
//        System.out.println("结束时间：" + endTime);
        long time = endTime - startTime;
//        System.out.println("耗时：" + time + "毫秒");
        return time;
    }

    /**
     * 将指定的日期对象按照标准的日期格式转换成日期字符串
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat(STANDARD_DATE_TIME_FORMAT);
        return dateFormat.format(date);
    }

    /**
     * 将指定的日期对象按照指定的日期格式转换成日期字符串
     * @param date
     * @return
     */
    public static String dateToString(Date date,String pattern){
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * 将日期字符串按照指定的日期格式转换成指定的日期对象
     * @param source  日期字符串
     * @param pattern 日期格式
     * @return parseDate
     */
    public static Date stringToDate(String source,String pattern){
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date parseDate = null;
        try {
            parseDate = dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }

    /**
     * 将UTC时间字符串转换为java.util.Date对象
     * @param utcTime
     * @return
     */
    public static Date utcTimeToDate(String utcTime){
        DateTime dateTime = DateTime.parse(utcTime, DateTimeFormat.forPattern(STANDARD_UTC_DATE_T_TIME_MIL_FORMAT));
        Date date = dateTime.toDate();
        return date;
    }

    /**
     * 将Date转换成UTC时间
     * @param date
     * @return
     */
    public static String dateToUtcTime(Date date){
        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        return dateTime.toString();
    }
}
