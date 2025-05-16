package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageMargin;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.Test;

public class PrintPageException extends Exception {

	private String dt;
	
	public void setMsg(String dt)
	{
		this.dt=dt;
	}
	
	
}
