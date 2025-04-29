package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutFunctionalityTest {
	protected WebDriver driver;
	// constructor
			public LogoutFunctionalityTest(WebDriver driver) {
				this.driver = driver;

			}
			
			public void LogOutFunctionalityTest() throws InterruptedException{
				
				// ProductPage Hard Assertion getCurrenturl()
				String expectedUr = "https://www.saucedemo.com/inventory.html";
				String actualUr = driver.getCurrentUrl();
				Assert.assertEquals(actualUr, expectedUr);
				System.out.println("Product Page URL assertion completed successfully.");
				Thread.sleep(2000);
				 
				
				//Click the hamburger menu (☰) in the top-left corner.
				driver.findElement(By.id ("react-burger-menu-btn")).click();
				Thread.sleep(5000);	
	            // click logout 
				driver.findElement(By.id("logout_sidebar_link")).click();
				
				
				// Verify that the user is redirected to the login page.
				String expectedUr1 = "https://www.saucedemo.com/";
				String actualUr1 = driver.getCurrentUrl();
				Assert.assertEquals(actualUr1, expectedUr1);
				System.out.println("user is redirected to the login page.");
				Thread.sleep(2000);			 
							
}   
}
