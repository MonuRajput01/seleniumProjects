package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpathMyntra {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://myntra.com");
		driver.manage().window().maximize();
		String actualTitle=	driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains("com"))//that means it will check the com is present in url
		{
			System.out.println("it is present in home page of mantra");
		}
		else {
			System.out.println("it is not present");
		}
		driver.findElement(By.xpath("//a[.='Offers']")).click();
          String actualTitle2=driver.getTitle();
          String actualUrl2=driver.getCurrentUrl();
          if(actualUrl2.contains("offers"))
          {
        	  System.out.println("yes offers is present");
          }
          else {
        	  System.out.println("offers not present");
          }
	}

}
