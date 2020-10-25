package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	String actualTitle=	driver.getTitle();
//	if(actualTitle.equals("FACEBOOK"))//title are case sensitive to overcomethis problem we use equal ignorecase
	/*
	 * { System.out.println("title are matching"); } else {
	 * System.out.println("title are not matched"); }
	 */
	String actualUrl=driver.getCurrentUrl();
	if(actualUrl.contains("com"))//that means it will check the com is present in url
	{
		System.out.println("it is present");
	}
	else {
		System.out.println("it is not present");
	}
	}

}
