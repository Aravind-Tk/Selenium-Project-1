package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchOnAmazon {

	public static WebDriver driver;
	public static String browser=System.getProperty("browser");
	
	@BeforeClass
	public static void navigateToAmazon() {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public static void searchItem() {
		driver.findElement(By.xpath(HomePageLocators.SEARCHBAR)).click();
		driver.findElement(By.xpath(HomePageLocators.SEARCHBAR)).sendKeys("Redmi");
	}
}
