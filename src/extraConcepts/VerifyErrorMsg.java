package extraConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement errormessage=driver.findElement(By.xpath("//button[@name='login']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",errormessage);
                    String actualerrormessage=errormessage.getText();
                    String expectederrormessage="akash";
                    if(actualerrormessage.equalsIgnoreCase(expectederrormessage)) {
                    	System.out.println("both r matching");
                    }
                    else {
                    	System.out.println("both r not matching");
                    }
	}

}
