package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.april.Utility.Baseclass;
import com.april.Utility.ConfigDetaProvider;
import com.april.Utility.Libraryclass;
import com.april.pageobject.Testcase01Pom;;

public class TestCase01 extends Baseclass {
	@Test
	public void  verifyTestCase01() throws IOException {
		Testcase01Pom tc1 = PageFactory.initElements(driver, Testcase01Pom.class);
		ConfigDetaProvider config=new ConfigDetaProvider();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Libraryclass.custom_AssertEquals(driver.getTitle(), config.getHomePageTitle());
		Libraryclass.custom_click(tc1.getMobileMenu(), config.getMobileMenu_Name());
		Libraryclass.custom_AssertEquals(driver.getTitle(), config.getMobilePageTitle());
		Libraryclass.custom_HandleDropDown(tc1.getMobilePageDropDown(), config.getNameForMobilePageDropDown(), config.getMobilePageDropDown_Name());
		Libraryclass.custom_Verifyorder(tc1.getMobileListByName(), config.getMobilesPageDropDownName());
	}
}
