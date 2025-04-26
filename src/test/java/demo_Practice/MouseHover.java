package demo_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.mgmresorts.com/en.html");
		
		WebElement entertain = driver.findElement(By.xpath("//button[text()='Explore resorts']"));
		WebElement us = driver.findElement(By.xpath("//span[normalize-space()='U.S. destinations']"));
		
		//Actions class for mouse hover 
		
		Actions act =new Actions(driver);
		act.moveToElement(entertain).build().perform();
		Thread.sleep(5000);
		act.moveToElement(us).perform();
		us.clear();
		
		
	}

}
