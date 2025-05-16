package badd_withcucumber_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFormAutomate {
	
	WebDriver d;
	String url="https://biodataking.com/";
	

	@Given("tester is on home page of biodataking.com")
	public void tester_is_on_home_page_of_biodataking_com() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	d=new ChromeDriver();
	d.get(url);
	Thread.sleep(2000);
	}

	@When("tester clicks on Login Tab")
	public void tester_clicks_on_login_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	   Thread.sleep(2000);
	}

	@And("tester  enters username and password")
	public void tester_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	 d.findElement(By.xpath("//input[@id='username']")).sendKeys("abc.xyz@gmail.com");  
	 
	 d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("abcd@123");
	}

	@Then("tester will click on login button")
	public void tester_will_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  d.findElement(By.xpath("//input[@value='Login']")).click();
	}



	
	
	
}
