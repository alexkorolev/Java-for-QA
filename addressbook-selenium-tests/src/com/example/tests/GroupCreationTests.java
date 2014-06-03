package com.example.tests;

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
}
