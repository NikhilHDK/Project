package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple2 {
  @Test
  public void Display1() 
  {
	Reporter.log("Hi Good Morning",true);  
  }
}
