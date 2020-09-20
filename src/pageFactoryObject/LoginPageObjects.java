package pageFactoryObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ConfigClass;

public class LoginPageObjects extends ConfigClass{
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.NAME, using="email_create")
	 public WebElement EmailTextBox;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	public WebElement CreateAccountButton;
	
	public void createAccount() {
		EmailTextBox.sendKeys("ashf@noreply.com");
		CreateAccountButton.click();
	}

}
