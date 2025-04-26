package demo_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpdownele = driver.findElement(By.id("country"));
		
		Select drpdown=new Select(drpdownele);
		
		// select by visible text , select by value , select by index 
		
//		drpdown.selectByVisibleText("Germany");
//		
//		drpdown.selectByIndex(2);
//		
//		drpdown.selectByValue("canada");
//		
		
		
		for(WebElement options:drpdown.getOptions())
		{
			System.out.println(options.getText());
			if(options.getText().equals("India"))
				options.click();
		}
	
		
	}

}
