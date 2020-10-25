package extraConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingToolTip {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement birthdaytooltip=driver.findElement(By.id("birthday-help"));
            String tooltiptext=birthdaytooltip.getAttribute("title");
            if(tooltiptext.equalsIgnoreCase("Click for more information")) 
            {
            	System.out.println("tooltip text is matched");
            }
            else
            {
            	System.out.println("tooltip text is not matched");
            }
	}

}
