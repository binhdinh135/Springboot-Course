package com.example.springboot.lession0.lession3configbean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class DatabaseConnector {

    private String url;
    /**
     * Hàm này có nhiệm vụ Connect tới một Database bất kỳ
     */
    public abstract void connect();

}
