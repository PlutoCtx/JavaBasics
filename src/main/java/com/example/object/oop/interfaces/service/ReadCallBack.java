package com.example.object.oop.interfaces.service;

/**
 * 读取文件回调
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:15
 */

public class ReadCallBack implements DownloadCompleteCallBack{
    @Override
    public void doloadCompleteCallBack(String data) {
        System.out.println("下载的数据是" + data);
        System.out.println("用户正在使用PDF工具阅读" + data);
    }
}
