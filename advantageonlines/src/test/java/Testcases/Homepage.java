package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import EelementLocators.Elements;
import TestData.Datas;
import utillities.Browserconfig;

public class Homepage {
	
	public static WebDriver dr;
	@BeforeMethod
	public static void homepageOpen()
	{
		dr=Browserconfig.Browser();
		
		
		
	}
	
	@Test(priority=1)
	public static void homepageValidation() 
	{
		dr.get(Datas.homapgeurl);
		//tittlevaidation 
		String expectedtitle=dr.getTitle();
		String homepageAct="Your Store";
	    AssertJUnit.assertEquals(expectedtitle,homepageAct);
	    if (dr.getTitle().equals(homepageAct))
	    {System.out.println("title pass");
	    }
	    else {
	    	System.out.println("title fail");
	    
	    }
	    
	}
	@Test (priority=2)
	public static void Homepagsearch()
	{
		dr.get(Datas.homapgeurl);
		//searchbotton
		dr.findElement(Elements.UserSearch).sendKeys("phone");
		dr.findElement(Elements.SearchBtn).click();
		 if (dr.getPageSource().contains("phone")) {
		        System.out.println("search pass");
		    } 
		 else 
		    {
		        System.out.println("Search failed");
		    }
	}
		
	
	
   @AfterTest 
   public static void HomepageClose()
   {
	 //dr.close();
	   
	 
   }
	
	

}
