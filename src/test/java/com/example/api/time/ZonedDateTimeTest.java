package com.example.api.time;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/**
 * 带时区的日期时间API常用方法测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/13 19:55
 */

public class ZonedDateTimeTest {

    @Test
    public void testGetZonedInfo(){
        Set<String> availableZonedIds = ZoneId.getAvailableZoneIds();
        //无序打印时区信息
//        for (String availableZoneId : availableZonedIds) {
//            System.out.println(availableZoneId);
//        }

        TreeSet<String> availableZonedIdsTreeSet = new TreeSet<>(availableZonedIds);
        //将可用的时区信息变成有序并且打印输出在控制台，没行打印一个时区
        availableZonedIdsTreeSet.forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println("东京的时区信息：" + zoneId);
        ZoneId defaultZonedId = ZoneId.systemDefault();
        System.out.println("系统默认的时区信息：" + defaultZonedId);


    }


    @Test
    public void testZonedDateTimeGetInstance(){

        ZonedDateTime defaultZonedDateTime = ZonedDateTime.now();
        System.out.println("系统默认时区的日期时间信息：" + defaultZonedDateTime);
        ZoneId tokyoZonedId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZonedDateTime = ZonedDateTime.now(tokyoZonedId);
        System.out.println("亚洲/东京时区的日期时间信息：" + tokyoZonedDateTime);


        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime wrapperCurrentDateTimeToTokyoZoneDateTime = ZonedDateTime.of(currentDateTime,tokyoZonedId);
        System.out.println("将当前日期时间包装成亚洲/东京时区的日期时间：" + wrapperCurrentDateTimeToTokyoZoneDateTime);


    }



































}
