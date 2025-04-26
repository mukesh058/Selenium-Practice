package demo_Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandleWindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
//		 click on the element to open new window
		 driver.findElement(By.id("openwindow")).click();
		 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 Thread.sleep(5000);
		
		 // now identify the windows //this will return main window 
		String mainWindow = driver.getWindowHandle();
//		System.out.println(mainWindow);
		
		// get all window handles using windowhandles method 
		
		Set<String> getWindowHandles = driver.getWindowHandles();
		for(String window:getWindowHandles)
		{
			System.out.println(window);
			if(!window.equals(mainWindow))
			{
				driver.switchTo().window(window);
			}
		}
			

		try {
		WebElement courses = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Courses'])[1]")));
		courses.click();
		
//		driver.findElement(By.xpath("(//*[text()='Courses'])[position()=1]")).click();
		String verifyText = driver.findElement(By.xpath("//*[text()='QA Click Academy']")).getText();
		System.out.println(verifyText);
		Assert.assertEquals(verifyText, "QA Click Academy");
		}catch (Exception e) {}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
	System.out.println("testCOmplete");
	
	driver.quit();
	}
}
