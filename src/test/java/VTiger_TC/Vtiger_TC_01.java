package VTiger_TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		
		//Login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		//Navigate to contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		//Enter the mandatory fields for contact page and save it
		driver.findElement(By.name("lastname")).sendKeys("Naik");
		driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
		
		//verification
		
		String value=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(value.contains("Naik")){
		System.out.println("TS is passed");
		}else
		{
			System.out.println("TS is failed");
		}
		
		//Signout
		WebElement mousehover = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a = new Actions(driver);
		a.moveToElement(mousehover).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		//Quit the application
		driver.quit();
	}

}
