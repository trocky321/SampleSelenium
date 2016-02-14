package com.sample.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	private static WebDriver driver;

	public static WebDriver initDriver(String browserType) {

		if (browserType.equals("FIREFOX")) {
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		return driver;

	}
}
