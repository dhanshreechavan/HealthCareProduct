package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@Entity
@Table(name="PatientDetails")
public class HealthCareProduct {
	//@JsonSerialize(include = Inclusion. NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
   private String PatientName;
    private String MobileNo;
   private String Age;
   
   // getter and setter methods
   public int getId() {
		return id;
	 }
	 public void setId(int id) {
		this.id = id;
	 }
   public String getPatientName() {
	return PatientName;
 }
 public void setPatientName(String patientName) {
	this.PatientName = patientName;
 }
 
 public String getMobileNo() {
	return MobileNo;
 }
 public void setMobileNo(String MobileNo) {
	this.MobileNo = MobileNo;
 }
 public String getAge() {
	return Age;
 }
  public void setAge(String Age) {
	this.Age = Age;
 }
   @Override
  public String toString() {
	return "HealthCareProduct [id=" + id + ", PatientName=" + PatientName + ", MobileNo=" + MobileNo + ", Age=" + Age
			+ "]";
  }
  
 }
