package com.microservice.bankinterest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bankinterest.entity.InterestDetails;
import com.microservice.bankinterest.service.InterestService;

@RestController
@RequestMapping("/api")
public class InterestController {
	
	
	@Autowired
	InterestService interestService; 
	
	@GetMapping("/interest/{bankName}")
	public InterestDetails getInterest(@PathVariable String bankName) {
		
		return interestService.getInterestDetails(bankName); 
	}

}
