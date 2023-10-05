import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		WebElement emailInput = driver.findElement(By.id("email_address"));
		emailInput.sendKeys(Email);
		String emailInputValue = emailInput.getAttribute("value");
		
		driver.findElement(By.id("password")).sendKeys(FinalPassoward)
		;
		WebElement PasswoardInput= driver.findElement(By.id("password-confirmation"));
		PasswoardInput.sendKeys(FinalPassoward);
		String PasswoardInputValue = PasswoardInput.getAttribute("value");
		
		driver.findElement(By.className("primary")).click();
		
		
		System.out.println("Email Input Value: " + emailInputValue);
		
		System.out.println("Passwoard Input Value: " + PasswoardInputValue);
		
		}
	
	
	@AfterTest
	public void MyAfterTest() {
		 
	}

}
