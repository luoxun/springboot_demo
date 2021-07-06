package com.example.demo;

import com.example.hello.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("luoxun");
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@RequestMapping("/hello")
	public String hello() {
		
		new Hello().test();
		return "Hello World!";
	}
}
