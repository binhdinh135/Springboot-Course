package com.example.springboot.lession3configbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${binhdc.mysql.url}")
    String myUrl;

    @Bean
    SimpleBean simpleBeanConfigure() {
        // Khởi tạo một instance của SimpleBean và trả ra ngoài
        return new SimpleBean("Dinh Cong Binh");
    }

    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:33060/binhdc");
        // Set username, password, format, v.v...
        return mySqlConnector;
    }

    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017/binhdc");
        // Set username, password, format, v.v...
        return mongoDbConnector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure(){
        DatabaseConnector postgreSqlConnector = new PostGreSqlConnector();
        postgreSqlConnector.setUrl("postgresql://localhost/binhdc");
        // Set username, password, format, v.v...
        return postgreSqlConnector;
    }

    @Bean("h2Connector")
    DatabaseConnector h2Configure() {
        DatabaseConnector h2Connector = new H2Connector();
        // Set Url
        System.out.println("Config Mysql Url: " + myUrl);
        h2Connector.setUrl(myUrl);
        // Set username, password, format, v.v...
        return h2Connector;
    }
}
