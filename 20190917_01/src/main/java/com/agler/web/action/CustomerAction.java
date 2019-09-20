package com.agler.web.action;

import com.agler.web.bean.Customer;
import com.agler.web.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	private String customerId;
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	// 根据主键查询
	public String findOne() throws Exception {
		Customer customer = this.customerService.findOne(customerId);
		ActionContext.getContext().getValueStack().push(customer);
		return SUCCESS;
	}
}
