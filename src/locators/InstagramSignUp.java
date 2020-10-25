package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InstagramSignUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.instagram.com");
				WebElement userlink1=driver.findElement(By.linkText("Sign up"));
			
	System.out.println(userlink1.getText());
	
	userlink1.click();
Thread.sleep(5000);//if the webelement is not loaded then use this method bcuz webelement laods slowely then selenium script
				  
driver.findElement(By.name("emailOrPhone")).sendKeys("9634791873");
  driver.findElement(By.name("fullName")).sendKeys("Akash kumar");
  driver.findElement(By.name("username")).sendKeys("akash@1995");
 driver.findElement(By.name("password")).sendKeys("Akash@pwd");
 driver.quit();
				 
	}

}
