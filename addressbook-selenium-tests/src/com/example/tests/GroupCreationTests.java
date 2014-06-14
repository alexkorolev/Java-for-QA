package com.example.tests;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{
	
	
	@Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().initNewGroupCreation(); 
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
    app.getGroupHelper().fillGroupCreation(group);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnsToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().initNewGroupCreation();
    GroupData group = new GroupData("", "", ""); 
    app.getGroupHelper().fillGroupCreation(group);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnsToGroupsPage();
    
    
  }
  
  @Test
  public void testCreateContact() throws Exception {
	  	
	    app.getNavigationHelper().openMainPage();
	    // openNewContactPage
	    app.getNavigationHelper().openNewContactPage();
	    // createNewContact
	    GroupData group = new GroupData("Alex", "Alex1", "Moscow city", "Home", "89528007169", "Work", "email@email.ru", "email2@email2.ru", "22", "October", "1900", "group name 1", "Address", "Home");
		app.getContactHelper().createNewContact(group);
	    //submitContactCreation
		app.getGroupHelper().submitGroupCreation();
  
  }
}
