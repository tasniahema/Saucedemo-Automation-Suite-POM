package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pages.CartBadgeCountValidation;
import pages.Checkoutpage;
import pages.LockedOutUserValidation;
import pages.LoginPage;
import pages.LogoutFunctionalityTest;
import pages.ProductPage;
import pages.SortingProductsValidation;


@Test
public class execution {
	public class TestExecution extends BaseClass {

		private LoginPage loginPage;
		private ProductPage productpage;
		private Checkoutpage checkoutpage;
		private SortingProductsValidation sortingproductsvalidation;
		private LogoutFunctionalityTest logoutfunctionalityTest;
		private CartBadgeCountValidation cartBadgeCountvalidation;
		
		private LockedOutUserValidation lockedoutuserValidation;
		
		@BeforeMethod
		public void setupTest() throws InterruptedException {
			setup();
			loginPage = new LoginPage(getDriver());
			productpage = new ProductPage(getDriver());
			checkoutpage = new Checkoutpage(getDriver());
			sortingproductsvalidation = new SortingProductsValidation(getDriver());
			 logoutfunctionalityTest = new LogoutFunctionalityTest (getDriver());
			 lockedoutuserValidation = new LockedOutUserValidation (getDriver());
			 cartBadgeCountvalidation = new CartBadgeCountValidation  (getDriver());
		}

	/*	@Test(priority = 1)
		public void login() throws InterruptedException {
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
		}
		
		@Test(priority = 2)
		public void loginNegativeTestCase() throws InterruptedException { //Incorrect username/password (e.g., wrong_user / secret_sauce).
			loginPage.enterUser("wrong_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();
			Thread.sleep(3000);	
			
			// Hard Assertion when use invalid credential 
			  
		    WebElement Loginpage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
			String LoginPageError = Loginpage.getText();
			String CheckLoginPage = "Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(LoginPageError, CheckLoginPage);
			System.out.println(LoginPageError);
		}
		
		@Test(priority = 3)
		public void ProductPage () throws InterruptedException {
			
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			
			productpage.BuyFristProduct();
			productpage.BuySecondProduct();
			Thread.sleep(3000);	
		}
		
		
		@Test(priority = 4)
		public void CheckoutPage () throws InterruptedException {
			
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			
			productpage.BuyFristProduct();
			Thread.sleep(3000);	
			
			checkoutpage.CheckOut();
			
		}
		
		@Test(priority = 5)
		public void SortingproductsValidation () throws InterruptedException {
			
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			
			sortingproductsvalidation.LowToHigh();
			sortingproductsvalidation.HighToLow();
			sortingproductsvalidation.NameAtoZ();
			sortingproductsvalidation.NameZtoA();
			Thread.sleep(3000);	
		}
		
		
		@Test(priority = 6)
		public void LogoutFunctionalityTest () throws InterruptedException {
			
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			logoutfunctionalityTest.LogOutFunctionalityTest();
			
			Thread.sleep(5000);	
		}
		
	

		@Test(priority = 7)
		public void LockedOutUserValidation() throws InterruptedException {
			
			loginPage.enterUser("locked_out_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			lockedoutuserValidation.Lockedoutuser();
			
			Thread.sleep(5000);	
		}*/
		
		@Test(priority = 8)
		public void CartBadgeCountValidation() throws InterruptedException {
			
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(3000);	
			cartBadgeCountvalidation.BuyMultipleProduct();
			
			Thread.sleep(5000);	
		}
		
		
		
	    @AfterMethod
		public void closebrowser() {
			closeDown();
		}
}
}