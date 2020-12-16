package com.how2java.util;

import java.util.HashMap;
import java.util.Map;

import com.how2java.pojo.Category;
import com.how2java.pojo.Customer;

public class Changebean {
	private static Map mp = new HashMap();
	static {
		mp.put(1, "1~10");
		mp.put(2, "10~100");
		mp.put(3, "100~1000");
		mp.put(4, "1000~5000");
	}
	
	public  static Category Change(Customer customer, Category category) {

		category.setCapital(customer.getCapital());
		category.setCustomeKanjiName(customer.getCustomer_kanji_name());
		category.setCustomerEnglishName(customer.getCustomer_eng_name());
		category.setCustomerNo(customer.getCustomer_no());
		category.setEstablishDate(customer.getEstablish_date());
		category.setEmployeeNumber(mp.get(customer.getEmployee_number()).toString());
		return category;

	}

}
