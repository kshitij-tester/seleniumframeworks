package pom_using_bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginFormTest {

	WebDriver d;
	String url="https://biodataking.com/";
	POM p;
	Actions a;
	
	@Test (priority = 1)
	public void Setup() throws InterruptedException
	{
		d=new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
	}
	
	@Test (priority=2)
	public void LoginFormT() throws InterruptedException
	{
		p=new POM(d);
		
		p.loginTab.click();
		p.EmailId.sendKeys("fef");
		p.Password.sendKeys("jdus");
		p.loginbutton.click();
		Thread.sleep(2000);
		
		
		d.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	@Test (priority=3)
	public void MouseHoverTest() throws InterruptedException
	{
		a=new Actions(d);
		p=new POM(d);
		
		
		a.moveToElement(p.loginTab).perform();
		Thread.sleep(1000);
		a.moveToElement(p.RegisterFree).perform();
		Thread.sleep(1000);
		a.moveToElement(p.ProfileEbbok).perform();
		Thread.sleep(1000);
		
		
	}
	
	
	@Test  (priority=4)
	public void SignupFormTest() throws InterruptedException
	{
		p=new POM(d);
		
		p.RegisterFree.click();
		Thread.sleep(2000);
		new Select(p.Signup_GenderDropdown).selectByVisibleText("Male");
		
		p.Signup_FirstName.sendKeys("ABC");
		
		p.Signup_LastName.sendKeys("XYZ");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
