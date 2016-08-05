package org.example.test.service;

import org.example.AppConfig;
import org.example.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
@ActiveProfiles({"PERF"})
public class PerfCustomerServiceTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void save_customer_test(){
		customerService.save(0, null, 0);
	}

	@Test
	public void update_customer_test(){
		customerService.update(0, null, 0);
	}

	@Test
	public void get_name_customer_test(){
		customerService.getName(0);
	}
	

}
