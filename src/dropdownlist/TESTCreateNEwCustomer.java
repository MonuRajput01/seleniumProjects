package dropdownlist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.ActitimeHomePage;
import Pom.ActitimeLoginPage;
import Pom.CreateNewCustomerPage;
import Pom.CustomerAndProjectPage;

public class TESTCreateNEwCustomer {
	@Test
	  public void  customerEdit() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			ActitimeLoginPage login=new ActitimeLoginPage(driver);
			login.loginMethod();
	
			ActitimeHomePage home=new ActitimeHomePage(driver);
			home.taskButtonLinkMethod();
			 
			CustomerAndProjectPage cp=new CustomerAndProjectPage(driver);
			cp.addnewButtonMethod();
			cp.newcustomerMethod();
			 
			CreateNewCustomerPage cnc=new CreateNewCustomerPage(driver);
			cnc.customerareaTextFieldMethod();
			cnc.customerDescriptionareaTextFieldMethod();
			//cnc.cancelMethod();
			//cnc.acceptMethod();
			cnc.createCustomerButtonMethod();
			//cnc.acceptMethod();
			
			home.logoutLinkMethod();
}
}