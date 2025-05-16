package pom_using_bdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BioataKing_LoginFormTest1 {
	
	
	WebDriver d;
	String url="https://biodataking.com/";
	
	POM p;

	@Given("I am on home page")
	public void i_am_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    d=new FirefoxDriver();
	    d.get(url);
	    d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    
		
	}

	@When("I will click on login Tab")
	public void i_will_click_on_login_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
p=new POM(d);
p.loginTab.click();
Thread.sleep(2000);




	
	}

	@And("I will enter username and password")
	public void i_will_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions

		p=new POM(d);
		p.EmailId.sendKeys("jnjdsfb");
		p.Password.sendKeys("ehfue");
	
	}

	@Then("I will click on login button")
	public void i_will_click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
p=new POM(d);
p.loginbutton.click();
Thread.sleep(2000);
	}


	
	
}
