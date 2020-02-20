package com.taehwan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.taehwan.beans.beans2;

@Configuration
@ComponentScan(basePackages = {"com.taehwan.beans"})
public class BeanConfigClass {

	@Bean
	public beans2 b3(){
		return new beans2();
	}
	
	@Bean
	public beans2 b4(){
		return new beans2();
	}
}
