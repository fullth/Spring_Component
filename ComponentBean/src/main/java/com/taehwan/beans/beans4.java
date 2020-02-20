package com.taehwan.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class beans4 {
	public beans4() {
		System.out.println("@ beans4.java");
	}
}
