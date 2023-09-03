package suiteLevelListerner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Base implements ITestListener 
{
	Base b=new Base();
	@Override
public void onTestStart(ITestResult result)
{
}
@Override
public void onTestSuccess(ITestResult result)
{
}
@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("Test Failed plz try again faild name is"+result.getName());
	String TCName = result.getName();
	try {
		b.captureScreenshot(TCName);
		} catch (IOException e) {		
			e.printStackTrace();
		}
}
@Override
public void onTestSkipped(ITestResult result)
{
}
@Override
public void onStart(ITestContext context)
{
}
@Override
public void onFinish(ITestContext context)
{
}

}
