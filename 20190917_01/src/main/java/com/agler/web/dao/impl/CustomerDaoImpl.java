package com.agler.web.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.agler.web.bean.Customer;
import com.agler.web.dao.CustomerDao;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findOne(String customerId) {
		return this.getHibernateTemplate().get(Customer.class, customerId);
	}
	
}
