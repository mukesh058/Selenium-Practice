package demo_Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecutions {

	public static void main(String[] args) {
		// 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get(TakeScreenshots.url);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		if (title.equals("Demo Web Shop")) {
			System.out.println("test passed");
			
		}else System.out.println("test failed");
		
		driver.quit();

	}

}
