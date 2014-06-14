package com.example.fw;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ApplicationManager {
	
	private NavigationHelper navigatorHelper;
	public GroupHelper groupHelper;
	public ContactHelper contactHelper;
	   
	public  WebDriver driver;
	public  String baseUrl;
		
	public ApplicationManager(){
		 driver = new FirefoxDriver();
		 baseUrl = "http://localhost/";
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
			}
	
	public void stop() {
		driver.quit();
	}
	
		public NavigationHelper getNavigationHelper(){
			if (navigatorHelper == null) {
				navigatorHelper = new NavigationHelper(this);
			}
			return navigatorHelper;
		}
		  
		
		public GroupHelper getGroupHelper(){
			if (groupHelper == null) {
				groupHelper = new GroupHelper(this);
			}
			return groupHelper;
		}
		
		public ContactHelper getContactHelper(){
			if (contactHelper == null) {
				contactHelper = new ContactHelper(this);
			}
			return contactHelper;
		}
		

	    }
	


		
	


