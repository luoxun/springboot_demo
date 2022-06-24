package com.example.demo;

import com.example.conf.Test;
import com.example.models.Users;
import com.example.mybatis.mapper.UsersMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@ComponentScan(value = "com.example")
@MapperScan("com.example.mybatis.mapper")
@EnableConfigurationProperties(Test.class)
@Slf4j
public class DemoApplication {

	// @Autowired
	// private UsersMapper usersMapper;

	@Autowired
	private Test test;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {

		// System.out.println(test.getAge());
		System.out.println("/***************************************************/");
		// log.info("-------");

		RunnableDemo r1 = new RunnableDemo("name 1");

		r1.start();
		RunnableDemo r2 = new RunnableDemo("name 2");
		r2.start();

		// RunnableDemo::start()
		return "{\"code\":200,\"message\":\"success version\"}";

		// return "google";
	}

	@RequestMapping(value = "/google2", method = RequestMethod.POST)
	public String hellos() {

		return "2";
	}
}
