package pom_using_bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	//POM - PAGE OBJECT MODEL FRAMEWORK 
	
	private WebDriver d;
	
	POM(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy (xpath="//a[@id='open-login-modal']")
	WebElement loginTab;
	
	@FindBy (xpath="//input[@id='username']")
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='userpassword']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath = "(//a[contains(.,'Register FREE')])[1]")
	WebElement RegisterFree;
	
	@FindBy(xpath = "(//a[contains(.,'Profiles eBook')])[1]")
	WebElement ProfileEbbok;
	
	@FindBy(xpath = "//select[@id='register-gender']")
	WebElement Signup_GenderDropdown;
	
	@FindBy(xpath = "//input[@id='reg-fname']")
	WebElement  Signup_FirstName;
	
	@FindBy(xpath = "//input[@id='reg-lname']")
	WebElement Signup_LastName;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
