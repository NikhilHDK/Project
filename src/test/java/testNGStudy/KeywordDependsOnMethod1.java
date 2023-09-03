package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependsOnMethod1 {
@Test(priority = 1)
public void Login()
{
	Reporter.log("Login sucess",true);
	Assert.fail();
}	
@Test(priority = 2)
public void VerifyPin()
{
	Reporter.log("Pin Verified",true);
}
@Test (dependsOnMethods = "Login")
public void Logout()
{
	Reporter.log("Logout success", true);
}
}
