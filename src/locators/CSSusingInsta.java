package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSusingInsta {

	public static void main(String[] args)throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.cssSelector("input[type$='text']")).sendKeys("akash@1995");
		driver.findElement(By.cssSelector("input[aria-label$='Password']")).sendKeys("passwrd");
		Thread.sleep(5000);
		driver.quit();
	}

}
