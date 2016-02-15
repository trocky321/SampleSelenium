package com.sample.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase extends Driver{
	public static WebDriver driver;
	
	@BeforeClass
	public void startUp(){
		driver=Driver.initDriver("FIREFOX");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
