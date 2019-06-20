package com.danisadreamer.ShoppingCarDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.danisadreamer.ShoppingCarDemo.mapper")

public class ShoppingCarDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCarDemoApplication.class, args);
	}

}
