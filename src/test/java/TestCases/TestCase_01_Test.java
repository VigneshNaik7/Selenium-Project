package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import GenericPackages.ExcelFile;
import POM.ContactConfirmationPage;
import POM.ContactPage;
import POM.HomePage;

public class TestCase_01_Test extends BaseClass {
	@Test
	public void ToCreateConatc() throws EncryptedDocumentException, IOException {
	
	HomePage h1 = new HomePage(driver);
	h1.getContactsLink().click();
	
	ContactPage c1 = new ContactPage(driver);
	c1.getCreateAContactLink1().click();
	
	ExcelFile e = new ExcelFile();
	String lastname = e.ToReadDataFromExcel("Contact", 1, 2);
	c1.getLastNameField().sendKeys(lastname);
	c1.getContactSaveButton().click();
	
	//Confirmation Page
	ContactConfirmationPage cc = new ContactConfirmationPage(driver);
	String msg = cc.getConfirmationMsg().getText();
	
	//1st approuch
	if(msg.contains(lastname)) {
		Reporter.log("TC is passed",true);
		
	}else {
		Reporter.log("TC is failed",true);
	}
	
	//2nd approuch
	//Assert.assertTrue(true, msg);
	
	

}
}
