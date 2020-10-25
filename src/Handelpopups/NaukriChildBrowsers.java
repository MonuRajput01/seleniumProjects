package Handelpopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());//4
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(al.size());//4
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		
	}

}
