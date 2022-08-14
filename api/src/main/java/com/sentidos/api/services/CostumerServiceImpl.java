package com.sentidos.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sentidos.api.dao.ICustomerDao;
import com.sentidos.api.entities.Customer;

@Service
public class CostumerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	public List<Customer> findAll(){
		return (List<Customer>) customerDao.findAll();
	}
}
