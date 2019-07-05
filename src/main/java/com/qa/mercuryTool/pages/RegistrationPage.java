package com.qa.mercuryTool.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.mercuryTool.base.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(xpath = "//img[@src='/images/masts/mast_register.gif']")
	WebElement RegistrationPageLogo;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement Phone;
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@name='address1']")
	WebElement Address;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement Postal;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@name='register']")
	WebElement Submit;
	
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateRegistrationPage(){
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		return RegistrationPageLogo.isDisplayed();
	}
	
	public void newRegistration(String first, String last, String phone, String Mail, String address, String city, String Province, String zip, String country, String UN, String PWD){
		FirstName.sendKeys(first);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		LastName.sendKeys(last);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Phone.sendKeys(phone);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Email.sendKeys(Mail);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Address.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		City.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		state.sendKeys(Province);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Postal.sendKeys(zip);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText(country);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		username.sendKeys(UN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Password.sendKeys(PWD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ConfirmPassword.sendKeys(PWD);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Submit.click();
	}
	

}
