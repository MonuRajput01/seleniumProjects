package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveValue {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("akash");
		System.out.println(username.getAttribute("value"));
		//TO GET THE BOOLEAN VALUE 
	System.out.println(username.isDisplayed());
	System.out.println(username.isEnabled());
	System.out.println(username.isSelected());
	//TO GET THE SIZE,COLOUR,FONT of TEXT
	System.out.println(username.getCssValue("font-size"));
	System.out.println(username.getCssValue("font-family"));
	System.out.println(username.getCssValue("color"));
		

	}

}
