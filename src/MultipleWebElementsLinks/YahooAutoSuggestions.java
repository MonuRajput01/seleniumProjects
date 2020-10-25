package MultipleWebElementsLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com");

WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
searchbar.sendKeys("java");
Thread.sleep(4000);
      List<WebElement> suggestions=driver.findElements(By.xpath("//span[@style='display: block;']"));
System.out.println(suggestions.size());
//always go for if else in atuo suggestions script highly reccomend
for(int i=0;i<suggestions.size();i++)
    {
	if(suggestions.get(i).getText().equalsIgnoreCase("java online compiler"))
	 {
		suggestions.get(i).click();
		break;
	  }
	}
	}
}


