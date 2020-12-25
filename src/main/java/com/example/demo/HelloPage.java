package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPage {
	
	@RequestMapping(path = "/pagehahas", method = RequestMethod.GET)
	public String helloIndex() {
		return "ha ha page";
	}

}
