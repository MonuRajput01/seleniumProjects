package MultipleWebElementsLinks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BingSearchAutoSuggest {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://bing.com");
		WebElement searchbar=driver.findElement(By.xpath("//input[@type='search']"));
		searchbar.sendKeys("haldiram");
		Thread.sleep(5000);
		List<WebElement> autosuggest=driver.findElements(By.xpath("//span[contains(text(),'haldiram ')]"));
	       System.out.println(autosuggest.size());
	       //method 1 using arrowdown 
			/*
			 * for(int i=0;i<4;i++) { Thread.sleep(2000);
			 * searchbar.sendKeys(Keys.ARROW_DOWN); } searchbar.sendKeys(Keys.ENTER);
			 */
	//direct click on that element on search bar
			/*
			 * Thread.sleep(4000);
			 * driver.findElement(By.xpath("//strong[.='online shopping')]")).click();
			 */
	       for(int i=0;i<autosuggest.size();i++)
	       {
	    	   if(autosuggest.get(i).getText().equalsIgnoreCase("haldiram online shopping"));
	    	   {
	    		   autosuggest.get(i).click();
	    		   break;
	    	   }
	       }
	       
	}

}
