package testNGPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KiteHomePage3 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement Userid;
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logout;
public KiteHomePage3 (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String ValidateUserID()
{
	String ActualUserid  = Userid.getText();
	return ActualUserid; 
}
public void clickOnUserid()
{
	Userid.click();
}
public void ClickOnLogout()
{
	logout.click();
}


}
