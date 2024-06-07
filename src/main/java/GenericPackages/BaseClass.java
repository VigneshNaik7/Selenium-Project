package GenericPackages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.HomePage;
import POM.LogInPage;

public class BaseClass {
	PropertyFile p = new PropertyFile(); //both property and excel file is delcalred globally
	ExcelFile e = new ExcelFile();
	public WebDriver driver = null;
	
	@BeforeSuite
	public void BeforeSuiteConfig() {
		Reporter.log("DataBase connection established",true);
	}
	
	@BeforeClass
	public void ToLaunchBrowser() throws IOException {
		String BROWSER = p.ToReadDataFromPropertyFile("Browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (BROWSER.equalsIgnoreCase("edge"))
			driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@BeforeMethod
	public void NavigateToURL() throws IOException {
		String url = p.ToReadDataFromPropertyFile("URL");
		String username = p.ToReadDataFromPropertyFile("UserName");
		String password = p.ToReadDataFromPropertyFile("Password");
		driver.get(url);
		LogInPage l = new LogInPage(driver);
		l.getUserNameField().sendKeys(username);
		l.getPasswordField().sendKeys(password);
		l.getLoginButton().click();
	}
	
	@AfterMethod
	public void ToLogOut() {
		HomePage h = new HomePage(driver);
		Actions a = new Actions(driver);
		a.moveToElement(h.getAdministratorLink()).perform();
		h.getSignOutLink().click();
		Reporter.log("Application is logout",true); //Not required for our understanding purpose
	}
	
	@AfterClass
	public void CloseTheBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void AfterSuiteConfig() {
		Reporter.log("Database connection is removed",true);
	}


}
