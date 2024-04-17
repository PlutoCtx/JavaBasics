package com.example.api.text;

import com.example.api.util.DataTimeUtils;

import java.util.Date;
import java.util.Scanner;

/**
 * 用户输入出生日期，计算出生的天数
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:37
 */

public class CalculateBirthdayTest {

    public static void main(String[] args) {
        System.out.println("输入你的生日，例如1954年06月07日");
        Scanner input = new Scanner(System.in);
        //接收用户输入的日期字符串
        String source = input.next();

        Date birthday = DataTimeUtils.stringToDate(source,DataTimeUtils.STANDARD_DATE_FORMAT);

        Date systemDate = new Date();
        long days = (DataTimeUtils.calculatorTime(birthday.getTime(),systemDate.getTime()))/24/60/60/1000;
        System.out.printf("你的出生日期是%s,你已经活了%d天了\n",source,days);
    }
}
