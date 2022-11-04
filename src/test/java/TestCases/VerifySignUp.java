package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class VerifySignUp extends baseClass{
	@Test
	public void signup() throws IOException, InterruptedException {
		
		LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.clickOnTryForFree().click();
		
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
		Thread.sleep(5000);
		SPO.enterFirstname().sendKeys(Constant.firstName);
		SPO.enterLastname().sendKeys(Constant.lastName);
		
		SPO.enterJobTitle().sendKeys(Constant.jobtitle);
	    
	    SPO.enterWorkemail().sendKeys(Constant.workemail);
		SPO.enterPhone().sendKeys(Constant.phone);
		
		//employee DropDown
		CommonUtilities.handleStaticDropDown(SPO.selectEmployees(), 1);
		Thread.sleep(3000);
		
		
		SPO.enterCompany().clear();
		SPO.enterCompany().sendKeys(Constant.company);
		
		Thread.sleep(2000);
		
		//country 
		CommonUtilities.handleStaticDropDown(SPO.selectCountry(), 1);
		
		Thread.sleep(5000);
		SPO.clickOnCheckBox().click();
		
		
	}
	
	

}
