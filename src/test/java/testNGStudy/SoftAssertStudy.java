package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {

	SoftAssert soft=new SoftAssert();
	
@Test
public void TC1() 
{
	String ExpectedResult="VCTCPune";
	String ActualResult="VCTCPune";
	soft.assertEquals(ActualResult, ExpectedResult,"Value is Not Matching");
	Reporter.log("TC1 softAssert is running",true);
	
	soft.assertNotNull(ActualResult);
	Reporter.log("Running TC1",true);
	
	soft.assertAll();
	
}
}
