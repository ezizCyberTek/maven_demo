package MavenTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	  @Test
	  public void MavernTest() {
		  	WebElement search_box = driver.findElement(By.name("q"));
			search_box.sendKeys("Porshe"+ Keys.ENTER);
			Assert.assertTrue(driver.getTitle().contains("Porshe"));
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("http://www.google.com");
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

}
