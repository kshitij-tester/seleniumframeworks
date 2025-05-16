package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldEvent {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(2000);
		
		Actions a=new Actions(d);
		
		
		WebElement tileC=d.findElement(By.xpath("//li[contains(.,'C')]"));
		WebElement tileD=d.findElement(By.xpath("//li[contains(.,'D')]"));
		
		
Action ac=		a.clickAndHold(tileD).pause(Duration.ofSeconds(10)).moveToElement(tileC).pause(Duration.ofSeconds(10)).release(tileD).build();
//Action is predefined Interface from org.openqa.selenium package
//it is only used to store all predefined methods of Actions class
//it is dependent on Actions class

//Actions is predefined Class from org.opeqa.selenium package
//it is used to perform the mouse event and perform all mouse activity on website 
//it is indepndent predefined class 

ac.perform();


		
//clickAndHold is predefined method of Actions class 
//it is used to click and hold the element
		
		
	}

}
