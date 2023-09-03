package testNGStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
@Parameters("browser")  
@Test
public void BrowserTest(String browser) throws InterruptedException 
{
	WebDriver driver = null;
	browser="edge";

	if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	//provide userid
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ELR321");
	//provide password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dhana1111");
	//click on login button
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	Thread.sleep(1000);
	//provide pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("982278");
	//click on continue
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	Thread.sleep(1000);
	//find userid
	String ActualUserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String ExpecxtedUserid="DV1510";
	Thread.sleep(4000);
	if(ActualUserid.equals(ExpecxtedUserid))
	{
		System.out.println("TC passed user id is matching");
	}
	else
	{
		System.out.println("TC failed user id is not matching");
	}

	
}

}
