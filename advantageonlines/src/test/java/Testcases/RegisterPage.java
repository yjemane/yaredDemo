package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utillities.Browserconfig;

public class RegisterPage {
	public static WebDriver dr;
	@BeforeMethod
	public static void BrowswerOpen()

	{
		dr=Browserconfig.Browser();
		
		
	}
 @Test
 public static void Register()
 
 {
	 dr.get("http://tutorialsninja.com/demo/index.php?route=common/home");
	 dr.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a")).click();
	 dr.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[1]/a")).click();
	 dr.findElement(By.name("firstname")).sendKeys("yared");
	 dr.findElement(By.name("lastname")).sendKeys("jemane");
	 dr.findElement(By.name("email")).sendKeys("yaredjesus2@gmail.com");
	 dr.findElement(By.name("telephone")).sendKeys("123456");
	 dr.findElement(By.name("password")).sendKeys("123456");
	 dr.findElement(By.name("confirm")).sendKeys("123456");
	 dr.findElement(By.xpath("//*[@id=\'content\']/form/fieldset[3]/div/div/label[1]/input")).click();
	 dr.findElement(By.name("agree")).click();		
	 dr.findElement(By.xpath("//*[@id=\'content\']/form/div/div/input[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\'content\']/div/div/a")).click();
 }
 
 @AfterTest
 public static void CloseBrowser() 
 {
	 //dr.quit();
 }
}
