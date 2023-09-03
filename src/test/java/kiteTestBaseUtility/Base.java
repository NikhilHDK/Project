package kiteTestBaseUtility;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Base 
{	WebDriver driver;	
@SuppressWarnings("deprecation")
public void browserInitialize()
{
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
	driver=new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}
}
