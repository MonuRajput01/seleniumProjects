package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alertpopup2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("covidwork");

WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='active']"));
Select sel=new Select(dropdownlist);
sel.selectByVisibleText("archived");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("(//td[@class='listtblcell lastInRow'])[14]"));
Alert alt=driver.switchTo().alert();
alt.dismiss();
	
	
	}

}
