package com.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	public static WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToHomePage() {

		driver.get("http://www.amazon.com");
	}
	
	public int getLinksOnHomePage(){
		int linkCnt;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		return links.size();
	}
	
}
