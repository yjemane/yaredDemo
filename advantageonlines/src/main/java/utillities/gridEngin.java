package utillities;

import java.net.MalformedURLException;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridEngin {

	public static RemoteWebDriver driver;
	public static RemoteWebDriver browsetup1() throws MalformedURLException
	{
	 // HUB URL 
		
		String hubURL ="http://192.168.50.109:4444/ui";
		
		ChromeOptions co = new ChromeOptions(); 
		
	driver = new RemoteWebDriver(co);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	return driver;

}}
