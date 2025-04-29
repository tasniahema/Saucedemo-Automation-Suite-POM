package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SortingProductsValidation {
	protected WebDriver driver;
	
	// constructor
		public SortingProductsValidation(WebDriver driver) {
			this.driver = driver;

		}
		// Verify the sorting functionality for products.
		
		public void LowToHigh() throws InterruptedException{
			
			// ProductPage Hard Assertion getCurrenturl()
			String expectedUr9 = "https://www.saucedemo.com/inventory.html";
			String actualUr9 = driver.getCurrentUrl();
			Assert.assertEquals(actualUr9, expectedUr9);
			System.out.println("Product Page URL assertion completed successfully.");
			Thread.sleep(2000);
			
			
			
			// select low to high 
			WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select selectLtoH = new Select(dropdown);
			selectLtoH.selectByIndex(2);
			System.out.println("Low To High Dorpdown Completed");
			Thread.sleep(2000);
			
		   // Find all the price elements on the page
		    List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));
		    
		    //  Create a list to store all price values in double format
		    List<Double> prices = new ArrayList<>();

		    //  Loop through each price element
		    for (WebElement element : priceElements) {
		        
		        String priceText = element.getText().replace("$", "");
		        prices.add(Double.parseDouble(priceText)); //  // Convert text to number
		    }

		    //  Print prices one by one in ascending order
		    System.out.println("Prices in ascending order:");
		    for (Double price : prices) {
		        System.out.println("$" + price);
		    }	
			
		}
		
	public void HighToLow() throws InterruptedException{
			
			//  low to high ProductPage Hard Assertion getCurrenturl()
			String expectedUr9 = "https://www.saucedemo.com/inventory.html";
			String actualUr9 = driver.getCurrentUrl();
			Assert.assertEquals(actualUr9, expectedUr9);
			System.out.println("Low to High Product Page URL assertion completed successfully.");
			Thread.sleep(2000);
			
			
			
			// select Price (high to low) 
			WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select selectHtoL = new Select(dropdown);
			selectHtoL.selectByIndex(3);
			System.out.println("High To Low Dorpdown Completed");
			Thread.sleep(2000);
			
			
			// Find all the price elements on the page
			List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));

			// Create a list to store all price values in double format
			List<Double> prices = new ArrayList<>();

			// Loop through each price element
			for (WebElement element : priceElements) {
			    
			    String priceText = element.getText().replace("$", ""); // Convert text to number
			    prices.add(Double.parseDouble(priceText));             
			}

			// Sort the prices in descending order (High to Low)
			prices.sort((a, b) -> Double.compare(b, a)); // b before a = descending

			// Print prices one by one in descending order
			System.out.println("Prices in descending order:");
			for (Double price : prices) {
			    System.out.println("$" + price);
			}
			}
	
	public void NameAtoZ() throws InterruptedException{
		
		//  high to low  ProductPage Hard Assertion getCurrenturl()
		String expectedUr9 = "https://www.saucedemo.com/inventory.html";
		String actualUr9 = driver.getCurrentUrl();
		Assert.assertEquals(actualUr9, expectedUr9);
		System.out.println("High to Low Product Page URL assertion completed successfully.");
		Thread.sleep(2000);
		
		// select Name (A to Z)
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
		Select selectAtoZ = new Select(dropdown);
		selectAtoZ.selectByIndex(0);
		System.out.println("Name (A to Z) Dorpdown Completed");
		Thread.sleep(2000);
	
		// Find all the product name elements on the page
		List<WebElement> nameElements = driver.findElements(By.className("inventory_item_name"));

		// Create a list to store product names
		List<String> names = new ArrayList<>();

		// Loop through each name element
		for (WebElement element : nameElements) {
		    names.add(element.getText()); // Get and add the product name
		}

		// Sort the names in ascending order (A to Z)
		Collections.sort(names);

		// Print the names one by one
		System.out.println("Product names in A to Z order:");
		for (String name : names) {
		    System.out.println(name);
		}
	}
	
public void NameZtoA() throws InterruptedException{
		
		// A to Z   ProductPage Hard Assertion getCurrenturl()
		String expectedUr9 = "https://www.saucedemo.com/inventory.html";
		String actualUr9 = driver.getCurrentUrl();
		Assert.assertEquals(actualUr9, expectedUr9);
		System.out.println("A to Z   Product Page URL assertion completed successfully.");
		Thread.sleep(2000);
		
		
		
		// select Name (Z to A)
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
		Select selectZtoA = new Select(dropdown);
		selectZtoA.selectByIndex(1);
		System.out.println("Name (Z to A) Dorpdown Completed");
		Thread.sleep(2000);
		
		// Find all the product name elements on the page
				List<WebElement> nameElements = driver.findElements(By.className("inventory_item_name"));

				// Create a list to store product names
				List<String> names = new ArrayList<>();

				// Loop through each name element
				for (WebElement element : nameElements) {
				    names.add(element.getText()); // Get and add the product name
				}
		// Sort the names in descending order (Z to A)
		names.sort(Collections.reverseOrder());

		// Print the names one by one
		System.out.println("Product names in Z to A order:");
		for (String name : names) {
		    System.out.println(name);
		}
		
		// get text  inventory first item price 
		WebElement ZtoAPage = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
		String ZToApage = ZtoAPage.getText();
		String Z_APage = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals( ZToApage, Z_APage);
		System.out.println( ZToApage);
	   
			
	}
	
	
		
		
}
