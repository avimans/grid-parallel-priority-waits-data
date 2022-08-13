package TESTTNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class dataprovider {
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
				  
	  }
	 
	 
    @Test(priority = 0 ,dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException
    {
    	driver.findElement(By.id("txtUsername")).sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		Thread.sleep(3000);
		/*there 
		 * we can create 2 objecte 
		 * 1is sa 
		 
		 */
  }
    
    
    @Test(priority = 1, dataProvider = "dp1")
  public void f1(String a, String b) throws InterruptedException 
    {
    	//i want to open new tab
    	driver.switchTo().newWindow(WindowType.TAB);
  	  driver.get("https://demo.guru99.com/test/newtours/index.php");
  	  driver.findElement(By.name("userName")).sendKeys(a);
  	  driver.findElement(By.name("password")).sendKeys(b);
  	  driver.findElement(By.name("submit")).click();
  	  Thread.sleep(3000);
  	  driver.navigate().back();
  	  Thread.sleep(3000);
    	
    	
  }
//this is anpther testng annotation which will helps us running multiple data
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
    @DataProvider
    public Object[][] dp1() {
      return new Object[][] {
        new Object[] { "sunil", "sunil" },
        new Object[] { "kavitha", "kavitha" },
      };
  
  }


  @AfterTest
  public void afterTest() {
  }

}
