package org.example.service.impl;

import org.example.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void save(int id, String name, int age) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Customer saved!!");
	}

	@Override
	public void update(int id, String name, int age) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Customer updated!!");
	}

	@Override
	public String getName(int id) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Dummy";
	}

	
	
}
