package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.BrowserSelection;
import PageObject.LoginPageBetter;


@Test
public class TestBroe extends BrowserSelection {
	
	 
	
	public void LoginBrowser() throws IOException{
		
		BrowserSelect();
		
  LoginPageBetter lp = new LoginPageBetter(driver);
		
		lp.username().sendKeys("sukesh515@gmail.com");
		lp.Password().sendKeys("Hyundai515");
		
		lp.Login().click();
		
		driver.close();
		
		
	}
	

}
