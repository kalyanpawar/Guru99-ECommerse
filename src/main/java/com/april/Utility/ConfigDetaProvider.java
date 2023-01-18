package com.april.Utility;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigDetaProvider {
	Properties pro;
	public ConfigDetaProvider() throws IOException {
		String configpath = "C:\\Users\\admin\\eclipse-workspace\\FrameWork\\Config.properties\\file";
		FileInputStream file = new FileInputStream(configpath);
		pro = new Properties();
		pro.load(file);

	}
	public String getStageUrl() {
		return pro.getProperty("StageUrl");
	}
	public String getHomePageTitle() {
		return pro.getProperty("HomePageTitle");	
	}
	public String getMobileMenu_Name() {
		return pro.getProperty("MobileMenu_Name");	
	}
	public String getMobilePageTitle() {
		return pro.getProperty("MobilePageTitle");	
	}
	public String getNameForMobilePageDropDown() {
		return pro.getProperty("MobilePageDropDownName");	
	}
	public String getMobilePageDropDown_Name() {
		return pro.getProperty("MobilePageDropDown_Name");	
	}
	public String getMobilesPageDropDownName() {
		return pro.getProperty("MobilesPageNameDropDown");	
	}
}
