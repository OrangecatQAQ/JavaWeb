package com.how2java.pojo;

public class Customer {
	
	
	private String customer_no = "";
	private String customer_eng_name = "";
	private String customer_kanji_name = "";
	private String establish_date = "";	
	private int employee_number = 0;
	private double capital = 0.0;
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	public String getCustomer_eng_name() {
		return customer_eng_name;
	}
	public void setCustomer_eng_name(String customer_eng_name) {
		this.customer_eng_name = customer_eng_name;
	}
	public String getCustomer_kanji_name() {
		return customer_kanji_name;
	}
	public void setCustomer_kanji_name(String customer_kanji_name) {
		this.customer_kanji_name = customer_kanji_name;
	}
	public String getEstablish_date() {
		return establish_date;
	}
	public void setEstablish_date(String establish_date) {
		this.establish_date = establish_date;
	}
	public int getEmployee_number() {
		return employee_number;
	}
	public void setEmployee_number(int employee_number) {
		this.employee_number = employee_number;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
}
