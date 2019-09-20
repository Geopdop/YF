package com.agler.web.dao;

import com.agler.web.bean.Customer;

public interface CustomerDao {

	Customer findOne(String customerId);

}
