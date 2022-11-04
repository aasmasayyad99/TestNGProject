package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class VerifyLogin extends baseClass{
	@Test
	public void login() throws IOException {
		
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		obj.enterUsername().sendKeys(Constant.username);
		//CommonUtilities.handleExplicitWait(10,obj.enterPassword());
		obj.enterPassword().sendKeys(Constant.password);
		obj.clickOnLogin().click();
		
		CommonUtilities.handleAssertions(Constant.expectedString, obj.errorMessage().getText());
		
		
	}
	

}
