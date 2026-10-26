package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example")
public class HospitalappointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalappointmentApplication.class, args);
	}

}
