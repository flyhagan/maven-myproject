package com.shiyanlou.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyanlou.customer.dao.CustomerDAO;
@Service("AAA")
public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;
	public void setCustomerDAO(CustomerDAO customerDAO){
		this.customerDAO =  customerDAO;
	}
	@Override
	public String toString(){
		return "CutomerService [customerDAO=" + customerDAO +"]";
	}
}
