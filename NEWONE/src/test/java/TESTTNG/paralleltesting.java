package TESTTNG;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

;

public class paralleltesting {
	public WebDriver driver;
/*TEST SUIT IS COLLECTIPONN OFG TEST CASES HERE WE CXAN RUN COLLECTIOPN OF TEST CASESE		
	HERE WE ARE RUNING CASES IN MULTIPLE BROWSER SIMUNTANEOUSLY
   when i want to run with multiple borwsers then i use parameters --
 * providing multiple data 
 * 	we have to run it from xml file===>how?===>[ that is rigght click on class ==>testng
 * ==>converte to testng==>finish then =======>makes chnges in xml file ====>[go through ss]
 * sometimes XPATH may differ from browser to browser(99%--it will be same)
 */
	@Parameters("mybrowser")
	@BeforeTest
	public void bt(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(mybrowser.equalsIgnoreCase("edge")) {
			WebDriverManager. edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	
	@Test
	public void At() throws InterruptedException
	{
		JavascriptExecutor js=( JavascriptExecutor)driver;
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
				 Thread.sleep(3000);
				 driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
				 driver.findElement(By.partialLinkText("Teams")).click();
				 Thread.sleep(2000);
//				 driver.findElement(By.linkText("India")).click();
//				 Thread.sleep(3000);
//				 js.executeScript("document.getElementsByClassName('ds-flex ds-flex-row ds-space-x-4')[0].scrollIntoView()");
//				 Thread.sleep(4000);
//				 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();
//	
				 }
}
