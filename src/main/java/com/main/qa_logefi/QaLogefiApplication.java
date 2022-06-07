package com.main.qa_logefi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.main.qa_logefi.dao")
@SpringBootApplication
public class QaLogefiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QaLogefiApplication.class, args);
    }

}
