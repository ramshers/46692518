package com.example.demo;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.services.SayHelloService;

@SpringBootApplication
public class SpringBootWithAOP {

	@Autowired
	SayHelloService service;
	
	String message;
    static String name;

	public static void main(String[] args) {
		name="George";
		SpringApplication.run(SpringBootWithAOP.class, args);
	}
	
	@PostConstruct
	public void init() {
		service.message(name);
	}
}
