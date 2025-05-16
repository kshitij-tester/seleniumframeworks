package frameworks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEOTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//ANCHOR TAG IS THERE OR NOT 
		
		//DOMAIN TEST 
		//https://biodataking.com 
		//https://biodataking.com/signup - valid domain
		//https://signup.biodataking.com - invalid domain
		
		
		
		//TESTING BROKEN/VALID LINK
		//200 TO 399 - VALID LINK 
		//404 ERROR FOUND - BROKEN 
		
		
		WebDriver d=new ChromeDriver();
		
		String testurl="";
		String homeurl="https://biodataking.com/";
		HttpURLConnection htp=null;
		//HttpURLConnection is predefined class from java.net package
		//it is used to generate response code 
		
		d.get(homeurl);
		Thread.sleep(2000);
		
		List<WebElement> sel=d.findElements(By.tagName("a"));
		//a - anchor tag
		//List is predefined Interface from java.util package
		
		Iterator<WebElement> iter=sel.iterator();
		
		while(iter.hasNext())
		{
			testurl=iter.next().getAttribute("href");
			
			//anchor tag is there or not 
			
			if(testurl==null || testurl.isEmpty())
			{
				System.out.println(testurl+" anchor tag is not present ");
				continue;
			}
			
			
			//domain test 
			//!- not
			if(!testurl.startsWith(homeurl))
			{
				System.out.println(testurl+" is having incorrect domain");
			}
			
		
			//testing broken & valid link 
			//htp is objectname of HttpURLConnection
			//testurl is variable name 
			//URL is predefined method from java.net package 
			
		htp=(HttpURLConnection)(new URL(testurl)).openConnection();
		htp.setRequestMethod("HEAD");	
		htp.connect();
		int res=htp.getResponseCode();
			
			if(res>=400)
			{
				System.out.println(testurl+" is broken link");
			}
			else
			{
				System.out.println(testurl+" is valid link");
			}
			
			
			
		}
		
		
		
		
		
	}

}
