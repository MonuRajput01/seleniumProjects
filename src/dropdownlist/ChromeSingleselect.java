package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeSingleselect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		 driver.findElement(By.id("u_0_2")).click();
		 Thread.sleep(3000);
			WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='birthday_day']"));
			 Select sel=new Select(dropdownlist);
			 	
			sel.selectByIndex(15);
			
	}

}
