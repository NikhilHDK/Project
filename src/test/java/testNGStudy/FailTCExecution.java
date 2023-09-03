package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTCExecution {
@Test(timeOut = 100)
public void TC6() throws InterruptedException
{
		  	Reporter.log("TC6 Running",true);
		  	//Thread.sleep(200);
}	  
@Test
public void TC7()
{
		  	Reporter.log("TC7 Running",true);
}	  
@Test
public void TC8()
{
			Reporter.log("TC8 Running",true);
			//Assert.fail();
}
@Test
public void TC9()
{
		  Reporter.log("TC9 Running",true);
}
@Test
public void TC10()	  
{
		  Reporter.log("TC10 Running",true);
}
}
