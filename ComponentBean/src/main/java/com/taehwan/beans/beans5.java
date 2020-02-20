package com.taehwan.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class beans5 {
	public beans5() {
		System.out.println("@ beans5.java");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("@ init() beans5.java");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@ destroy() beans5.java");
	}
}
