package com.example.oop.interfaces.service;

import com.example.object.oop.interfaces.service.BaiduDiskCallBack;
import com.example.object.oop.interfaces.service.Customer;
import com.example.object.oop.interfaces.service.DownloadCompleteCallBack;
import com.example.object.oop.interfaces.service.InstallCallBack;

/**
 * 回调接口测试用例
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 21:41
 */

public class CustomerTest {
    public static void main(String[] args) {
        //DownloadCompleteCallBack downloadCompleteCallBack = new ReadCallBack();
//        DownloadCompleteCallBack downloadCompleteCallBack = new InstallCallBack();
        DownloadCompleteCallBack downloadCompleteCallBack = new BaiduDiskCallBack();
        Customer max = new Customer(downloadCompleteCallBack);
        max.downloadData("https://www.baidu.com");

        downloadCompleteCallBack = new InstallCallBack();
        max = new Customer(downloadCompleteCallBack);
        max.downloadData("IDEA.exe");

    }

}
