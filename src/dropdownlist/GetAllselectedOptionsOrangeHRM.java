package dropdownlist;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectedOptionsOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				driver.findElement(By.xpath("//b[.='Directory']")).click();
				//job title dropdown
WebElement dropdownlist1=driver.findElement(By.xpath("//select[@name='searchDirectory[job_title]']"));
	Select sel1=new Select(dropdownlist1);
	sel1.selectByVisibleText("HR Manager");
	System.out.println(sel1.isMultiple());
List<WebElement> selectedoption1=sel1.getAllSelectedOptions();
System.out.println(selectedoption1.size());
for(int i=0;i<selectedoption1.size();i++) {
	System.out.println(selectedoption1.get(i).getText());
}
	
	//location dropdown
	WebElement dropdownlist2=driver.findElement(By.xpath("//select[@name='searchDirectory[location]']"));
	Select sel2=new Select(dropdownlist2);
	sel2.selectByIndex(1);
	System.out.println(sel2.isMultiple());
	List<WebElement> selectedoption2=sel2.getAllSelectedOptions();
	System.out.println(selectedoption2.size());
	for(int i=0;i<selectedoption2.size();i++) {
		System.out.println(selectedoption2.get(i).getText());
	}
	Thread.sleep(5000);
	driver.close();
	}

}
