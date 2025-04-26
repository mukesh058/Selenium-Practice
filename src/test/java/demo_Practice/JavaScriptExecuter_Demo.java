package demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_Demo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
		//JavascriptExecuter is used to do javascript actions in selenium 
//		for ex : for Scrolling the page to expected amount
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//Scroll down by pixel numbers 
		js.executeScript("window.scrollBy(0,3000)","");
		
		//scroll down to perticular element
		
		js.executeScript("arguments[0].scrollIntoView();", inputBox);
		
		
	}
}
