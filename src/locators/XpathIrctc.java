package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIrctc {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		//using dynamic text by contains locator
		driver.findElement(By.xpath("//a[contains(text(),' REGISTER ')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(
		  "akash@1995");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		  "Akash111");
		  driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).
		  sendKeys("Akash111");
		  driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).
		  sendKeys("kuch bhi");
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
		  "Akash"); driver.findElement(By.
		  xpath("//input[@placeholder='Middle Name  [ Optional ]']")).sendKeys("Rajput"
		  );
		//  driver.findElement(By.xpath("//span[@class='ng-tns-c12-30 ui-calendar']")).
		 // sendKeys("1oct1995");
		  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(
		  "akash@1995gmail");
		  driver.findElement(By.xpath("//input[@placeholder='Mobile']")).sendKeys(
		  "987654321");
		  driver.findElement(By.xpath("//textarea[@placeholder='Flat/Door/Block No.']")
		  ).sendKeys("h.no 327");
		  driver.findElement(By.xpath("//textarea[@placeholder='Flat/Door/Block No.']")
		  ).sendKeys("police line"); 
		  driver.findElement(By.xpath("//textarea[@placeholder='Area/Locality (Optional)']")).sendKeys("bulandshahr");
		  driver.findElement(By.xpath("//input[@name='resPinCode']")).sendKeys("203001"); 
		  driver.findElement(By.xpath("//input[@name='resState']")).sendKeys("up");
		  driver.findElement(By.xpath("//input[@name='resPinCode']")).sendKeys("987654321");
		  driver.findElement(By.xpath("//input[@formcontrolname='officeSameAsRes']")).click();
		  Thread.sleep(5000);
		  driver.quit();
		 
	}
}
