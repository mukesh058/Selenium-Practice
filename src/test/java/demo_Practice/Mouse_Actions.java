package demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) {
		

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.mgmresorts.com/en.html");
		
		WebElement entertain = driver.findElement(By.xpath("//button[text()='Explore resorts']"));
		WebElement us = driver.findElement(By.xpath("//span[normalize-space()='U.S. destinations']"));
		
//		Right clicck
		Actions act=new Actions(driver);
		act.contextClick(entertain).perform();  //right click s
		
		
		//Double click 
		
		Actions actions=new Actions(driver);
		actions.doubleClick(us).perform();
		 
		
		// Drag and drop
		
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(entertain, us).perform();
		

	}

}
