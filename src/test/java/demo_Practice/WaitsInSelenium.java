package demo_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		Explicit Wait 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
//		WebElement waitForEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//xpath")));
		
//		Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		
		
		
	}

}
