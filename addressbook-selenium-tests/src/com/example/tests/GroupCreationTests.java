package com.example.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
  
	@Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    openGroupsPage();
    initNewGroupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	fillGroupCreation(group);
    submitGroupCreation();
    returnsToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    openGroupsPage();
    initNewGroupCreation();
    fillGroupCreation(new GroupData("", "", ""));
    submitGroupCreation();
    returnsToGroupsPage();
    
    
  }
  
  @Test
  public void testCreateContact() throws Exception {
	  	
	    openMainPage();
	    // openNewContactPage
	    openNewContactPage();
	    // createNewContact
	    GroupData group = new GroupData("Alex", "Alex", "Moscow city", "Home", "89528007169", "Work", "email@email.ru", "email2@email2.ru", "22", "October", "1900", "group name 1", "Address", "Home");
		createNewContact(group);
	    //submitContactCreation
		submitGroupCreation();
  
  }
}
