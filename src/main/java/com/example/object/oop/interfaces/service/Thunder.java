package com.example.object.oop.interfaces.service;

/**
 * 迅雷
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:16
 */

public class Thunder {

    /**
     * 根据用户传递的url下载数据
     * @param url
     */
    public void HandleDownloadData(String url,DownloadCompleteCallBack downloadCompleteCallBack){
        System.out.println("解析地址" + url);
        System.out.println("正在下载数据...");
        String data = "IDEA.exe";
//        String data = "Java编程的逻辑.pdf";
        System.out.println(data + "已经下载完成");
        //回调
        downloadCompleteCallBack.doloadCompleteCallBack(data);
    }
}

