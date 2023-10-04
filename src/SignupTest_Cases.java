import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest_Cases extends Parameters {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		
		driver.get(url);
		driver.findElement(By.xpath(CreatAccountXpath)).click();
	}
	

	@Test()

	public void CreatOneContact() {
		
		driver.findElement(By.className("required-entry")).sendKeys(FirstName);
		driver.findElement(By.id("lastname")).sendKeys(LasttName);
		driver.findElement(By.id("email_address")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(FinalPassoward);
		driver.findElement(By.id("password-confirmation")).sendKeys(FinalPassoward);
		driver.findElement(By.className("primary")).click();
		
		}
	
	
	@AfterTest
	public void MyAfterTest() {
		
	}

}
