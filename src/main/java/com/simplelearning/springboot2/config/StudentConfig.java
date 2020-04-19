package com.simplelearning.springboot2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.simplelearning.springboot2.condition.StudentCondition;

@Configuration
public class StudentConfig {
	
	@Conditional( StudentCondition.class)
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
