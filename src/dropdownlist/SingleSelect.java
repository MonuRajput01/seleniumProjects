package dropdownlist;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		 driver.findElement(By.id("u_0_2")).click();
		 Thread.sleep(3000);
		WebElement dropdownlist1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select sel1=new Select(dropdownlist1);
		 
		sel1.selectByIndex(1);
		WebElement dropdownlist2=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select sel2=new Select(dropdownlist2);
		 
		sel2.selectByIndex(10);
		WebElement dropdownlist3=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select sel3=new Select(dropdownlist3);
		 
	sel3.selectByVisibleText("1995");
}

}
