package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.HealthCareProduct;
import com.example.demo.service.HealthCareService;

@RestController
//@RequestMapping("/employee")
public class HealthCareController {

	@Autowired
	private HealthCareService healthcareservice;
	
	@PostMapping("/save")
	public ResponseEntity<HealthCareProduct> saveemployee(@RequestBody HealthCareProduct HCP){
		HealthCareProduct h = healthcareservice.saveDetails(HCP);
		 return ResponseEntity.ok().body(h);

	}

	//design Rest API for Retrive details of patient.
	   @GetMapping("/Retrivedetails/{id}")
		public ResponseEntity<Optional<HealthCareProduct>> getDetailsById(@PathVariable("id" )Integer id)
	    {
			Optional<HealthCareProduct> h = healthcareservice.getDetailsById(id);
		    return ResponseEntity.ok().body(h);
		}

	   //design Rest API for Delete details of patient.
	   @DeleteMapping("delete/{id}")
		public void DeleteDetailsById(@PathVariable("id") Integer id ) {
		     healthcareservice.DeleteDetailsByPatientId(id);
			System.out.println("deleted");
		}
		







}