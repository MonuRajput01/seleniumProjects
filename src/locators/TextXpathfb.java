package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpathfb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
WebElement link=driver.findElement(By.xpath("//a[.='Forgotten account?']"));//this syntax is used only when their is a textvalue present
System.out.println(link.getText());
link.click();
	}

}
