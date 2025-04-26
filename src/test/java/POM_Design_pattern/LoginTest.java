package POM_Design_pattern;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
public WebDriver driver;
LoginPage p1;

@BeforeClass
void setUp()
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@Test
void loginTest()
{
//	p1=new LoginPage(driver);
//	p1.setUsername();
//	p1.setPassword();
//	p1.clickLogin();
	LoginPageFactory p2=new LoginPageFactory(driver);
	p2.setUsername();
	p2.setPassword();
	p2.clickLogin();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	SoftAssert asert= new SoftAssert();
	asert.assertEquals(currentUrl, true);
//	Assert.assertEquals(currentUrl, false);
	
}

@AfterClass
void tearDown ()
{
	System.out.println("Execution Done ....../");
	driver.close();
}

}