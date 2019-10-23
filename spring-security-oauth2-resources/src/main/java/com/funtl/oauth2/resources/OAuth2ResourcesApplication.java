package com.funtl.oauth2.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.funtl.oauth2.resources.mapper")
public class OAuth2ResourcesApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourcesApplication.class,args);
    }
}
