package com.example.springboot.lession0.lession3configbean;

public class MySqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới MySql: " + getUrl());
    }
}
