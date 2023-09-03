package testNGPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KiteLogInPage1 
{
	@FindBy(id="userid")private WebElement UserID;
	@FindBy(xpath="//input[@id='password']")private WebElement Password;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LogInButton;
public KiteLogInPage1(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void SendUserId(String Username)
{
	UserID.sendKeys(Username);	
}
public void SendPassword(String PWD)
{
	Password.sendKeys(PWD);
}
public void ClickLogInButton()
{
	LogInButton.click();
}
}
