package extentreportdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BaseClass {
	
	
	
	//Parent Class - Classic TestNG
	//Child Class - Advanced TestNG 
	//ExtentHtmlReporter is predefined Interface from com.aventstack package
	//it is used to store the extent report at given location 
	
	//ExtentReports is predefined Class from com.avenstack package 
	//it is used to generate extent reports
	
	//ExtentTest is predefined Class from com.aventstack package 
	//it is used to give label green or red whether test case is passed or failed
	
	ExtentHtmlReporter ht;
	ExtentReports ext;
	ExtentTest test;
	
	WebDriver d;
	String url="https://biodataking.com/";
	
	@BeforeSuite
	public void setup() throws InterruptedException
	{
		d=new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
		
		ht=new ExtentHtmlReporter("./Reports/TestResultsReport.html");
		ext=new ExtentReports();
		
		ext.attachReporter(ht); //it is used to connect ExtentReports with ExtentHtmlReporter
		
		ext.setSystemInfo("Domain", "biodataking.com");
		ext.setSystemInfo("Browser Name", "Chrome Browser");
		ext.setSystemInfo("QA Name", "kshitij");
		
		
		ht.config().setReportName("Broken & Valid Links/URL Test Report");
		ht.config().setTheme(Theme.DARK);
		
		
	}
	
	@BeforeMethod
	public void setStatusResult(ITestResult it)
	{
		
		if(it.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(it.getName()+" test case pass", ExtentColor.GREEN));
		    test.fail(it.getThrowable());
		    
		    //getThrowable is predefined method of ITestResult 
		    //it is used to prevent the report from getting crashed or corrupted
		}
		else if(it.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(it.getName()+" test case FAIL", ExtentColor.RED));
			 test.fail(it.getThrowable());
		}
	}
	
	
	
	
	@AfterSuite
	public void CloseReport()
	{
		ext.flush();
		//flush() is predefined method of Extent Reports
		//it is used to close the report
	}
	
	
	
	
	

}
