package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.GroupData;


public class ContactHelper extends HelperBase {

public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void createNewContact(GroupData group) {
		type(By.name("firstname"), group.firstName);
		type(By.name("lastname"), group.lastName);
		type(By.name("address"), group.address);
		type(By.name("mobile"), group.mNumber);
		type(By.name("work"), group.wORK);
		type(By.name("email"), group.eMail);
		type(By.name("email2"), group.eMail2);

	    selectByText(By.name("bday"), group.bDay);
	    selectByText(By.name("bmonth"), group.bMonth);
		type(By.name("byear"), group.bYear);
		/*selectByText(By.name("new_group"), group.bMonth);
	    new Select(driver.findElement(By.name("groupName")))
	    	.selectByVisibleText(group.groupName);*/
		
	    type(By.name("address2"), group.adress2);
	    type(By.name("phone2"), group.pHONE2);

	}

	

}
