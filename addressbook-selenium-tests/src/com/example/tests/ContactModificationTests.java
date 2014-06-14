package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

	@Test
	public void modifySomeContact() {
		
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification();
		
		GroupData group = new GroupData();
		group.firstName= "Kill Bill";
		
		app.getContactHelper().createNewContact(group);
		app.getContactHelper().submitContactModification();
		
		app.getContactHelper().returnsToHomePage();
	}
	
}
