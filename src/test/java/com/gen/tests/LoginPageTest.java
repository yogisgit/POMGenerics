package com.gen.tests;

import org.testng.annotations.Test;

import com.gen.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void title() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void search() {
		page.getInstance(LoginPage.class).searchItem("Toys");
	}
}
