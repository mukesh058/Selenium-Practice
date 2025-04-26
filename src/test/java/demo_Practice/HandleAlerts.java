package demo_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
//		to handle alert we use accept() & dissmiss() of Alert interface
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	// in case of conformation alerts ok and cancell choice we can use dismiss() also 
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
//		driver.switchTo().alert().accept();  // to click ok
	
		driver.switchTo().alert().dismiss(); // to cancell 
		
	}

}
