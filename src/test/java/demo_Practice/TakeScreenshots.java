package demo_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots {

	public static String url = "https://demowebshop.tricentis.com/";

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Take screeshot of pages using TaakesScreenshot class
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);  //this will take Screenshot and Store it in File object 
		//now we need to copy that into out specified location 
		
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		
		//now wwe need to copy the sourceFile to TargetFile
		
//		sourceFile.renameTo(targetFile);  //this will copy that to target 
		FileUtils.copyFile(sourceFile,targetFile );
		
		
		System.out.println("execution completed");
		driver.quit();

	}

}
