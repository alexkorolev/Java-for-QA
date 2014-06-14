package com.example.tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.fail;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	protected ApplicationManager app;
		
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	    
	  }

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager(); 
	   	  }


}
