package com.springbootprojectdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mapper")
public class SpringbootProjectDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectDemo01Application.class, args);
    }

}
