package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Netflix {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com");
		driver.findElement(By.linkText("Sign In")).click();
	WebElement username=driver.findElement(By.name("userLoginId"));
	username.sendKeys("akashrajput16682@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Akash@2020");
 WebElement checkbox=driver.findElement(By.name("rememberMe"));
	JavascriptExecutor js=(JavascriptExecutor)driver;//upcasting driver into javascript
	js.executeScript("argument[0].click()",checkbox);//pass the argument to click operation perform
	  driver.findElement(By.linkText("Need help?")).click();
	  driver.findElement(By.name("forgot_password_input")).sendKeys("akashrajput16682@gmail.com"); 
	  driver.navigate().back();
	  driver.findElement(By.linkText("Sign up now")).click();
	  driver.findElement(By.name("email")).sendKeys("akashrajput16682@gmail.com");
	  driver.close();
	  
	 
	}

}
