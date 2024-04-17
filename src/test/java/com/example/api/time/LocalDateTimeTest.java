package com.example.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Java8 时间API-LocalTime常用方法使用的测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:41
 */

public class LocalDateTimeTest {

    @Test
    public void testLocalDateTimeInstance(){
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("当前日期时间信息：" + currentDateTime);

        LocalDateTime customDateTime = LocalDateTime.of(2022, 6, 25, 22, 15, 47);
        System.out.println("自定义日期时间信息：" + customDateTime);
    }

    @Test
    public void testLocalDateTimeGetLocalDateLocalTime(){
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDate currentDate = currentDateTime.toLocalDate();
        LocalTime currentTime = currentDateTime.toLocalTime();

        System.out.println("当前日期信息：" + currentDate);
        System.out.println("当前时间信息：" + currentTime);
    }
}
