package demo_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select checkbox 
		
//		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
//		System.out.println(checkbox.isSelected());
//		checkbox.click();
//		System.out.println(checkbox.isSelected());
		
		//Selecting all Check boxes 
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
		
		System.out.println("No.of checkboxs =  " +checkboxes.size());
	
		for (int i = 0; i <checkboxes.size(); i++) {
			
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		//Deselct all check boxes
		
		for(WebElement chebox:checkboxes)
		{
			if (chebox.isSelected()) {
				chebox.click();
			}
		}
		
		
		//Select radio button
		
		WebElement radioMale = driver.findElement(By.xpath("//input[@id='male']"));
		radioMale.click();
		System.out.println(radioMale.isEnabled());
		

	}

}
