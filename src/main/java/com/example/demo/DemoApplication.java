package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
/* Spring is a framework of framework because it provides support
   to various frameworks such as Hibernate. provides infrastructure
   support for developing Java applications
   Spring Boot lets you create standalone application that run on their own
   without relying on external web server, by embedding a web server such
   as Tomcat or Netty into your app during the initialization process
* */

@SpringBootApplication
public class DemoApplication {
	// SpringApplication Builder is used to build the Spring Application.
	// The command line argument are passed with spring-boot
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
