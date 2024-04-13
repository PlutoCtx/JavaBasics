package com.example.object.oop.interfaces.service;

/**
 * 硬盘
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:13
 */

public class HardDisk implements USB{
    @Override
    public String getDeviceInfo() {
        return "希捷4T硬盘";
    }
}
