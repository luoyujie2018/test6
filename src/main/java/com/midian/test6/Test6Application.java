package com.midian.test6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.midian.student.dao")
@ComponentScan(basePackages = {"com.midian.student"})
@SpringBootApplication
public class Test6Application {

    public static void main(String[] args) {
        SpringApplication.run(Test6Application.class, args);
    }

}
