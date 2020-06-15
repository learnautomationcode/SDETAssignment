package packSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cp=new DesiredCapabilities();
	//	cp.setBrowserName("chrome"); //Both line 15 and 16 are same
	//	cp.setCapability("BrowserName", "chrome");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		options.merge(cp);
		
		
		WebDriver driver1=new  RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"),options);
		driver1.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		WebDriver driver2=new  RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"),options);
		driver2.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

}
