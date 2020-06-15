package packSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import com.google.common.io.Files;

public class WebElementMethods {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        // launching application
        driver.get("https://jqueryui.com/droppable/");

//      WebElement elm = driver.findElement(By.xpath("//a[text()='REGISTER']"));
////
////        elm.click();
////
////        // 1:findelement
////        // 2. findElements
////
//      WebElement parentelemnt = driver.findElement(By.name("country"));
//
//      List<WebElement> childelemts = parentelemnt.findElements(By.tagName("option"));
//
//      for (WebElement elmnt : childelemts) {
//          elmnt.click();
//          Thread.sleep(200);
//
//      }
        

        // 3. clear

//      WebElement elm=driver.findElement(By.name("userName"));
//      elm.sendKeys("test");
//      Thread.sleep(700);
//      elm.clear();
//      
//      Thread.sleep(700);
//      
//      
//      driver.quit();

        // 5. getLocation

//      Point elmlocation = elm.getLocation();
//      
//      System.out.println(elmlocation.getX());
//      System.out.println(elmlocation.getY());
//      
//      //6. getSize()
//      
//      System.out.println("width: "+elm.getSize().getWidth());
//      System.out.println("height"+elm.getSize().getHeight());
//      
//      
//      
//      //7 getRect
//      
//      System.out.println(elm.getRect().getX());
//      System.out.println(elm.getRect().getY());
//      System.out.println("width: "+elm.getRect().getWidth());
//      System.out.println("height"+elm.getRect().getHeight());

        // 8 getAttribute();
//      System.out.println("before entering username: "+elm.getAttribute("value"));
//      elm.sendKeys("test");
//      System.out.println("after entering username: "+elm.getAttribute(""));

        // 9 isSelected

//      WebElement elm = driver.findElement(By.xpath("//a[text()='REGISTER']"));
//      elm.click();
//
//      WebElement parentelemnt = driver.findElement(By.name("country"));
//
//      List<WebElement> childelemts = parentelemnt.findElements(By.tagName("option"));
//
//      for (WebElement elmnt : childelemts) {
//
//          System.out.println("before selection:" + elmnt.isSelected());
//          elmnt.click();
//          Thread.sleep(200);
//
//          System.out.println("after selection:" + elmnt.isSelected());
//
//      }
//      
        //10.isdisplayed & 
        //isenabled

        
        //11. getscreenshotas();
//      
//      WebElement elm= driver.findElement(By.name("login"));
//      
//      File elmImage=elm.getScreenshotAs(OutputType.FILE);
//      
//      
//      
//      File targetFile= new File("C:\\training\\elmimage.png");
//      
//      Files.copy(elmImage, targetFile);
        
        
        
//      12.  mousehover
    
       // Actions acton= new Actions(driver);
        
        
        
//      acton.moveToElement(driver.findElement(By.xpath("//button[@title='Login']"))).build().perform();
        
//  WebElement elm= driver.findElement(By.xpath("//a[@title='Online Banking Login']"));
    
//      Thread.sleep(2500);
//      
////        driver.findElement(By.xpath("//a[@title='Online Banking Login']")).click();
//      // final quit the browser
//
//      driver.switchTo().frame(0);
//      
//      WebElement sourceElement;
//      WebElement  targetElement;
//      
//      
//      sourceElement= driver.findElement(By.id("draggable"));
//      targetElement= driver.findElement(By.id("droppable"));
//      
//      acton.dragAndDrop(sourceElement, targetElement).build().perform();
//      
//      
//      
//      Thread.sleep(2500);
//      driver.quit();
        
        
        //select class
        
        
        //navigate
     //   driver.navigate().refresh();
      //  driver.navigate().to();
      //  driver.navigate().forward();
      //  driver.navigate().back();
        
        
        // delete cookies
       // driver.manage().deleteAllCookies();
      //  driver.manage().addCookie();
        
        // logs
     LogEntries log=  driver.manage().logs().get(LogType.DRIVER);
       
     for(LogEntry l: log)
     {
    	 System.out.println(l.toString());
     }
    }
    
    //

}


