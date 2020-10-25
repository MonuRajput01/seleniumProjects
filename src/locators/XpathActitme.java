package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActitme {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		//driver.findElement(By.xpath("//input[.='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[.='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
driver.findElement(By.xpath("//a[@id='loginButton']")).click();
driver.close();
	}

}
