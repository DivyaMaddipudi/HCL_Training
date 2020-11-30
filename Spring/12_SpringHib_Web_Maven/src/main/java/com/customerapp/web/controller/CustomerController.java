package com.customerapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.customerapp.model.dao.Customer;
import com.customerapp.model.service.CustomerService;

@Controller
public class CustomerController {
	
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/")
	public String home() {
		return "redirect:/allcustomers";
	}
	
	@GetMapping(value = "allcustomers")
	public ModelAndView getAllCustomers(ModelAndView mv) {
		List<Customer> customers = customerService.getAllCustomers();
		mv.addObject("customers", customers);
		mv.setViewName("showcustomers");
		return mv;
	}
	
	
	@GetMapping("addcustomer")
	public String addCustomerGet(ModelMap map) {
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}
	
	@PostMapping("addcustomer")
	public String addCustomerPost(@ModelAttribute("customer") Customer customer) {
		
		if(customer.getCustomerId() == 0) {
			customerService.addCustomer(customer);
			
		} else {
			System.out.println(customer.getCustomerId());
			customerService.updateCustomer(customer.getCustomerId(), customer);
		}
		return "redirect:/allcustomers";
	}
	
	@GetMapping("deletecustomer")
	public String deleteCustomer(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		customerService.deleteCustomer(id);
		return "redirect:/allcustomers";
	}
	
	@GetMapping("updatecustomer")
	public String updateCustomerGet(HttpServletRequest req, ModelMap map) {
		int id = Integer.parseInt(req.getParameter("id"));
		Customer customer = customerService.getCustomerById(id);
		map.addAttribute("customer", customer);
		return "updatecustomer";
	}
	
	@GetMapping("searchcustomer")
	public ModelAndView getCustomerByName(HttpServletRequest req, ModelAndView mv) {
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		
		System.out.println(name);
		System.out.println(phone);
		
		Customer customerByNameAndPhone = customerService.getCustomerByNameAndPhone(name, phone);
		mv.addObject("customerByNameAndPhone", customerByNameAndPhone);
		mv.setViewName("searchcustomer");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(customerByNameAndPhone);
		return mv;
	}
	
}
