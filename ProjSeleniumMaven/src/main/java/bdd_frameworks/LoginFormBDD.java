package bdd_frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFormBDD {
	
	WebDriver d;
	String url="https://biodataking.com/";
	

	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d=new ChromeDriver();
	   d.get(url);
	   Thread.sleep(2000);
	}

	@When("user will click on logintab")
	public void user_will_click_on_logintab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	   Thread.sleep(2000);
	}

	@And("user will enter username and password")
	public void user_will_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@id='username']")).sendKeys("abc.xyz@gmail.com");
	   
	   d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("abcd@1234");
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@value='Login']")).click();
	}

	
	
	
	
	
}
