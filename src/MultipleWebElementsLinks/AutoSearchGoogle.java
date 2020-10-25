package MultipleWebElementsLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearchGoogle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
	searchbar.sendKeys("selenium");
	Thread.sleep(5000);
	List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
System.out.println(suggestions.size());	
	for(int i=0;i<suggestions.size();i++) {
		if(suggestions.get(i).getText().equalsIgnoreCase("selenium interview questions"))
		{
			suggestions.get(i).click();
			break;
		}
	}
	}

}
