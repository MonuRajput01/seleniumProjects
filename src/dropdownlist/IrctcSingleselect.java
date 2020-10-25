package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSingleselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']")).click();
		Thread.sleep(5000);
		WebElement dropdownlist1=driver.findElement(By.xpath("//select[@formcontrolname='resCountry']"));
		Select sel1=new Select(dropdownlist1);
		sel1.selectByIndex(5);
		WebElement dropdownlist2=driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
		Select sel2=new Select(dropdownlist2);
		sel2.selectByIndex(5);
		
	}

}
