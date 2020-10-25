package extraConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogFiles {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.logfile",
		 * "./seleniumlogfiles/chromelog.txt");
		 * System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./seleniumlogfiles/firefoxlog.txt");
		System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9634791873");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amankumar@2019");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

	}

}
