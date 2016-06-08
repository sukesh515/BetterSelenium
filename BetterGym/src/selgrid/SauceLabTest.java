package selgrid;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabTest {
	@Test
public void setup() throws MalformedURLException
{
	DesiredCapabilities dc= DesiredCapabilities.firefox();
	dc.setCapability("version", "25");
	dc.setCapability("platform", "XP");
	dc.setCapability("name", "Web Driver demo Test");
	dc.setCapability("tags", "Tag1");
    dc.setCapability("build", "build-1234");
	
	
WebDriver driver = new RemoteWebDriver(
                new URL("http://sukesh515:2b2aa014-a432-47c3-9c84-e3fb76d7f951@ondemand.saucelabs.com:80/wd/hub"),
                dc);

driver.get("http://ebay.com");
System.out.println(driver.getTitle());
driver.close();
driver.quit();

	
	
}   //http://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub
	
	
}
