package com.example.oop.interfaces.service;

import com.example.object.oop.interfaces.service.Computer;
import com.example.object.oop.interfaces.service.HardDisk;
import com.example.object.oop.interfaces.service.Mouse;
import com.example.object.oop.interfaces.service.USB;

/**
 * 接口的案例;接口作为方法的形参
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 21:40
 */

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        USB usb1 = new Mouse();
        USB usb2 = new HardDisk();
        computer.showComputerDeviceInfo(usb1,usb2);
    }
}
