package com.april.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase01Pom {
	WebDriver driver;
	
	public Testcase01Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Mobile']")
	private WebElement mobileMenu;
	public WebElement getMobileMenu() {
		return mobileMenu;
	}
	
	@FindBy(how=How.XPATH,using = "(//select[@title='Sort By'])[1]")
	private WebElement mobilePageDropDown;
	public WebElement getMobilePageDropDown() {
		return mobilePageDropDown;
	}
	
	@FindBy(how=How.XPATH,using = "//h2[@class='product-name']//a")
	private List<WebElement> mobileListByName;
	public List getMobileListByName() {
		return mobileListByName;
	}
	
}
