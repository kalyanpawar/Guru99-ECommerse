package com.april.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterclass {
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent ;
	public  static ExtentReports  getReports() {
		String reportpath = "C:\\Users\\admin\\eclipse-workspace\\FrameWork\\TestReport\\index.html";
		 reporter = new ExtentSparkReporter (reportpath);
		 reporter.config().setDocumentTitle("Automation report_Guru99E-Commerce");
		 reporter.config().setReportName("Automation Report");
		 reporter.config().setTheme(Theme.DARK);
		 
		  extent = new ExtentReports();
		  extent.attachReporter(reporter);
		  extent.setSystemInfo("Project name", "guru99 E-Commerse");
		  extent.setSystemInfo("version", "1.4.1");
		  extent.setSystemInfo("Browser", "Chrome");
		  extent.setSystemInfo("QA", "Kalyan");
		return extent;
		  
		 
	}

}
