package com.rajesh.car;
public class Car {
 private String carName;
 private String carNumber;
 private String carModel;
 private String carCompany;
 Car() {
	
	// TODO Auto-generated constructor stub
 }
 public  Car(String carName, String carNumber, String carModel, String carCompany) {
	super();
	this.carName = carName;
	this.carNumber = carNumber;
	this.carModel = carModel;
	this.carCompany = carCompany;
 }
 public String getCarName() {
	return carName;
 }
 public void setCarName(String carName) {
	this.carName = carName;
 }
 public String getCarNumber() {
	return carNumber;
 }
 public void setCarNumber(String carNumber) {
	this.carNumber = carNumber;
 }
 public String getCarModel() {
	return carModel;
 }
 public void setCarModel(String carModel) {
	this.carModel = carModel;
 }
 public String getCarCompany() {
	return carCompany;
 }
 public void setCarCompany(String carCompany) {
	this.carCompany = carCompany;
 }
 @Override
 public String toString() {
	return "Car [carName=" + carName + ", carNumber=" + carNumber + ", carModel=" + carModel + ", carCompany="
			+ carCompany + "]";
 }
 
 
}
