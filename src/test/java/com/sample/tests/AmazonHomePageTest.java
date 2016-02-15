package com.sample.tests;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sample.core.TestBase;
import com.sample.pages.AmazonHomePage;

public class AmazonHomePageTest extends TestBase{
	
	@Test
	public void verifyLinksPresentOnHomePage(){
		AmazonHomePage amazonHomePage= new AmazonHomePage(driver);
		amazonHomePage.navigateToHomePage();
		if(amazonHomePage.getLinksOnHomePage()==0){
		Reporter.log("Links are not Found on the AmazonHomePage!!");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			//Reporter.log(amazonHomePage.getLinksOnHomePage()+" :Links are Found on the AmazonHomePage!");
		}
		
	}

}
