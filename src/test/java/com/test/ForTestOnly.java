package com.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.april.Utility.Baseclass;
import com.april.Utility.ConfigDetaProvider;
import com.april.Utility.Libraryclass;
import com.april.pageobject.Testcase01Pom;

public class ForTestOnly extends Baseclass {
	@Test
	public void forTestOnly() throws IOException {
		Testcase01Pom tc1 = PageFactory.initElements(driver, Testcase01Pom.class);
		ConfigDetaProvider config=new ConfigDetaProvider();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Libraryclass.custom_AssertEquals(driver.getTitle(), config.getHomePageTitle());
		Libraryclass.custom_click(tc1.getMobileMenu(), "MobileMenu");
		Libraryclass.custom_AssertEquals(driver.getTitle(), config.getMobilePageTitle());
		Libraryclass.custom_HandleDropDown(tc1.getMobilePageDropDown(), config.getMobilePageTitle(), "Mobile Page DropDown");
//		Libraryclass.custom_Verifyorder(tc1.getMobileListByName(), config.getMobilesPageDropDownName());
		List Webelements=tc1.getMobileListByName();
		String arr[]=new String[Webelements.size()];
		for(int i=1;i<Webelements.size();i++) {
			arr[i]=((WebElement) Webelements.get(i)).getText();
		}
		String actualOrder=Arrays.toString(arr);
		System.out.println(actualOrder);
		System.out.println(config.getMobilesPageDropDownName());
		
	}
}
