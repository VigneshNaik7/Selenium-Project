package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackages.BaseClass;

public class HomePage  {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText = "Calendar")
	private WebElement CalendarLink;
	
	@FindBy(xpath = "//a[@href='index.php?module=Leads&action=index']")
	private WebElement LeadsLink;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement OrganizationsLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement ContactsLink;
	
	@FindBy(xpath = "//a[@href='index.php?module=Potentials&action=index']")
	private WebElement OpportunitiesLinks;
	
	@FindBy(linkText = "Products")
	private WebElement ProductsLink;
	
	@FindBy(linkText = "Documents")
	private WebElement DocumentsLink;
	
	@FindBy(linkText = "Email")
	private WebElement EmailLink;
	
	@FindBy(xpath = "(//a[text()='Trouble Tickets'])[1]")
	private WebElement TroubleTicketsLink;
	
	@FindBy(linkText = "Dashboard")
	private WebElement DashboardLink;
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministratorLink;	
	
	@FindBy(id = "_my_preferences_")
	private WebElement MypreferencesLink;
	
	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	private WebElement SignOutLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement SettingLink;
	
	@FindBy(linkText = "CRM Settings")
	private WebElement CRMSettingsLink;
	
	public WebElement getOrganizationsLink() {
		return OrganizationsLink;
	}

	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getOpportunitiesLinks() {
		return OpportunitiesLinks;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getDocumentsLink() {
		return DocumentsLink;
	}

	public WebElement getEmailLink() {
		return EmailLink;
	}

	public WebElement getTroubleTicketsLink() {
		return TroubleTicketsLink;
	}

	public WebElement getDashboardLink() {
		return DashboardLink;
	}

	public WebElement getMypreferencesLink() {
		return MypreferencesLink;
	}

	public WebElement getSettingLink() {
		return SettingLink;
	}

	public WebElement getCRMSettingsLink() {
		return CRMSettingsLink;
	}

	public WebElement getSignOutLink() {
		return SignOutLink;
	}

	public WebElement getAdministratorLink() {
		return AdministratorLink;
	}

	public WebElement getCalendarLink() {
		return CalendarLink;
	}

	public WebElement getLeadsLink() {
		return LeadsLink;
	}
	
}
