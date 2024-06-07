package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import GenericPackages.ExcelFile;
import POM.HomePage;
import POM.OrganizationPage;

public class TestCase_02 extends BaseClass {
	
	@Test
	
	public void ToCreateOrganization() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h1 = new HomePage(driver);
		h1.getOrganizationsLink().click();
		
		OrganizationPage o1 = new OrganizationPage(driver);
		o1.getCreateAnOrganizationLink1().click();
		ExcelFile e1 = new ExcelFile();
		String value = e1.ToReadDataFromExcel("Organization", 2, 2);
		
		o1.getOrganizationNameLink().sendKeys(value);
		
		WebElement industry = o1.getIndustryLink();
		 Select s1 = new Select(industry);
		 Thread.sleep(2000);
		 s1.selectByValue("Banking");
		
		 
		 WebElement accounttype = o1.getAccountTypeLink();	
		 Select s2 = new Select(accounttype);
		 s2.selectByValue("Analyst");
		 Thread.sleep(2000);
		 
		 o1.getOrganizationSaveButton().click();
		 
		 
	}

}
