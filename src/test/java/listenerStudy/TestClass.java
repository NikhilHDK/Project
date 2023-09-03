package listenerStudy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerStudy.Listener.class)  
public class TestClass {
@Test
public void TC1() 
{
	Reporter.log("TC1 Running",true);
}
@Test
public void TC2()
{
	Reporter.log("TC2 Running",true);
}
@Test
public void TC3()
{
	Assert.fail();
	Reporter.log("TC3 running",true);
}
@Test(dependsOnMethods = "TC3")
public void TC4()
{
	Reporter.log("TC4 running",true);
}
public static void main(String[] args) {
	System.out.println("HI git hub 2"); {
		// TODO Auto-generated method stub

	}
}
}