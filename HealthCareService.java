package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.HealthCareProduct;

public interface HealthCareService {

	
	public HealthCareProduct  saveDetails(HealthCareProduct HCP);

	public void DeleteDetailsByPatientId(Integer id);

	public Optional<HealthCareProduct> getDetailsById(Integer id);
}
