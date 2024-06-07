package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import POM.ContactPage;
import POM.HomePage;

public class TestCase_03_Test extends BaseClass {
	
	@Test
	public void ToCreateContact() throws InterruptedException {
		HomePage h1 = new HomePage(driver);
		h1.getContactsLink().click();
		
		ContactPage c1 = new ContactPage(driver);
		
		c1.getCreateAContactLink1().click();
		
		Select s1 = new Select(c1.getMrMsLink());
		s1.selectByValue("Mr.");
		Thread.sleep(2000);
		c1.getFirstNameField().sendKeys("Nuthan");
		c1.getLastNameField().sendKeys("naik");
		c1.getOrganizationSelectLink().click();
		
		//selecting the organization from organization link
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String control:child) {
			driver.switchTo().window(control);
			driver.findElement(By.linkText("Google")).click();
			break;
		}
		driver.switchTo().window(parent);
		
		Select s2 = new Select(c1.getLeadsourceLink());
		s2.selectByValue("Employee");
		Thread.sleep(2000);
		c1.getTitleField().sendKeys("Employee of the year");
		c1.getDepartmentField().sendKeys("Sales");
		Thread.sleep(2000);
		c1.getContactSaveButton().click();
	}

}
