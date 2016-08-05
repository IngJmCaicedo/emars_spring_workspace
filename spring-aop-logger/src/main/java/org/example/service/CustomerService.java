package org.example.service;

public interface CustomerService {
	
	void save(int id, String name, int age);
	void update(int id, String name, int age);
	String getName(int id);
	
	
}
