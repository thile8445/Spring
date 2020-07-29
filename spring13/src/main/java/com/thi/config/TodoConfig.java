package com.thi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thi.model.TodoValidator;
@Configuration
public class TodoConfig {
	@Bean
	public  TodoValidator validator() {
		return new TodoValidator();
	}
}
