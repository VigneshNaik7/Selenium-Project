package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create an')]")
	private WebElement CreateAnOrganizationLink;
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement CreateAnOrganizationLink1;
	
	

	@FindBy(name = "accountname")
	private WebElement OrganizationNameLink;
	
	@FindBy(name = "website")
	private WebElement WebsiteLink;
	
	@FindBy(id = "employees")
	private WebElement EmployeesLink;
	
	@FindBy(id = "email2")
	private WebElement OtherEmailLink;
	
	@FindBy(name = "industry")
	private WebElement IndustryLink;
	
	@FindBy(name = "accounttype")
	private WebElement AccountTypeLink;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement UserRadioButton;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement GroupRadioButton;
	
	@FindBy(xpath = "(//input[@name='button' and @value='  Save  '])[1]")
	private WebElement OrganizationSaveButton;
	
	public WebElement getOrganizationSaveButton() {
		return OrganizationSaveButton;
	}

	public WebElement getCreateAnOrganizationLink() {
		return CreateAnOrganizationLink;
	}
	
	public WebElement getCreateAnOrganizationLink1() {
		return CreateAnOrganizationLink1;
	}

	public WebElement getAccountTypeLink() {
		return AccountTypeLink;
	}

	public WebElement getUserRadioButton() {
		return UserRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}

	public WebElement getOrganizationNameLink() {
		return OrganizationNameLink;
	}

	public WebElement getWebsiteLink() {
		return WebsiteLink;
	}

	public WebElement getEmployeesLink() {
		return EmployeesLink;
	}

	public WebElement getOtherEmailLink() {
		return OtherEmailLink;
	}

	public WebElement getIndustryLink() {
		return IndustryLink;
	}
	
}
