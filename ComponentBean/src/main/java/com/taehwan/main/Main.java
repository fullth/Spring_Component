package com.taehwan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.taehwan.beans.beans;
import com.taehwan.beans.beans3;
import com.taehwan.beans.beans4;
import com.taehwan.beans.beans5;
import com.taehwan.config.BeanConfigClass;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		beans b1 = context.getBean(beans.class);
		System.out.println("@ b1 Address:" + b1);
		//beans로 객체 하나를 더 생성해도 주소값이 같게 나옴. 컴포넌트의 기본이 싱글톤이기 때문에
		//이름만 다른 객체지 같은 번지의 주소를 공유하게 되는 현상이 일어남.
		
		beans3 b5 = context.getBean(beans3.class);
		System.out.println(b5);
		
		beans3 b6 = context.getBean(beans3.class);
		System.out.println(b6);
		
		beans4 b7 = context.getBean(beans4.class);
		System.out.println("b7:" + b7);
		
		beans4 b8 = context.getBean(beans4.class);
		System.out.println("b8:" + b8);
		
		beans5 b9 = context.getBean(beans5.class);
		System.out.println("b9:" + b9);
		
		context.close();
	}

}
