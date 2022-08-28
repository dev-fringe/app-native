package dev.fringe.app;

import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppNative implements InitializingBean{
	public static void main(String[] args) {
		System.out.println("Hello World");
//		new AnnotationConfigApplicationContext(AppNative.class); //don't works needs spring-native
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello World");
	}
	
}
