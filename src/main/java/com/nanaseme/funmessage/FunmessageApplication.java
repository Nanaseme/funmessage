package com.nanaseme.funmessage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nanaseme")
@MapperScan({"com.nanaseme.*.dao"})
public class FunmessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunmessageApplication.class, args);
    }

}
