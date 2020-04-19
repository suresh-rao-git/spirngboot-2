package com.simplelearning.springboot2.model;

public class Vehicle {

	String vechicleName;
	String vechicleType;
	
	
	public String getVechicleName() {
		return vechicleName;
	}
	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	public String getVechicleType() {
		return vechicleType;
	}
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	@Override
	public String toString() {
		return "Vehicle [vechicleName=" + vechicleName + ", vechicleType=" + vechicleType + "]";
	}
	
	
	
}
