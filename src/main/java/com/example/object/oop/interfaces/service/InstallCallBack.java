package com.example.object.oop.interfaces.service;

/**
 * 安装回调
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:13
 */

public class InstallCallBack implements DownloadCompleteCallBack{
    public static final String soft = "IDEA.exe";

    @Override
    public void doloadCompleteCallBack(String data) {
        System.out.println("迅雷下载的数据是：" + data);
        if (soft.equals(data)){
            System.out.println("用户执行安装程序" + data);


        }




    }


}

