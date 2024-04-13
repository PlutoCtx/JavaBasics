package com.example.object.oop.enums;

/**
 * 注册来源
 *
 * @author MaxBrooks chentingxian195467.163.com
 * since jdk17
 * @version 2022/8/12 15:31
 */
public enum RegisterSource {
    ANDROID_APP("安卓客户端"),IOS_APP("IOS客户端"),PC("PC端"),UNKNOWN("未知客户端");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    RegisterSource(String description){
        this.description = description;
    }

}
