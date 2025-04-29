package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {
	protected WebDriver driver;

	// constructor
	public ProductPage(WebDriver driver) {
		this.driver = driver;

	}

	// action

	public void BuyFristProduct() throws InterruptedException {
		// ProductPage Hard Assertion getCurrenturl()
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("URL assertion completed successfully.");
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();// add first product 
		System.out.println("1st product add to cart completed");
		Thread.sleep(3000);
	}
	public void BuySecondProduct() throws InterruptedException {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click(); // add 2nd product 
		System.out.println("2nd product add to cart completed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();// click CART ICON 
		//  hard assertion cart page current url
		String expectedUrl1 = "https://www.saucedemo.com/cart.html";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println("Cart-page URL assertion completed successfully.");
        Thread.sleep(3000);
        
		// remove one item 
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000); 
		
		// click continue shopping button 
		driver.findElement(By.id("continue-shopping")).click();
		
		//back to product page (hard assertion )
		String expectedUrl2 = "https://www.saucedemo.com/inventory.html";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2);
		System.out.println("URL assertion completed successfully.");
		Thread.sleep(2000);
		
		// again add one item 
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		System.out.println("1st product add to cart completed");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();// click cart iocn 
		Thread.sleep(3000);
		
		
	//  Find the cart badge element
			WebElement cartBadge = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span"));
			//  Get the number from cart badge
			String itemCount = cartBadge.getText();
			//  Print the number
			System.out.println("Frist Time Number of products in cart: " + itemCount);
			Thread.sleep(3000);
			
		// remove one item 
				driver.findElement(By.id("remove-sauce-labs-backpack")).click();
				System.out.println("Remove item Two times");
				Thread.sleep(2000); 
				
		// hard assertion cart page current url 
		String expectedUrl3 = "https://www.saucedemo.com/cart.html";
		String actualUrl3 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl3, expectedUrl3);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);
		
		
		//  Find the cart badge element
		WebElement cartBadgeupdate = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span"));
		//  Get the number from cart badge
		String itemCountupdate = cartBadgeupdate.getText();
		//  Print the number
		System.out.println("Number of products in cart: " + itemCountupdate);
		Thread.sleep(3000);
	
	}

}
