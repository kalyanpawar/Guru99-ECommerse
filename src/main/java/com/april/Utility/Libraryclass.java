package com.april.Utility;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Libraryclass {
	public static ExtentTest test;
	public  static void custom_sendKeys(WebElement element,String fieldname,String value) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS,fieldname+" Value successfully sent ="+value);
			System.out.println(fieldname+" Value successfully sent ="+value);

		}
		catch (Exception e) {
			System.out.println("unable to send value"+fieldname);
			test.log(Status.FAIL,fieldname+"Unable to send value ="+value);

		}
	}
	public  static void custom_click(WebElement element,String fieldname){
		try {
			element.click();
			test.log(Status.PASS,"Clicked successfully ="+fieldname);
			System.out.println("Clicked successfully ="+fieldname);

		}
		catch (Exception e) {
			//System.out.println("unable to click"+fieldname);
			test.log(Status.FAIL,"Unable to click ="+e);
			System.out.println("Unable to click ="+e);
		}
	}
	public  static void custom_HandleDropDown(WebElement element,String value,String fieldname) {
		try {
			Select s = new Select (element);
			s.selectByVisibleText(value);
//			test.log(Status.PASS,"Value Selected in DropDown ="+fieldname);
			System.out.println("Value Selected in DropDown ="+fieldname);
			}
		catch (Exception e) {
//			test.log(Status.FAIL,"Unable to HandleDropDown "+fieldname);
			System.out.println("Unable to HandleDropDown "+fieldname);
		}
	}
	
	public  static void custom_AssertEquals(String actualTest,String expectedText) {
		try {
			Assert.assertEquals(actualTest, expectedText);
			test.log(Status.PASS,"Text is Verified ="+actualTest+"=="+expectedText);
			System.out.println("Text is Verified ="+actualTest+"=="+expectedText);
		}
		catch (Exception e) {
			//System.out.println("unable to send value"+fieldname);
			test.log(Status.FAIL,"Text is not Verified "+actualTest+"=="+expectedText);
			System.out.println("Text is not Verified "+actualTest+"=="+expectedText);
		}
	}
	
	public  static void custom_Verifyorder(List Webelements,String expectedOrder) {
		String actualOrder="";
		try {
			String arr[]=new String[Webelements.size()];
			for(int i=1;i<Webelements.size();i++) {
				arr[i]=((WebElement) Webelements.get(i)).getText();
			}
			actualOrder=Arrays.toString(arr);
			Assert.assertEquals(actualOrder, expectedOrder);
			test.log(Status.PASS,"Order is Verified "+actualOrder+"="+expectedOrder);
			System.out.println("Order is Verified "+actualOrder+"="+expectedOrder);
		}
		catch (Exception e) {
			System.out.println("Order is not Verified "+actualOrder+"="+expectedOrder);
			test.log(Status.FAIL,"Order is not Verified "+actualOrder+"="+expectedOrder);
		}
	}
}
