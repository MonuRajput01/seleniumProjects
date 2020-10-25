package extraConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
JavascriptExecutor js=(JavascriptExecutor)driver;
for(int i=0;i<=5;i++) {
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,1000)");
}
for(int i=0;i<=5;i++) {
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-1000)");
}
	}

}
