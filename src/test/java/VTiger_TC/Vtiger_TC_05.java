package VTiger_TC;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_TC_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Potentials&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		driver.findElement(By.id("jscal_trigger_closingdate")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String control:child) {
			driver.switchTo().window(control);
			driver.findElement(By.xpath("(//td[contains(text(),'25')])[8]")).click();
			break;
			
		}
		driver.switchTo().window(parent);
		
//		Actions a = new Actions(driver);
//		a.moveByOffset(1189, 173).click().perform();
		//driver.findElement(By.xpath("((//td[text()='May, 2024'])[2]/../../..//td[text()='25'])")).click();
	//	driver.findElement(By.xpath("(//td[contains(text(),'25')])[8]"));
		

	}

}
//(//td[text()='July, 2024']/../../..//td[text()='25'])[1]