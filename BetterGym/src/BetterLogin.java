
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;




public class BetterLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		 driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");	
		 
		 driver.findElement(By.id("login_Email")).sendKeys("sukesh515@gmail.com");
		 driver.findElement(By.id("login_Password")).sendKeys("Hyundai515");
		 driver.findElement(By.id("login")).click();
		 driver.findElement(By.linkText("Make a Booking")).click();
		/* driver.findElement(By.xpath("//input[@value='330']")).isSelected();
		 driver.findElement(By.xpath("//input[@value='329']")).isSelected();
		 */
		 driver.findElement(By.xpath(".//*[@id='contentWrapper']/div[2]/div/div[2]/div[1]/form/div[3]/label/input")).click();
		 
		 driver.findElement(By.xpath(".//*[@id='contentWrapper']/div[2]/div/div[2]/div[1]/form/div[3]/label/input")).click();
		 
              Thread.sleep(120);
              
			 
		  driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label")).click();
		  
		  driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label")).click();
		  
		  Thread.sleep(120);
		 
		  driver.findElement(By.xpath(".//*[@id='activities']/div[1]/label")).click();   
		  Thread.sleep(350);
		  
		  driver.findElement(By.xpath(".//*[@id='bottomsubmit']")).click();
		  
		  
		  
		  
		
		 
		
			
		

		 
		

	}

}
