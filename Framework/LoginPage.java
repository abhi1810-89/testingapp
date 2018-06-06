package pomPAcckage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage 
{
	//Declare Elements
	@FindBy(id="txtUserName")
	private WebElement unTb;
	
	@FindBy(id="txtPassword")
	private WebElement pwdTb;
	@FindBy(id="btnLogin")
	private WebElement lognTb;
	
	//initializing the element
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String un) {
		unTb.sendKeys(un);
	}
	public void setPassword(String un) {
		pwdTb.sendKeys(un);
	}
	public void clickLogin() {
		lognTb.click();
	}
}
