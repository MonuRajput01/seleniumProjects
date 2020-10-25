package Handelpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		System.out.println(driver.getWindowHandle());//will get only parent window
	Set<String> allwindow=driver.getWindowHandles();//will get allwindows paerent+childs
	System.out.println(allwindow);
	}

}
