package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteWithoutShortcut {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("akash");
		String usernamevalue=username.getAttribute("value");
	WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("value");
String passwordvalue=password.getAttribute("value");
if(passwordvalue.equalsIgnoreCase(usernamevalue))
{
	System.out.println("copy paste is successfull");
}
else {
	System.out.println("not copied");
}
	}

}
