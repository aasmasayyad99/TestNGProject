package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	public static WebDriver driver;
	//this method is for handling static dropdown
	public static void handleStaticDropDown(WebElement element,int index) {
		WebElement e=element;
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	//this method is for handling assertions
	public static void handleAssertions(String expected,String Actual) {
		SoftAssert sa=new SoftAssert();
		String expectedString=expected;
		String actualString=Actual;
		sa.assertEquals(actualString,expectedString);
		sa.assertAll();
	}
	/*public void handleExplicitWait(int duration,WebElement element) {
		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
		wb.until(ExpectedConditions.visibilityOf(element));
		
	}*/

}
