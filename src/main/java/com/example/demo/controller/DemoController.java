package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/getTest")
	public ResponseEntity<String> getDate(){
		return new ResponseEntity<>("Hello How are you Ganpat",HttpStatus.OK);
		
	}
}
