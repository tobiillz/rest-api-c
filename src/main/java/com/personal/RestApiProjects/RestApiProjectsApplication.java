package com.personal.RestApiProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RestApiProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiProjectsApplication.class, args);
		System.out.println("Calm down!!!");
	}

	@GetMapping("/simple")
	public String simpleRequest(){
		return "ok";
	}

	@GetMapping("/api/v1/student/name")
	public String name(@RequestParam(name="name") String nametext){
		return "Name: "+ nametext;
	}

	@GetMapping("/api/v1/student/phone")
	public String phone(@RequestParam(name="phone") String phone_number){
		return "Name: "+ phone_number;
	}
	@GetMapping("/api/v1/student/name/{username}")
	public String pathVar(@PathVariable(name= "username") String name){
		return "Name: " + name;
	}
}
