package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel3 {
  @Test
  public void TwitterLogin() throws InterruptedException 
  {
	  System.setProperty("webdriver.firefox.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Reporter.log("Twitter Launched",true);
		Thread.sleep(2000);
		//driver.close();
  }
}
