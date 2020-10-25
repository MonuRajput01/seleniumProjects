package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class yahooSingleselect {


		public static void main(String[] args) throws InterruptedException   {
			System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://yahoo.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='createacc']")).click();
			Thread.sleep(3000);
					WebElement dropdownlist1=driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
			Select sel1=new Select(dropdownlist1);
			sel1.selectByIndex(5);
			WebElement dropdownlist2=driver.findElement(By.xpath("//select[@name='mm']"));
			Select sel2=new Select(dropdownlist2);
			sel2.selectByIndex(10);

	}

}
