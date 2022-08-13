package TESTTNG;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class waits {
WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  //implecite waits will be applicable for any line if it need wait automatically
//===============================DEFAULT WAIT TIME FOR SELENIU IS 30 SEC=======================================
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();// this line will open the new instance of the browser
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
// THE ABOVE CODE WILL BE      
     driver.get("https://www.youtube.com/");
  }
 //============================WINDOW HANDLES========================= 
  @Test  (enabled = false)
  public void f() {
/*
 * WE HAVE TWO WINDOWS TO WORK WITH 1 USE WINDOW HANDLE	  
 * WHEN I USE WINDOW GET HANDLE IT WILL CAPTURE ONLY THE FIRST WINDOW
 * THE FIRST WINDOW WHAT I CAPTUREDF IS PARENT WINDOW
 */
  String parentwindow = driver.getWindowHandle();
// this line will open another window onlly once
  driver.get(parentwindow);
		  }
  
  @Test
  public void youtube() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id='search']")).click();
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='search']")).sendKeys("songs",Keys.ENTER);
  }
  @AfterTest
  public void afterTest() {
  }

}
