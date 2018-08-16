package com.example.apisample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@Configuration
@EnableSwagger2
public class ApiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSampleApplication.class, args);
	}

	@RequestMapping("/sample")
	public String sample(){
		return "sample";
	}

	@Bean
	public Docket sampleApi (){
		return new Docket(DocumentationType.SWAGGER_2);
	}
	@Bean
	public Docket testerApi (){
		return new Docket(DocumentationType.SWAGGER_2).groupName("tester");
	}
}
