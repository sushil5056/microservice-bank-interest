package com.microservice.bankinterest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bankinterest.entity.InterestDetails;

@Repository
public interface InterestRepo extends JpaRepository<InterestDetails, Integer> {

	public InterestDetails getBybankName(String bankName);

}
