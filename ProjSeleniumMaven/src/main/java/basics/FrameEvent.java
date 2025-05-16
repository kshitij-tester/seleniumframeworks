package basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FrameEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d=new SafariDriver();
		d.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		Thread.sleep(2000);
		
		d.switchTo().frame(0);
		
		Thread.sleep(1000);
	Webele	d.findElement(By.xpath("//i[@class='td-icon-font td-icon-mobile']")).click();
		Thread.sleep(1000);
		
		 d.switchTo().defaultContent();
		
		 String a;
		assertEquals(a, null);
		
	}

}
