package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	
	public WebDriver driver;
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By workemail=By.xpath("//input[@name='UserEmail']");
	By jobtitle=By.xpath("//input[@name='UserTitle']");
	By company=By.xpath("//input[@name='CompanyName']");
	By employees=By.xpath("//select[@name='CompanyEmployees']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By country=By.xpath("//select[@name='CompanyCountry']");
	By checkbox=By.xpath("//div[@class='checkbox-ui']");
	
	
	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterFirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterLastname() {
		return driver.findElement(lastname);
	}
	public WebElement enterWorkemail() {
		return driver.findElement(workemail);
	}
	public WebElement enterJobTitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement enterCompany() {
		return driver.findElement(company);
	}
	public WebElement selectEmployees() {
		return driver.findElement(employees);
	}
	public WebElement enterPhone() {
		return driver.findElement(phone);
	}
	public WebElement selectCountry() {
		return driver.findElement(country);
	}
	public WebElement clickOnCheckBox() {
		return driver.findElement(checkbox);
	}




}
