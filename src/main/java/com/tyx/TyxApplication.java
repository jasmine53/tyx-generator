package com.tyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tyx.dao")
public class TyxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyxApplication.class, args);
	}
}
