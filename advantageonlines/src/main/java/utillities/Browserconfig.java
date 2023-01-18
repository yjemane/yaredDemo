package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserconfig {
	
	public static WebDriver dr;
	public static WebDriver Browser(){
		
	     // System.setProperty("webdriver.chrome.driver","C:\\Users\\yjema\\eclipse-workspace\\advantage\\advantageonlines\\Driver\\chromedriver.exe");
			
		//dr= new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver","");
		//WebDriver dr = new EdgeDriver();
			//driver=new FirefoxDriver();
				WebDriver dr= new ChromeDriver();
			System.out.println("Chrome Browser opened");
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			return dr;
		
		
	}

}
