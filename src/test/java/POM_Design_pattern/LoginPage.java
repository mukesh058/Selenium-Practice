package POM_Design_pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
//	1)constructor for webdriver 
//	2)locators 
//	3)action methods 
	
	public WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txtUsername=By.xpath("//input[@id='user-name']");
	By txtPassword = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	
	
	void setUsername() {
		driver.findElement(txtUsername).sendKeys("problem_user");
		
	}
	void setPassword() {
		driver.findElement(txtPassword).sendKeys("secret_sauce");
	}
	
	void clickLogin()
	{
		driver.findElement(loginBtn).click();
	}
	

}
