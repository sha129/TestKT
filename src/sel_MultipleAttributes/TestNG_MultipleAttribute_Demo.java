package sel_MultipleAttributes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

//this is my second commit//
public class TestNG_MultipleAttribute_Demo {
	public WebDriver driver;
  @Test
  public void f() {

	//this is my second commit//
	  driver.findElement(By.id("fullLoginEmail")).click();
	  driver.findElement(By.id("fullLoginPassword")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://www.sce.com/");		  
	  
  }

  @AfterMethod
  public void afterMethod() {
 driver.quit();
  }

}
