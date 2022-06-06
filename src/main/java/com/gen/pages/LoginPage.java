package com.gen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	By searchText = By.xpath("//input[@type='text']");
	By submit = By.xpath("//input[@type='submit']");
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void searchItem(String text) {
		doSendKeys(searchText, text);
		doClick(submit);
	}
	
}
