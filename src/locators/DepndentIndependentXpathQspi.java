package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepndentIndependentXpathQspi {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qspiders.com/contact");
		//noida number using traversing
	WebElement mobileNo=driver.findElement(By.xpath("//p[.='Noida']/../..//span[contains(text(),'+91')]"));
System.out.println("The noida Qspider office number is:"+mobileNo.getText());
//Usa number using traversing
WebElement mobileNo2=driver.findElement(By.xpath("//p[contains(text(),'United')]/../..//span[contains(text(),'+44')]"));

System.out.println("The Usa Qspider office number is:"+mobileNo2.getText());

	}

}
