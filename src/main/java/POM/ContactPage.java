package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ContactPage {
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy (xpath = "//a[contains(text(),'Create a')]")
	private WebElement CreateAContactLink;
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement CreateAContactLink1;
	
	@FindBy(name = "salutationtype")
	private WebElement MrMsLink;
	
	@FindBy(name = "firstname")
	private WebElement FirstNameField;
	
	@FindBy(name = "lastname")
	private WebElement LastNameField;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement OrganizationSelectLink;
	
	@FindBy(xpath = "//input[@onclick=\"this.form.account_id.value=''; this.form.account_name.value='';return false;\"]")
	private WebElement ClearOrganizationLink;
	
	@FindBy(name = "leadsource")
	private WebElement LeadsourceLink;
	
	@FindBy(id = "title")
	private WebElement TitleField;
	
	@FindBy(id = "department")
	private WebElement DepartmentField;
	
	@FindBy(id = "email")
	private WebElement EmailFiled;
	
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement ContactSaveButton;
	
	
	public WebElement getCreateAContactLink1() {
		return CreateAContactLink1;
	}


	public WebElement getMrMsLink() {
		return MrMsLink;
	}


	public WebElement getFirstNameField() {
		return FirstNameField;
	}


	public WebElement getLastNameField() {
		return LastNameField;
	}


	public WebElement getOrganizationSelectLink() {
		return OrganizationSelectLink;
	}


	public WebElement getClearOrganizationLink() {
		return ClearOrganizationLink;
	}


	public WebElement getLeadsourceLink() {
		return LeadsourceLink;
	}


	public WebElement getTitleField() {
		return TitleField;
	}


	public WebElement getDepartmentField() {
		return DepartmentField;
	}


	public WebElement getEmailFiled() {
		return EmailFiled;
	}


	public WebElement getContactSaveButton() {
		return ContactSaveButton;
	}


	public WebElement getCreateAContactLink() {
		return CreateAContactLink;
	}

	
}