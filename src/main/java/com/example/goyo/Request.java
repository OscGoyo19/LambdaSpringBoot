package com.example.goyo;

import java.io.Serializable;

public class Request implements Serializable {
	private int numberOne;
	private int numberTwo;
	public Request() {
		super();
	}
	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
}
