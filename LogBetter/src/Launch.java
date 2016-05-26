
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


@Test
public class Launch {

	public void LaunchBrowser() {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("http://google.co.in");
		 
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(1200,1200);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		
		
		
				
	}

}