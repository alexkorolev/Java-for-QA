package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;


public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);  
	
	}
	
	public void initNewGroupCreation() {
		click(By.name("new"));
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void returnsToGroupsPage() {
		click(By.linkText("group page"));
	}

	public void fillGroupCreation(GroupData Group){
		type(By.name("group_name"), Group.name);
		type(By.name("group_header"), Group.header);
		type(By.name("group_footer"), Group.footer);
		
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
	}


	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		
	}

	public void submitGroupModification() {
		click(By.name("update"));
		
	} 
	
	private void selectGroupByIndex(int index) {
		click(By.xpath("//form[2]/input[" + index + "]"));
	}
	


	
	
}
