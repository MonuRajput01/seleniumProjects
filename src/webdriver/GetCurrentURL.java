package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.Flipkart.com");
		
		System.out.println(driver.getCurrentUrl());

	}

}
