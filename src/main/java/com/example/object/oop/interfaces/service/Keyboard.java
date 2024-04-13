package com.example.object.oop.interfaces.service;

/**
 * 键盘
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:14
 */

public class Keyboard implements USB{
    @Override
    public String getDeviceInfo() {
        return "罗技键盘";
    }
}
