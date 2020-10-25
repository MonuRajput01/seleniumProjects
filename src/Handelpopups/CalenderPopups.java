package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopups {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//assignment 1 one month gap time select
		/*
		 * driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		 * driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"))
		 * .click(); driver.findElement(By.xpath("(//a[.='30'])[1]")).click();
		 * driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"))
		 * .click(); driver.findElement(By.xpath("(//a[.='30'])[1]")).click();
		 */
		//assignment 2 click on next using loop
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		  driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		  driver.findElement(By.xpath("(//a[.='30'])[1]")).click();
		  driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
	for(int i=0;i<=4;i++) {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	}
	driver.findElement(By.xpath("(//a[.='30'])[2]")).click();
	}

}
