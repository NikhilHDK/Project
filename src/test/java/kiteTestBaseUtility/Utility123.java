package kiteTestBaseUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class Utility123 {
public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
{
	File Source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination1 = new File("C:\\Users\\nikhi\\eclipse-workspace\\SeleniumUse\\excelsheet1.xlsx");
	FileHandler.copy(Source1, Destination1);
}
public static String getDatafromPropertiesFile(String key) throws IOException
{
	Properties Prop = new Properties();
	FileInputStream myfile = new FileInputStream("C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\KitePropertyFile..properties");
	Prop.load(myfile);
	String value = Prop.getProperty(key);
	return value;
}
@SuppressWarnings("deprecation")
public static void Waitfor(WebDriver driver, int A)
{
		driver.manage().timeouts().implicitlyWait(A, TimeUnit.SECONDS);
}
}
