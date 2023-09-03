package kiteTestBaseUtility;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import suiteLevelListerner.Base;
import testNGPOM.KiteHomePage3;
import testNGPOM.KiteLogInPage1;
import testNGPOM.KitePinPage2;
@Listeners(suiteLevelListerner.Listener.class)
public class TestLoginLogout extends Base
{
	
	KiteLogInPage1 page1;
	KitePinPage2 page2;
	KiteHomePage3 page3;
@BeforeClass
public void LaunchBrowser() throws InterruptedException
{
	Reporter.log("Launching Browser", true);
	browserInitialize();
	page1=new KiteLogInPage1(driver);
	page2=new KitePinPage2(driver);
	page3=new KiteHomePage3(driver);
}
@BeforeMethod
public void LoginApplication() throws EncryptedDocumentException, IOException
{
	Reporter.log("Application Logged in", true);
	page1.SendUserId(Utility.getDatafromExcel(1, 0));
	page1.SendPassword(Utility.getDatafromExcel(1, 1));
	page1.ClickLogInButton();
	page2.EnterPIN(Utility.getDatafromExcel(1, 2));
	page2.ClickContinue();
}
@Test
public void ValidateUserID() throws EncryptedDocumentException, IOException
{
	int TCID=199;
	Reporter.log("Running"+TCID,true);
	String ActualUserID = page3.ValidateUserID();
	String ExpectedUserID = Utility.getDatafromExcel(2, 0);
	Assert.assertEquals(ActualUserID, ExpectedUserID,"User ID not matching TC failed");
	Reporter.log("User ID matching TC Passed ", true);
	Utility.captureScreenshot(driver, TCID);
}
@AfterMethod
public void LogOutFormApplication() throws InterruptedException
{
	Thread.sleep(2000);
	Reporter.log("Logging out ", true);
	page3.clickOnUserid();
	page3.ClickOnLogout();
}
@AfterClass
public void CloseBroswer() throws InterruptedException
{
	  Thread.sleep(2000);
	  Reporter.log("Closing Browser ", true);
//	  driver.close();
}
}