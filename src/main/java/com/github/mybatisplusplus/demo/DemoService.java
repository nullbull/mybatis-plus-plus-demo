package com.github.mybatisplusplus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author niuzhenhao
 * @date 2020/9/21 11:17
 * @desc
 */

@SpringBootApplication
@MapperScan(basePackages = "com.github.mybatisplusplus.demo.dao")
public class DemoService {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoService.class, args);
    }
}
