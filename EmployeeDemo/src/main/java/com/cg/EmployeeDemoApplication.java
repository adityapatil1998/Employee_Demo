package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoApplication.class, args);
		System.out.println("Employee Demo Started");
	}

}
