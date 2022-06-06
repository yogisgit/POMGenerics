package com.gen.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.gen.pages.Page;

public class BaseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	Page page;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/yogi/Java/POMGenerics/chromedriver");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.com/");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		page = new Page(driver, wait);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
