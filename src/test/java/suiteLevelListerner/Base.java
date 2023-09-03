package suiteLevelListerner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;

public class Base 
{
protected static WebDriver driver;
public void browserInitialize() throws InterruptedException
{
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(400);
}
public void captureScreenshot(String TCName) throws IOException
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\nikhi\\eclipse-workspace\\SeleniumUse\\SS Saved\\ListenerMyscreenshot"+TCName+".jpeg");
	FileHandler.copy(source, destination);
}
}
