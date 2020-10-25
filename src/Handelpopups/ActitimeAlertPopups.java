package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAlertPopups {

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
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("akash work");
driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
       Alert alt=driver.switchTo().alert();
       System.out.println(alt.getText());//to get the popup text 
       //alt.accept();
       alt.dismiss();
	}

}
