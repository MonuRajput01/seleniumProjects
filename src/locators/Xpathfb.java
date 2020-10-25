package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfb {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("akash@");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
