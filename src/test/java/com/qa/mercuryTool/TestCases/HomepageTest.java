package com.qa.mercuryTool.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.mercuryTool.base.TestBase;
import com.qa.mercuryTool.pages.HomePage;
import com.qa.mercuryTool.pages.RegistrationPage;

public class HomepageTest extends TestBase {
	HomePage homePage;
	RegistrationPage registrationPage;
	
	public HomepageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
		registrationPage = new RegistrationPage();
	}
	
	@Test(priority = 1)
	public void homePageTest(){
		boolean response = homePage.verifyHomePageTitle();
		Assert.assertEquals(response, true);
	}
	
	@Test(priority = 2)
	public void goRegistrationPageTest(){
		registrationPage = homePage.goToRegistrationPage();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
