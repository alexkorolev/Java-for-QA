package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase{

	public NavigationHelper(ApplicationManager manager) {
		super(manager);

	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void openGroupsPage() {
		click(By.linkText("groups"));
	}

	public void openNewContactPage() {
		click(By.linkText("add new"));
	}

}
