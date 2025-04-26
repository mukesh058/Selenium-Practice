package demo_Practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_tc {

	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	public static void main(String[] args) throws InterruptedException {
		// Open Chrome browser , by using chromedriver instance 
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		// Get URL 
		driver.get("https://demowebshop.tricentis.com/");
		
		//Implicit Wait --- once can be used and its max time of wait 10 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Explicit wait ---- declare once use at multiple time -
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement txtusername=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='input']")));
		
		// Validate title 'Your Store'
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals("Demo Web Shop")) {
			System.out.println("Test Passed ||| \n"+ actualTitle);
			
		}else {
			System.out.println("Test Failed");
			
		}
		Thread.sleep(5000);
		
//		driver.close();
	}
	


}
