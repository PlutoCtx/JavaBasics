package com.example.object.oop.interfaces.service;

/**
 * 下载完成回调
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 16:12
 */

public interface DownloadCompleteCallBack {

    /**
     * 迅雷下载完成后相关处理（回调）
     * @param data 下载的数据
     */
    void doloadCompleteCallBack(String data);
}
