package com.mrx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在这里我们使用@SpringBootApplication指定这是一个spring boot的应用程序 Hello world!
 *
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		/**
		 * 在main方法进行启动我们的应用程序
		 */
		SpringApplication.run(App.class, args);
		
	}
}
