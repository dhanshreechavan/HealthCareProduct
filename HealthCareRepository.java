package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HealthCareProduct;

@Repository
public interface HealthCareRepository extends JpaRepository<HealthCareProduct ,Integer> {

	//public Employee saveemployee(Employee employee);
	public Optional<HealthCareProduct> findById(Integer id);

	public HealthCareProduct save(Integer id);

	
}
