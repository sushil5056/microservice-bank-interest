package com.microservice.bankinterest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bankinterest.entity.InterestDetails;
import com.microservice.bankinterest.repository.InterestRepo;

@Service
public class InterestService {
	
	
	@Autowired
	InterestRepo interestRepo;
	
	public InterestDetails getInterestDetails(String bankName) {
		
		return interestRepo.getBybankName(bankName);
	}

}
