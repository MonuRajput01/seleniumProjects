package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsActtime {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menuTable']//div[contains(@class,'topMenuButton')])[2]")).click();
		Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Types of Work']")).click();
			driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
	WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='active']"));
	Select sel=new Select(dropdownlist);
	sel.selectByIndex(1);
	System.out.println(sel.isMultiple());
	List<WebElement> selectedoption=sel.getAllSelectedOptions();
	System.out.println(selectedoption.size());
	for(int i=0;i<selectedoption.size();i++) {
		System.out.println(selectedoption.get(i).getText());
	}
	
	
	
			/*
			 * driver.findElement(By.xpath("//input[@name='name']")).sendKeys("akash@123");
			 * driver.findElement(By.xpath("//input[@type='submit']")).click();
			 * 
			 * driver.findElement(By.xpath(
			 * "//a[.='akash@123']/../..//a[contains(text(),'delete')]")).click();
			 * Thread.sleep(5000);
			 */
			

	}

}
