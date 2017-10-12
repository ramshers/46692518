package com.example.demo.services;
import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
	public String message(String name) {
		System.out.println("Hello Dear User - " + name );
		return "Hello Dear User - " + name ;
	}
}
