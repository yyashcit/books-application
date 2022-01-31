package com.test.springbootdockermaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}
@GetMapping("/hello")
	public String hello()
	{
		return "hello docker maven";
	}
}
