package com.example.graphQLExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.graphQLExample")
public class GraphQlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlExampleApplication.class, args);
	}
}
