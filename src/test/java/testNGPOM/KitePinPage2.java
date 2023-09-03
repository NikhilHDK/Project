package testNGPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KitePinPage2 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContinueButton;
public KitePinPage2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void EnterPIN(String PinNum)
{
	Pin.sendKeys(PinNum);
}
public void ClickContinue()
{
	ContinueButton.click();
}
}
