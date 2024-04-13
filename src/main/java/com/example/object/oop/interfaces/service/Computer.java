package com.example.object.oop.interfaces.service;

/**
 * 电脑
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:11
 */

public class Computer {
    public void showComputerDeviceInfo(USB usb1,USB usb2){
        System.out.println("电脑的第一个连接接口连接的是：" + usb1.getDeviceInfo());
        System.out.println("电脑的第二个连接接口连接的是：" + usb2.getDeviceInfo());

    }




}
