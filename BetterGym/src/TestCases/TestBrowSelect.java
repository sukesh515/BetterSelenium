package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




@Test
public class TestBrowSelect extends PageObject.BrowserSelection {
	
	 
	
	public void LoginBrowser() throws IOException{
		
		BrowserSelect();
		
		driver.findElement(By.linkText("Continue")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='from']")));
		
		dropdown.selectByVisibleText("Belfast");
		
		driver.findElement(By.xpath(".//*[@id='planTripFlightDestination']")).sendKeys("Houston, George Bush Intercont (TX) (IAH), USA");
		
		
		
	
		
		
	}
	

}
