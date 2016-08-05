package com.ingjmcaicedo.spring.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ingjmcaicedo.spring.CDPlayerConfig;
import com.ingjmcaicedo.spring.model.CompacDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompacDisc compactDisc;
	
	@Test
	public void play() {
		compactDisc.play();
		Assert.assertEquals("Playing Sargent Pepper Disc\n", systemOutRule.getLog());
	}

}
