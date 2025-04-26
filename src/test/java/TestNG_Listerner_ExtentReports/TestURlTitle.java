package TestNG_Listerner_ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestURlTitle {
	
	WebDriver driver;
	String url="https://demowebshop.tricentis.com/";
	@BeforeTest
	void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@Test
	void launchUrl()
	{
		driver.get(url);
		
	}
	@Test
	void validateUrl()
	{
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = url;
		SoftAssert assrt=new SoftAssert();
		assrt.assertEquals(driver.getTitle(), "Demo Web Shop");
		Assert.assertEquals(actualUrl, expectedUrl);
//		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	
	}
	@AfterTest
	void tearDown()
	{
		driver.close();
	}

}
