package com.edutech.script;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo extends BaseTest{

	//public Logger log=Logger.getLogger(TestDemo.class);
	@Test
	public void testDemo(){
		log.info("test demo");
		Assert.fail();
	}
}
