package com.example.zuultest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableZuulProxy
@Configuration
public class ZuulTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulTestApplication.class, args);
	}
}
