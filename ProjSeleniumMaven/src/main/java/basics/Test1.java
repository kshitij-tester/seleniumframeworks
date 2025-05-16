package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("");
		
		//d.manage().timeouts().implicitlyWait(60,TimeUnit.);
		
		WebDriverWait w=new WebDriverWait(d, Duration.ofMinutes(12));
		
		//WebDriverWait is predefined class from org.openqa.selenium package
		  
		WebElement loginTab=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		loginTab.click();
		
		//Wait is predefined Interface from org.openqa.selenium package
		
	    Wait<WebDriver> wr =
	            new FluentWait<WebDriver>(d)
	                .withTimeout(Duration.ofMinutes(10))
	                .pollingEvery(Duration.ofSeconds(3))
	                .ignoring(Exception.class);

		WebElement EmailID=wr.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		EmailID.sendKeys("abc");
		
		
		//tagname[@attribute='
		
		
		
		
	}

}
