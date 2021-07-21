package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringStarterProjectApplication {

	@RequestMapping("/")
	@ResponseBody
	String homepage() {
		return "Welcome to SpringBoot";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectApplication.class, args);
	}

}
