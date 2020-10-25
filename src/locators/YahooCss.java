package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class YahooCss {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
				driver.get("https://yahoo.com");
				
				
				driver.findElement(By.id("header-signin-link")).click();
			
				driver.findElement(By.partialLinkText("Create")).click();
				Thread.sleep(5000);
				//we can use cssselector when we have a 1of1 value//
				driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("akash");
				driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("passwrd");
				driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("akash@1995");
				driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
				driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("99887766");
				driver.findElement(By.cssSelector("input[name='dd']")).sendKeys("10");
				driver.findElement(By.cssSelector("input[name='yyyy']")).sendKeys("1995");
				driver.findElement(By.cssSelector("input[name='freeformGender']")).sendKeys("male");
				Thread.sleep(5000);
				driver.quit();
		

}}
