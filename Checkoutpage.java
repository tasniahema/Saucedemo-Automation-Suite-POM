package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkoutpage {

	protected WebDriver driver;

	// constructor
	public Checkoutpage(WebDriver driver) {
		this.driver = driver;

	}

	public void CheckOut() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();// click CART ICON
		// hard assertion cart page current url
		String expectedUrl4 = "https://www.saucedemo.com/cart.html";
		String actualUrl4 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl4, expectedUrl4);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// click checkout button

		driver.findElement(By.id("checkout")).click();
		// Hard assertion checkout page

		String expectedUrl5 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualUrl5 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl5, expectedUrl5);
		System.out.println("Chckout page  URL assertion completed successfully.");
		Thread.sleep(3000);

		// provide first name ,last name , zip code

		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);

		
		// Hard assertion checkout page 
		
				String expectedUrl6 = "https://www.saucedemo.com/checkout-step-two.html";
				String actualUrl6 = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl6, expectedUrl6);
				System.out.println("Checkout: Overview URL assertion completed successfully.");
				Thread.sleep(3000);
				
				
				// click finish button 
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
				
	            // get url complete checkout page assertion 
				String expectedUrl7 = "https://www.saucedemo.com/checkout-complete.html";
				String actualUrl7 = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl7, expectedUrl7);
				System.out.println("Checkout: Complete! URL assertion completed successfully.");
				Thread.sleep(3000);
				
				
				// get text  Thank you for your order!
				WebElement Checkoutcompletepage = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2"));
				String Completecheckout = Checkoutcompletepage.getText();
				String CheckOutcompletePage = "Thank you for your order!";
				Assert.assertEquals(Completecheckout, CheckOutcompletePage);
				System.out.println(Completecheckout);
			    Thread.sleep(3000);
				
			    
			 // click Back Home  button 
				driver.findElement(By.id("back-to-products")).click();
				Thread.sleep(3000);
				
				
				// ProductPage Hard Assertion getCurrenturl()
				String expectedUr8 = "https://www.saucedemo.com/inventory.html";
				String actualUr8 = driver.getCurrentUrl();
				Assert.assertEquals(actualUr8, expectedUr8);
				System.out.println("URL assertion completed successfully.");
				Thread.sleep(2000);
	
	}
}
