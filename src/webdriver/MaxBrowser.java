package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MaxBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


	}

}
