package com.sinfloo.ejemplo01;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		System.setProperty("server.port","3000");
		
		SpringApplication.run(Demo1Application.class, args);
		
	}

}
