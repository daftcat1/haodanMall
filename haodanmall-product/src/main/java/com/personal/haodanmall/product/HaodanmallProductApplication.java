package com.personal.haodanmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.personal.haodanmall.product.dao")
@SpringBootApplication
public class HaodanmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaodanmallProductApplication.class, args);
    }

}
