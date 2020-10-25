package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitle {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					  driver.get("https://www.google.com");
					String title=driver.getTitle();
					System.out.println(title);
				}

			}

	