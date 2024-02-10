package com.course.courseapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.course.courseapplication.controller" })

public class CourseapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseapplicationApplication.class, args);
	}

}
