package com.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CarId {
	

	private int modelNum;
	
	private int engineNum;

	public CarId() {
		
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public int getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(int engineNum) {
		this.engineNum = engineNum;
	}

	public CarId(int modelNum, int engineNum) {
		super();
		this.modelNum = modelNum;
		this.engineNum = engineNum;
	}

	@Override
	public String toString() {
		return "CarId [modelNum=" + modelNum + ", engineNum=" + engineNum + "]";
	}
	
	
	

}
