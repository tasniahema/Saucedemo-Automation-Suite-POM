package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseClass {
 
  protected WebDriver driver;
	
	public void setup() throws InterruptedException {
		  driver = new ChromeDriver();//lunch chromebrowser
		  driver.manage().window().maximize();//maximize browser
		  System.out.println("Browser Setup completed ");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//use a wait for all
		  driver.get("https://www.saucedemo.com/"); // set url to the browser
		  
		  // Hard Assertion when open url 
		  
		    WebElement Loginpage = driver.findElement(By.xpath("/html/body/div/div/div[1]"));
			String LoginPage = Loginpage.getText();
			String CheckLoginPage = "Swag Labs";
			Assert.assertEquals(LoginPage, CheckLoginPage);
			System.out.println(LoginPage);
		   // Thread.sleep(5000);
	}
	//driver quite or close
		public void closeDown() {
			if (driver != null) {
				driver.quit();
			}
		}
		// return the driver
		public WebDriver getDriver() {// beforemethod ,aftermethod use more times so we return driver 
			return driver;
		}
}
