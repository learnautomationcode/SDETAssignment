package packSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SeleniumDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		 // setting path for chromedriver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
        // reference variable
      //  WebDriver driver;

        ChromeOptions option = new ChromeOptions();

        option.setPageLoadStrategy(PageLoadStrategy.NONE);
        // create instance of chromedriver
        driver = new ChromeDriver(option);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 // navigate to URL
        
        //WebDriver wait
       // WebDriverWait wait=new WebDriverWait(driver, 10);
      //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        

        //Webdriver methods
        
        //1. navigate you to the application
        driver.get("http://www.facebook.com");
      //  driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
        
        //2.to get the current url,to check whether we r landing on the correct paGE
      String url=  driver.getCurrentUrl();
      System.out.println(url);
      
      //3. to get the title
     String title= driver.getTitle();
     System.out.println(title);
        
     
     //4.getWindowhandle     
   String wndhnld=driver.getWindowHandle();
   System.out.println(wndhnld);
     
     
     //5.getwindowhandles
  //   driver.findElement(By.xpath("//a[@title='Continue to Login']")).click();
  //   Thread.sleep(2000);
     
     //6.switchto.window
     
     
     
//   driver.switchTo().window(arg0)
     
     
   
      Set<String> wndwohndles = driver.getWindowHandles();
      
      for (String uniqustrngvalue:wndwohndles) {
          
          driver.switchTo().window(uniqustrngvalue);
          
          String wintitle = driver.getTitle();
          
          if (!(wintitle.contains("Enjoy"))) {
              break;
          }
//        if (!(uniqustrngvalue.equalsIgnoreCase(wndhnld))) {
//            driver.switchTo().window(uniqustrngvalue);
//            
//            break;
//        }
//        System.out.println(uniqustrngvalue);
      }
 
      
      driver.findElement(By.name("j_username")).sendKeys("test");
      

     
     //7.  close method
   /*  driver.close();// close the current window on which control is present
     Thread.sleep(2000);
     driver.switchTo().window(wndhnld);// even after close, u need to switch to parent window
     //8. quit
     driver.quit();// closes all wndow
*/
     // Browser specific methods
     // 8 full screen
     driver.manage().window().fullscreen();
     
     //9 getposition
   Point p=  driver.manage().window().getPosition();
   
   
   System.out.println( p.getX());
   System.out.println(p.getY());
   
   //10 getSize //returns dimension height and width 
  Dimension d= driver.manage().window().getSize();
  System.out.println( d.getHeight());
  System.out.println(d.getWidth());
  
  
  // 11 change size of the window, to check responsiveness of application
  driver.manage().window().setSize(new Dimension(560,700));
  Dimension d1= driver.manage().window().getSize();
  System.out.println( d1.getHeight());
  System.out.println(d1.getWidth());
  
  //12 set Position
  driver.manage().window().setPosition(new Point(100,50)); //u can put negative value also
  
  
  //13 Capture Screenshot
  TakesScreenshot s= (TakesScreenshot) driver;
 File src= s.getScreenshotAs(OutputType.FILE);
 
 File dest=new File("C:\\img.png");
 
 Files.copy(src, dest);
 
 // JAvaScript Executor- check on console of developer tools on the browser eg: window.scrollTo(0,700);
  
 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,700);");
	
	Thread.sleep(2500);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-200);");
	Thread.sleep(2500);

	 driver.get("http://www.newtoursdemo.com");
  WebElement elm= driver.findElement(By.xpath("//a[text()='REGISTER']"));
	  
  ((JavascriptExecutor) driver).executeScript("arguments[0].click();alert(\"Clicked on Register Button\"))",elm);

  
  //alert box
 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 //Click on button
 driver.findElement(By.xpath("//button[text(]='Click for JS Alert'"));
 Thread.sleep(2000);
 Alert a=driver.switchTo().alert();
 System.out.println(a.getText());
 a.accept();

 
 //for confirm box
 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 //Click on button
 driver.findElement(By.xpath("//button[text(]='Click for JS Confirm'"));
 Thread.sleep(2000);
 Alert a1=driver.switchTo().alert();
 System.out.println(a1.getText());
 a.accept();
 a.dismiss();
 
 //for confirm box
 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 //Click on button
 driver.findElement(By.xpath("//button[text(]='Click for JS Prompt'"));
 Thread.sleep(2000);
 Alert a2=driver.switchTo().alert();
 System.out.println(a2.getText());
 
 //Enter vlaue
 a2.sendKeys("Hello");
  a2.accept();
  
  

	
	}

}
