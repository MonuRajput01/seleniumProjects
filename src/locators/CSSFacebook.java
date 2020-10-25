package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSFacebook {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				  driver.findElement(By.id("u_0_2")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(
				  "akash");
				  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(
				  "password");
				  driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(
				  "9634701873");
				  driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys(
				  "Newpassword"); driver.close();
				 
	}

}
