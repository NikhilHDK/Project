package kiteTestingUsingPOM;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testNGPOM.KiteHomePage3;
import testNGPOM.KiteLogInPage1;
import testNGPOM.KitePinPage2;
public class KiteTestUsingPOM 
{	KiteLogInPage1 page1;	
	KitePinPage2 page2;
	KiteHomePage3 page3;
	Sheet mySheet0;
	WebDriver driver;	
 @BeforeClass 
 public void LaunchBrowser() throws EncryptedDocumentException, IOException
 {
	 Reporter.log("Browser Launched", true);
	 FileInputStream myfile0 = new FileInputStream("C:\\Users\\nikhi\\eclipse-workspace\\SeleniumUse\\excelsheet1.xlsx");
	 mySheet0 = WorkbookFactory.create(myfile0).getSheet("S5");
	 FirefoxOptions options = new FirefoxOptions();
	 options.addArguments("--disable-notifications");
//	 options.addArguments("headless");
	 System.setProperty("webdriver.firefox.driver", "C:\\Users\\nikhi\\eclipse-workspace\\TestNGNotes\\geckodriver.exe");
	 driver=new FirefoxDriver(options);
	 driver.manage().window().maximize();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 page1 = new KiteLogInPage1(driver);
	 page2 = new KitePinPage2(driver);
	 page3 = new KiteHomePage3(driver);	 
 }
 @BeforeMethod
 public void LoginKiteApplication()
 {
	 Reporter.log("LoginKiteApplication", true);
	 String UserID0 = mySheet0.getRow(1).getCell(0).getStringCellValue();
	 String Password0 = mySheet0.getRow(1).getCell(1).getStringCellValue();
	 String PinValue = mySheet0.getRow(1).getCell(2).getStringCellValue();
//	 String PinValues=Double.toString(PinValue);
	 page1.SendUserId(UserID0);
	 page1.SendPassword(Password0);
	 page1.ClickLogInButton();
	 page2.EnterPIN(PinValue);
	 page2.ClickContinue();
 }	
@Test
public void ValidateUserID() throws InterruptedException 
{
	Thread.sleep(1000);
	Reporter.log("ValidateUserID running", true);
	String ExPectedUserid = mySheet0.getRow(1).getCell(0).getStringCellValue();
	String ActualUserID = page3.ValidateUserID();
	Assert.assertEquals(ActualUserID, ExPectedUserid,"UseriD Not matching TC Failed");
	Reporter.log("UseriD matching TC Passed",true);
}
@AfterMethod
public void LogoutKiteApplication()
{
	Reporter.log("Application logged Out", true);
}
@AfterClass
public void CloseBrowser()
{
	Reporter.log("Closing Browser", true);
//	driver.close();
}
}
