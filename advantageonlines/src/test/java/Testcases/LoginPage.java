package Testcases;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestData.Datas;
import utillities.Browserconfig;
import utillities.gridEngin;

public class LoginPage {
	public static WebDriver dr;
  @BeforeTest
  public static void browserOpen() throws MalformedURLException 
  {
	  dr=gridEngin.browsetup1();
  }
  @Test(priority=1)
  public static void validatLogin()
  {
	  //dropdownbtn
	  dr.get("http://tutorialsninja.com/demo/index.php?route=common/home");
	  dr.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a")).click();
	  dr.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a")).click();
	  
	   //
	  dr.findElement(By.name("email")).sendKeys(Datas.uid);
	  dr.findElement(By.name("password")).sendKeys(Datas.Password);
	  //loginbtn
      dr.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")).click(); 
     // logoutbtn
     // dr.findElement(By.xpath("//*[@id=\'column-right\']/div/a[13]")).click();
  }
  @Test(priority=2)
	public static void wishListvalidation() 
	{
		dr.get(Datas.homapgeurl);
		//clickitem
		dr.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]")).click();
		//click wishlist to see if its containg item is add
	   dr.findElement(By.id("wishlist-total")).click();
	   // verfied item removed
	   dr.findElement(By.xpath("//*[@id=\'content\']/div[1]/table/tbody/tr/td[6]/a")).click();
	   //logout
	   dr.findElement(By.xpath("//*[@id=\'column-right\']/div/a[13]")).click();
		
	}
	
  
  
  @AfterTest
  public static void browserClose()
  {
	 // dr.close();
	  
  }
	

}
