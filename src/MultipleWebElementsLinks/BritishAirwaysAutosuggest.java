package MultipleWebElementsLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishAirwaysAutosuggest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://britishairways.com");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.xpath("//input[@aria-label='search bar Departure field']"));
		searchbar.sendKeys("del");
		Thread.sleep(5000);
		
		List<WebElement> autosuggest=driver.findElements(By.xpath("//label[contains(text(),'From ')]/..//input[@type='text']"));
	       System.out.println(autosuggest.size());
	       for(int i=0;i<autosuggest.size();i++)
	       {
	    	   if(autosuggest.get(i).getText().equalsIgnoreCase("Delhi, Delhi (DEL), India"))
	    	   {
	    		   autosuggest.get(i).click();
	    		   break;
	    	   }
	       
	       }
			/*
			 * WebElement searchbar2=driver.findElement(By.
			 * xpath("//input[@aria-label='search bar Destination field']"));
			 * searchbar2.sendKeys("dub"); Thread.sleep(5000);
			 * 
			 * List<WebElement>
			 * autosuggest2=driver.findElements(By.xpath("//div[@id='typeahead-to']"));
			 * System.out.println(autosuggest2.size()); for(int
			 * i=0;i<autosuggest2.size();i++) {
			 * if(autosuggest2.get(i).getText().equalsIgnoreCase("Dubai, Dubai (DXB), UAE"))
			 * { autosuggest2.get(i).click(); break; } }
			 */

	}
}
