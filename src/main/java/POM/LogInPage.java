package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(name = "user_name")
	private WebElement UserNameField;
	
	@FindBy(name = "user_password")
	private WebElement PasswordField;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;

	public WebElement getUserNameField() {
		return UserNameField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}
