package com.karnan.rentcloud.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karnan.rentcloud.commons.model.Customer;
import com.karnan.rentcloud.profileservice.service.CustomerService;

@RestController
@RequestMapping(value = "/service")
public class ProfileController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
}
