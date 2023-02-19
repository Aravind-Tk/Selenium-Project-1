package flipkartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import flipart.automation.HomepageLocators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchOnFlipkart {

	public static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	@Test
	public static void search() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(HomepageLocators.closeSignUpDialog)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(HomepageLocators.searchBar)).click();
		driver.findElement(By.xpath(HomepageLocators.searchBar)).sendKeys("Redmi");
		driver.findElement(By.xpath(HomepageLocators.searchBar)).sendKeys(Keys.ENTER);

	}
	
//	@AfterClass
//	public static void tearDown() {
//		driver.quit();
//	}
}
