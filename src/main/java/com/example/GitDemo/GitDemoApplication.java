package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		System.out.println("Hello World");

		System.out.println("Feature Branch");
		System.out.println("new Line addes dev Branch");

	}

}
