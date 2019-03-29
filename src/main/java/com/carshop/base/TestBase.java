package com.carshop.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.carshop.util.TestUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	
	{
		try {
			
			prop=new Properties();
			String Sel_Path = "C:\\Users\\Bhavna PC\\Documents\\IdeaProjects\\CarshopUK\\src\\main\\java\\com\\carshop\\config\\config.properties";
			if(System.getProperty(Sel_Path) == null){
				System.out.println("Null!");
			}
			FileInputStream fis=new FileInputStream(Sel_Path);
			prop.load(fis);
			System.out.println(prop);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



public static void initialization() {
	
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{ System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);




		}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hkhan\\Music\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	}
}
