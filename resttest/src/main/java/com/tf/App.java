package com.tf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("resttest开始加载......");
		SpringApplication.run(App.class, args);
		System.out.println("resttest加载完毕......");
	}
}
