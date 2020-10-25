package extraConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterJavaScriptExecutor {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement username=driver.findElement(By.id("login-username"));
		//we use jsexecutor whentext field not take values 
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].value='akash@gmail.com'",username);
	}

}
