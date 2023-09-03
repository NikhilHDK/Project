package listenerStudy;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Listener implements ITestListener {
@Override
public void onTestFailure(ITestResult result) 
{
	Reporter.log("Take ScreenShot",true);
}
@Override
public void onTestSuccess(ITestResult reuslt)
{
	Reporter.log("Test Passed Successfullylily",true);
}
@Override
public void onTestSkipped(ITestResult result)
{
	Reporter.log("This Test Is Skipped",true);
}
}