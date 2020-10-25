package extraConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyField {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("akash");
		String text=username.getAttribute("value");
		//System.out.println(text.isEmpty());
		System.out.println(text.length());
		if(text.length()==0) {
			System.out.println("field is empty");
		}
		else {
			System.out.println("field is not empty");
		}
	}

}
