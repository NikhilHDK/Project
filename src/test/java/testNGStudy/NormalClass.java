package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NormalClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
