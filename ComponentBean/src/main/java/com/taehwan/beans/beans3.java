package com.taehwan.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class beans3 {
	public beans3() {
		System.out.println("@ beans3.java");
	}
}
