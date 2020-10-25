package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(4000);
		WebElement dropdownlist1=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
        Select sel1=new Select(dropdownlist1);
        sel1.selectByIndex(1);
        List<WebElement> options=sel1.getOptions();
        System.out.println(options.size());
        for(int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        }
        
        
		/*
		 * WebElement
		 * dropdownlist2=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		 * Select sel2=new Select(dropdownlist2); sel2.selectByIndex(10);
		 * Thread.sleep(2000);
		 * 
		 * WebElement
		 * dropdownlist3=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		 * Select sel3=new Select(dropdownlist3); sel3.selectByVisibleText("1995");
		 */
	
	}

}
