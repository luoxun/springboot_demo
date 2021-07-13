package com.example.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appinfo.properties")
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class Test {


    private  String name ;


    private  String age;


    {
        System.out.println("TestTestTestTestTest 。。。");
    }



}
