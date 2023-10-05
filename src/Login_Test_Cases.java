import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_Cases extends Parameters {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup () {
		driver.get(url);
		driver.findElement(By.xpath(SignUpXpath)).click();
	}
	
	@Test ()
	
	public void LogInProsses() {
		
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(FinalPassoward);
		driver.findElement(By.className("primary")).click();
	}
	
	
	@AfterTest
	public void MyAfterTest () {}
	
	
}
