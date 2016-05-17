package PageObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TestLogin {
	
	
	@Test
	
	public void LoginBet() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");
		
		LoginPageBetter lp = new LoginPageBetter(driver);
		
		lp.username().sendKeys("sukesh515@gmail.com");
		lp.Password().sendKeys("Hyundai515");
		
		lp.Login().click();
		Thread.sleep(3220L);
		lp.Logout().click();
		
		
		/*MakeBookingPage  makeb = new MakeBookingPage(driver);
		
		makeb.MakeBooking().click();
		
		makeb.AvoneilCheckbox().click();
				
		makeb.AvoneilCheckbox().click();
		
		Thread.sleep(3220l);
		
		makeb.OtherActivities().click();
		
		Thread.sleep(3220l);
		
		makeb.badmintoncheckbox().click();
		
		Thread.sleep(3220l);
		makeb.bookingsubmit().click();
		*/
		
	}
		
	

}
