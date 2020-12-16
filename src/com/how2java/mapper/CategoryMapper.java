package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.pojo.Customer;
import com.how2java.util.Page;
 
public interface CategoryMapper {
 
      
    public int add(Customer Customer);  
       
      
    public void delete(int customer_no);  
       
      
    public Customer get(int customer_no);  
     
      
    public int update(Customer Customer);   
       
      
    public List<Customer> list();
    
    public List<Customer> search(String string);
    
      
    public int count();  
    
    
    
    
    
}