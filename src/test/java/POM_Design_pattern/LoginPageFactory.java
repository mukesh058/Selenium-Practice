package POM_Design_pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
//	1)constructor
//	2) locators 
//	3) Action methods 


	public WebDriver driver;
	
	
	public LoginPageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//input[@id='user-name']") WebElement txtusername;
	@FindBy(xpath = "//input[@id='password']") WebElement txtpassword ;
	@FindBy(xpath = "//input[@id='login-button']") WebElement loginBtn;
	
	void setUsername() {
		txtusername.sendKeys("problem_user");
		
	}
	void setPassword() {
		txtpassword.sendKeys("secret_sauce");
	}
	
	void clickLogin()
	{
	loginBtn.click();
	}
	

}
