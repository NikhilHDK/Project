package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  public void KiteLogin() throws InterruptedException 
  {	
	  	System.setProperty("webdriver.firefox.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Hi Git Hub");
		System.out.println("Bye git hub");
		System.out.println("YO git HUB");
		System.out.println("New GitHUB");
  }
}
