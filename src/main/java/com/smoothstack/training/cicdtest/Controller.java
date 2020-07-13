package com.smoothstack.training.cicdtest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public ResponseEntity<String> test() {
		String result = String.join("\n", "I'm a Spring Boot app." + System.getenv("VARIABLE"));
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
