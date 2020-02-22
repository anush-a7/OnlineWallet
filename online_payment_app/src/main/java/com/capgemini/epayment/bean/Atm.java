package com.capgemini.epayment.bean;

public class Atm {
	private long atmNumber;
	private int cvv;

	public long getAtmNumber() {
		return atmNumber;
	}

	public void setAtmNumber(long atmNumber) {
		this.atmNumber = atmNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Atm [atmNumber=" + atmNumber + ", cvv=" + cvv + "]";
	}

}
