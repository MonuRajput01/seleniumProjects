package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ID {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	//WebElement username=driver.findElement(By.id("email"));
//username.sendKeys("akash");
driver.findElement(By.id("email")).sendKeys("akash");//less lines of code we can use this
driver.close();//it will close the browser
	}

}
