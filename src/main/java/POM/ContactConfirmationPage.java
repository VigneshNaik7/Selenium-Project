package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactConfirmationPage {
	
	public ContactConfirmationPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ConfirmationMsg;

	public WebElement getConfirmationMsg() {
		return ConfirmationMsg;
	}
	
}
