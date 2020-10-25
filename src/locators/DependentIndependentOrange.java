package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentOrange {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[.='Directory']")).click();
WebElement desigination=driver.findElement(By.xpath("//b[.='Linda Anderson']/../..//li[.='HR Manager']"));
System.out.println(desigination.getText());

	}

}
