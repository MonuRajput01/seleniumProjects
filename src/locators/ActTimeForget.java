package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeForget {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.linkText("Forgot your password?")).click();
		WebElement link=driver.findElement(By.partialLinkText("Forgot"));
		System.out.println(link.getText());//it will give the link text
	link.click();
	
	driver.close();
	//driver.quit();
	}

}
