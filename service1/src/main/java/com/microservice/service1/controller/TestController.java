package com.microservice.service1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.service1.modals.Testmodal;

@RestController
@RequestMapping("/v1/mylist")
public class TestController {
	
	@GetMapping
	public Testmodal getMyListController(HttpServletRequest request) {
		Testmodal testmodal = new Testmodal();
		testmodal.setFirstname("Vijay");
		testmodal.setLastname("Channamsetty");
		return testmodal;
	}
	
}
