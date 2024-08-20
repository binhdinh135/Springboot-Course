package com.example.springboot.lession3configbean;

public class H2Connector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới H2 DB: " + getUrl());

    }
}
