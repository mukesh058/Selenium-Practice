package demo_Practice;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class HandleFrames {

	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args)throws Exception {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//		we can locate fame using its index, its webelementxpath, its name in string like below 
		
		driver.switchTo().frame("iframe-name");
		
		driver.findElement(By.xpath("(//li/a[text()='Practice'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String text = driver.findElement(By.xpath("//button[@id='form-submit']")).getText();
		System.out.println(text);
		
//		now we can switch to main paraent frame using defaultcontent()/parent frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", "ele");
		System.out.println(ele.getText());
		
		
		
//		driver.quit();
		
		}
}
