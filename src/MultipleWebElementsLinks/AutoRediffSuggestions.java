package MultipleWebElementsLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoRediffSuggestions {

	public static void main(String[] args)throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
driver.manage().window().maximize();
WebElement searchbar=driver.findElement(By.xpath("//input[@placeholder='Search for a product, category or brand']"));
searchbar.sendKeys("electric");
Thread.sleep(5000);
List<WebElement> suggestions=driver.findElements(By.xpath("//p[@style='padding:0 0 0 15px;font-size:12px;']"));
System.out.println(suggestions.size());
//always go for if else in atuo suggestions script highly reccomend

  for(int i=0;i<suggestions.size();i++) {
	  
  if(suggestions.get(i).getText().equalsIgnoreCase("electric scooter")) 
  {
  suggestions.get(i).click();
  break; 
  } 
  }
 
}
}

