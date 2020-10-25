package Handelpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VlcDownload {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://filehippo.com/");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
		driver.findElement(By.xpath("//span[.='VLC Media Player 64-bit']")).click();
		
	//using traversing
		//driver.findElement(By.xpath("//a[contains(text(),'Popular ')]")).click();
		//driver.findElement(By.xpath("//p[contains(text(),'VLC ')][1]/../..//span[.='Download']")).click();
		//Thread.sleep(3000);		
	}

}
