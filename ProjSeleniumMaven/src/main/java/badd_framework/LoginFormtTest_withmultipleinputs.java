package badd_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFormtTest_withmultipleinputs {
	
	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	

	@Given("will be on login page of Orangehrm demo")
	public void will_be_on_login_page_of_orangehrm_demo() {
	    // Write code here that turns the phrase above into concrete actions
     d=new ChromeDriver();
     d.get(url);
     d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("^will enter (.*) and (.*)$")
	public void will_enter_abcd_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@And("will click on login button")
	public void will_click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
Thread.sleep(2000);
	}

	@Then("home page will be displayed")
	public void home_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Home page is displayed, Tile of website is "+d.getTitle());
	}

	

	
	
}
