package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	//PAdilla fork inf
	
	  @GetMapping("/hello")
	  String all() {
	    return "HOLA";
	  }

}
