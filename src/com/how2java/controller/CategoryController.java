package com.how2java.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.pojo.Customer;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	 public ModelAndView listCategory(Page page){
	     
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Customer> cs= categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
         
        page.caculateLast(total);
        page.caculateNow(page.getStart());
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }
	@RequestMapping("deleteCategory")
	 public ModelAndView deleteCategory(Page page, int customer_no){	    
       categoryService.delete(customer_no);         
       ModelAndView mav = new ModelAndView("redirect:listCategory");
       return mav;
   }
	@RequestMapping("detailCategory")
	 public ModelAndView detailCategory(int customer_no){
	     
      ModelAndView mav = new ModelAndView();
      

      Category cs = com.how2java.util.Changebean.Change(categoryService.get(customer_no), new Category());
      
      
      
       
      // 放入转发参数
      mav.addObject("cs", cs);
      // 放入jsp路径
      mav.setViewName("detail");
      return mav;
  }
	@RequestMapping("searchCategory")
	 public ModelAndView searchCategory(Page page, Customer customer){
	     
       ModelAndView mav = new ModelAndView("Search");
       List<Customer> cs= categoryService.search(customer.getCustomer_eng_name());                 
       page.caculateLast(cs.size());
       System.out.println(cs.size());

       // 放入转发参数
       mav.addObject("cs", cs);
       return mav;
   }
	@RequestMapping("createCategory")
	 public ModelAndView createCategory(Customer customer){
	     

      categoryService.add(customer);

      ModelAndView mav = new ModelAndView("redirect:listCategory");
      return mav;
  }
	@RequestMapping("create")
	 public ModelAndView create(){
	     

	 ModelAndView mav = new ModelAndView("Create");
     return mav;
 }
	@RequestMapping("updatesearchCategory")
	 public ModelAndView updatesearchCategory(int customer_no){	   
		ModelAndView mav = new ModelAndView();
		Customer cs = categoryService.get(customer_no);         
		mav.addObject("cs", cs);
	      // 放入jsp路径
	     mav.setViewName("update");
      return mav;
  }
	@RequestMapping("updateCategory")
	 public ModelAndView updateCategory(Customer customer){	   

		categoryService.update(customer);         
		ModelAndView mav = new ModelAndView("redirect:listCategory");
	    return mav;
 }
	
	

}
