package packSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setting path for chromedriver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		// reference variable
		WebDriver driver;

		ChromeOptions option = new ChromeOptions();

		option.setPageLoadStrategy(PageLoadStrategy.NONE);
		// create instance of chromedriver
		driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// navigate to URL

		driver.get("https://facebook.com");
		// driver.get("http://automationpractice.com/index.php");

		/// Thread.sleep(4000);
		// entering username
		// locator id
		// WebElement user= driver.findElement(By.id("email"));
		// user.sendKeys("test");

		// locator name
		// WebElement user = driver.findElement(By.name("email"));
		// user.sendKeys("test");

		// locator linkText
		// WebElement linkForgetAccount =
		// driver.findElement(By.linkText("Forgotten account?"));
		// linkForgetAccount.click();

		// locator Partial linkText
		// WebElement PlinkForgetAccount =
		// driver.findElement(By.partialLinkText("Forgotten"));
		// PlinkForgetAccount.click();

		// locator className, change url automationpractice.com and spy signin
		// button
		// WebElement signinlink = driver.findElement(By.className("login"));
		// signinlink.click();

		// locator xpath
		// WebElement username =
		// driver.findElement(By.xpath("//input[@id='email']"));
		// username.sendKeys("test");
		
		//taking the reference of the label tag and reaching to input tag in the below example
		WebElement loginbtn = driver.findElement(By.xpath("//label[@id='loginbutton']/input"));
		loginbtn.click();

		// locator cssSelector
		// WebElement username = driver.findElement(By.cssSelector("#email"));
		// username.sendKeys("test");

		
		

	}

}
