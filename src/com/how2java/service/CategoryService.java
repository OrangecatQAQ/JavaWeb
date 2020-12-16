package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.pojo.Customer;
import com.how2java.util.Page;

public interface CategoryService {

	List<Customer> list();
	
	List<Customer> search(String string);
    
    void delete(int customer_no);
    
    Customer get(int customer_no); 
    
	int add(Customer Customer);
	
	int update(Customer Customer);   
}
