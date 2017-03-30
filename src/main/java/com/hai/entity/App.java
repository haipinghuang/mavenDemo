package com.hai.entity;

public class App {
    private Integer id;

    private String appName;

    private String appKey;

    public App(Integer id, String appName, String appKey) {
        this.id = id;
        this.appName = appName;
        this.appKey = appKey;
    }

    public App() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                ", appName='" + appName + '\'' +
                ", appKey='" + appKey + '\'' +
                '}';
    }
}