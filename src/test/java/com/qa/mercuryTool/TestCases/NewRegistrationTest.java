package com.qa.mercuryTool.TestCases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.mercuryTool.base.TestBase;
import com.qa.mercuryTool.pages.HomePage;
import com.qa.mercuryTool.pages.RegistrationPage;
import com.qa.mercuryTool.util.Utils;

public class NewRegistrationTest extends TestBase {
	HomePage homePage;
	RegistrationPage registrationPage;
	Utils testUtil;
//	String sheetName = "NewRegistration";
	
	public NewRegistrationTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		registrationPage = new RegistrationPage();
		testUtil = new Utils();
	}
	
	@DataProvider
	public Object[][] getMercuryToursRegistrationData() throws InvalidFormatException{
		Object data[][] = Utils.getTestData();
		return data;
	}
	
	@Test(dataProvider = "getMercuryToursRegistrationData")
	public void validateRegisterUser(String firstname, String lastname, String phone, String email, String address, String city, String state, String postal, String country, String username, String password){
		homePage.goToRegistrationPage();
		registrationPage.newRegistration(firstname, lastname, phone, email, address, city, state, postal, country, username, password);
		
	}

}
