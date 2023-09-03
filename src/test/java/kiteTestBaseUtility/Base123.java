package kiteTestBaseUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base123 extends Utility123{
protected WebDriver driver;
@SuppressWarnings("deprecation")
public void browserInitialize() throws IOException
{
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
	driver=new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.get(Utility123.getDatafromPropertiesFile("URL"));
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}

}
