package webdriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetSetBrowserPosition {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
Point p=new Point(50,300);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
	}

}
