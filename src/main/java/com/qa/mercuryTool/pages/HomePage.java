package com.qa.mercuryTool.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mercuryTool.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(),'REGISTER')]")
	WebElement goRegistrationPage;
	
	@FindBy(xpath = "//img[@alt='Mercury Tours']")
	WebElement RegistrationPageLogo;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHomePageTitle(){
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		return RegistrationPageLogo.isDisplayed();
	}
	
	public RegistrationPage goToRegistrationPage(){
		goRegistrationPage.click();
		return new RegistrationPage();
	}

}
