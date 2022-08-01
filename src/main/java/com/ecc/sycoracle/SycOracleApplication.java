package com.ecc.sycoracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ecc.sycoracle.mapper")
public class SycOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SycOracleApplication.class, args);
    }

}
