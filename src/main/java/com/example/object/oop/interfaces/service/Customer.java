package com.example.object.oop.interfaces.service;

/**
 * 用户
 *
 * @author MaxBrooks chentingxian195467@163.com
 * since jdk17
 * @version 2022/8/12 16:12
 */

public class Customer {

    private final DownloadCompleteCallBack downloadCompleteCallBack;

    public Customer(DownloadCompleteCallBack downloadCompleteCallBack){
        this.downloadCompleteCallBack = downloadCompleteCallBack;
    }


    /**
     * 根据指定的url下载数据
     * @param url
     */
    public void downloadData(String url){
        Thunder thunder = new Thunder();
        thunder.HandleDownloadData(url,downloadCompleteCallBack);
    }
}
