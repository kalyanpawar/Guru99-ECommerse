package com.april.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static ConfigDetaProvider config ;
	public static  ExcelDetaProvider excel;
	public static WebDriver driver;
	@BeforeSuite
	public void BS () throws IOException {
	 config = new ConfigDetaProvider ();
	// excel = new ExcelDetaProvider ();
	}
     @BeforeMethod
	 public void Setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(config.getStageUrl());
		 driver.manage().window().maximize();	
	}
      
      @AfterMethod
      public void closebrower() {
    	  driver.close();
      }
	

}
