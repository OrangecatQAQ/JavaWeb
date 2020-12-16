package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Customer;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public List<Customer> list(){
		return categoryMapper.list();
	};
	@Override
	public List<Customer> search(String string){
		return categoryMapper.search(string);
	};
	

    @Override
    public void delete(int customer_no) {
      categoryMapper.delete(customer_no);   	
    }
    
    @Override
    public Customer get(int customer_no) {
    	return categoryMapper.get(customer_no);   	
    }
    
    @Override
    public int add(Customer Customer) {
    	return categoryMapper.add(Customer);   	
    }
    
    @Override
    public int update(Customer Customer) {
    	return categoryMapper.update(Customer);   	
    }

}
