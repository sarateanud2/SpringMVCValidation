package com.spring.mvc.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.objects.Customer;

@Controller
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	private Map<String, Customer> customers = null;

	public CustomerController() {
		customers = new HashMap<String, Customer>();
	}
	
	@RequestMapping(value="/cust/save", method=RequestMethod.GET)
	public String saveCustomerPage(Model model){
		logger.info("Returning custSave.jsp");
		model.addAttribute("customer", new Customer());
		return "custSave";
	}
	
	@RequestMapping(value = "/cust/save.do", method = RequestMethod.POST)
	public String saveCustomerAction(@Valid Customer customer, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			logger.info("Returning custSave.jsp page");
			return "custSave";
		}
		
		logger.info("Returning custSaveSuccess.jsp page");
		model.addAttribute("customer", customer);
		customers.put(customer.getEmail(), customer);
		
		return "custSaveSuccess";
	}
	
	/*
	  
	When we use annotation based form validation, we just need to make little changes in our controller handler method implementation to get it working.
	
	First we need to annotate model object that we want to validate with @Valid annotation. Then we need to have BindingResult argument in the method, spring takes 
	care of populating it with error messages. The handler method logic is very simple, if there are any errors we are responding with the same page or else we are 
	redirecting user to the success page.
	
	Another important point to note is that we are adding "customer" attribute to the model, this is necessary to let Spring framework know which model object to use 
	in the form page. If we won't do it, object binding to form data will not take place and our form validation will not work.
	*/
	
	
}
