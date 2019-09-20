package com.agler.web.service;

import com.agler.web.bean.Customer;

public interface CustomerService {

	Customer findOne(String customerId);

}
