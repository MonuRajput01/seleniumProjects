package locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignSept04 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://demo.actitime.com");
					/*
					 * WebElement username=driver.findElement(By.id("email"));
					 * username.sendKeys("akash");
					 */
		driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
		
			driver.findElement(By.id("keepLoggedInCheckBox")).click();

	}
}
