package com.how2java.pojo;

public class Category {
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerEnglishName() {
		return customerEnglishName;
	}
	public void setCustomerEnglishName(String customerEnglishName) {
		this.customerEnglishName = customerEnglishName;
	}
	public String getCustomeKanjiName() {
		return customeKanjiName;
	}
	public void setCustomeKanjiName(String customeKanjiName) {
		this.customeKanjiName = customeKanjiName;
	}
	
	public String getEstablishDate() {
		return establishDate;
	}
	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	private String customerNo = "";
	private String customerEnglishName = "";
	private String customeKanjiName = "";
	private String establishDate = "";	
	private String employeeNumber = "";
	private double capital = 0.0;	
}
