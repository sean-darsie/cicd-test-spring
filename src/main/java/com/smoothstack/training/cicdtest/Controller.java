package com.smoothstack.training.cicdtest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello from the backend", HttpStatus.OK);
	}

}
