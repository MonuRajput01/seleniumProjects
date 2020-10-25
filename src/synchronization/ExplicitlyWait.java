package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleIs("akash"));--->TimeoutException
	//	wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
  //   wait.until(ExpectedConditions.titleContains("actiTIME - Enter "));//partial text is sucficient
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));-->timeoutExceptions bucz html locator is case sensitive
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='menu_icon'])[2]")));
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();

	}

}
