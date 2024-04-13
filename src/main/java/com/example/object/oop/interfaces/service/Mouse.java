package com.example.object.oop.interfaces.service;

/**
 * 鼠标
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:14
 */

public class Mouse implements USB{
    @Override
    public String getDeviceInfo() {
        return "罗技鼠标";
    }
}
