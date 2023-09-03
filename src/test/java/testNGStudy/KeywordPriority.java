package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority {
	@Test	(priority = 5)
	public void C()
	{
		Reporter.log("C is running",true);
	}
	@Test	(priority = -5)
    public void A()
	{
		Reporter.log("A is running",true);
	}
	@Test	(priority = 0)
	public void B() 
	{
		Reporter.log("B is running",true);
	}
}
