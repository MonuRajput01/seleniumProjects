package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbgetENableSelectedDisabled {

	public static void main(String[] args) throws InterruptedException  {
		
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
		
		  WebElement checkbox=driver.findElement(By.xpath("//input[.='2']"));
		  checkbox.click();
		  Thread.sleep(2000);
		  System.out.println(checkbox.isDisplayed());
		  System.out.println(checkbox.isSelected());
		  System.out.println(checkbox.isEnabled());
		 
	}

}
