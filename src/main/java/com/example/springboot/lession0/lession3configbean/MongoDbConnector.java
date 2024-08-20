package com.example.springboot.lession0.lession3configbean;

public class MongoDbConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Mongo DB: " + getUrl());

    }
}
