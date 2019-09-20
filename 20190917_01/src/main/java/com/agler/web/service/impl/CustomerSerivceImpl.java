package com.agler.web.service.impl;

import com.agler.web.bean.Customer;
import com.agler.web.dao.CustomerDao;
import com.agler.web.service.CustomerService;

public class CustomerSerivceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findOne(String customerId) {
		return this.customerDao.findOne(customerId);
	}
	
}
