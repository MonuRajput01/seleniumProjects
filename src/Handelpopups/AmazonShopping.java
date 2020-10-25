package Handelpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none fluid-image-container'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'AmazonBasics Humidifier with Night Light and Aroma Diffuser - 4-Liter, White')]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Proceed to checkout ')])[1]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9634791873");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amazon@2020");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("(//a[@class='a-declarative a-button-text '])[1]")).click();
		driver.close();
	}

}
