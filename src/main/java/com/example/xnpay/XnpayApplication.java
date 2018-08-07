package com.example.xnpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class XnpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(XnpayApplication.class, args);
	}

	@RequestMapping("/hi")
	public String hi(){
		return "hi gxq";
	}
}
