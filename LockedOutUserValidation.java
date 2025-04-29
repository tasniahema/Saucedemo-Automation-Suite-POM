package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LockedOutUserValidation {
	protected WebDriver driver;

	// constructor
	public LockedOutUserValidation(WebDriver driver) {
		this.driver = driver;

	}
	
	public void Lockedoutuser() {
		
		    WebElement Loginpage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
			String LoginPageError = Loginpage.getText();
			String CheckLoginPage = "Epic sadface: Sorry, this user has been locked out.";
			Assert.assertEquals(LoginPageError, CheckLoginPage);
			System.out.println(LoginPageError);
	}

}
