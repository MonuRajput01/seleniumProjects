package Handelpopups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriToAmazonSwitch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();//will store parent url
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());//4
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allwindows);
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);//switch to new window
		}
		//after getting ctrl on new window perform operation
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		//again switch for new window
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);//switch to new window
		}

		System.out.println(driver.getCurrentUrl());//wil get the url of the page
		System.out.println(driver.getTitle());//will get the title of page
		driver.close();
		driver.switchTo().window(al.get(1));//switch to old cogzinent window whose index is 3
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		//driver.switchTo().window(al.get(0));
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();

	}

}
