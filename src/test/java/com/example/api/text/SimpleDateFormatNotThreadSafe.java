package com.example.api.text;

import com.example.api.util.DataTimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat的线程安全问题
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:39
 */

public class SimpleDateFormatNotThreadSafe {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat(DataTimeUtils.STANDARD_DATE_FORMAT);


        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Date parseDate = dateFormat.parse("2022年07月30日");
                        System.out.println("将日期字符串转换成日期对象的结果：" + parseDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }

    }


}
