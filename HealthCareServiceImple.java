package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.HealthCareRepository;
import com.example.demo.model.HealthCareProduct;

@Service
public class HealthCareServiceImple implements HealthCareService{

	
	@Autowired
	private HealthCareRepository healthcarerepository;
	
	

	@Override
	public HealthCareProduct saveDetails(HealthCareProduct HCP) {
		return healthcarerepository.save(HCP);
	}


	@Override
	public void DeleteDetailsByPatientId(Integer id) {
		healthcarerepository.deleteById(id);

	}

	@Override
	public Optional<HealthCareProduct> getDetailsById(Integer id) {
		return healthcarerepository.findById(id);
	}

}
