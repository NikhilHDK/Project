package kiteTestingUsingPOM;
import org.testng.annotations.Test;
import kiteTestBaseUtility.Base123;
import kiteTestBaseUtility.Utility123;
import testNGPOM.KiteHomePage3;
import testNGPOM.KiteLogInPage1;
import testNGPOM.KitePinPage2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
public class TestLoginLogoutUsingPropertyFile extends Base123 {
	KiteLogInPage1 page1;
	KitePinPage2 page2;
	KiteHomePage3 page3;
	int TCID=123;	
@Test
public void ValidateUserID() throws IOException 
{
	Reporter.log("Running "+TCID, true);
	String ActualUserID = page3.ValidateUserID();
	String ExpectedUserID = Utility123.getDatafromPropertiesFile("UN");
	Assert.assertEquals(ActualUserID, ExpectedUserID,"User ID not matching TC failed");
	Reporter.log("User ID matching TC Passed ", true);
}
@AfterMethod
public void LogOutFormApplication(ITestResult result) throws IOException, InterruptedException 
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Utility123.captureScreenshot(driver, TCID);
	}
	Thread.sleep(2000);
	Reporter.log("Logging out ", true);
	page3.clickOnUserid();
	page3.ClickOnLogout();
}
@BeforeMethod
public void LoginApplication() throws IOException, InterruptedException
{
//	Utility123.Waitfor(driver, 2);
	Thread.sleep(2000);
	Reporter.log("Application Logged in", true);
	page1.SendUserId(Utility123.getDatafromPropertiesFile("UN"));
	page1.SendPassword(Utility123.getDatafromPropertiesFile("PWD"));
	page1.ClickLogInButton();	
	page2.EnterPIN(Utility123.getDatafromPropertiesFile("PIN"));
	page2.ClickContinue();
}
@BeforeClass
public void LaunchBrowser() throws IOException 
{
	Reporter.log("Launching Browser", true);
	browserInitialize();
	page1=new KiteLogInPage1(driver);
	page2=new KitePinPage2(driver);
	page3=new KiteHomePage3(driver);
}
@AfterClass
public void CloseBroswer() throws InterruptedException
{
	Thread.sleep(2000);
	Reporter.log("Closing Browser ", true);
//	driver.close();
}
}
