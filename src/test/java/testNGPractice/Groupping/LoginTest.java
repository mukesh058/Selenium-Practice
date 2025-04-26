package testNGPractice.Groupping;

import org.testng.annotations.Test;

class LoginTest {

	
	@Test(priority = 1, groups = {"sanity"})
	void loginByfacebook() {
		System.out.println("login to facebook ");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginByGoogle() {
		System.out.println("login to google ");
	}
	
	
	@Test(priority = 3,groups = {"sanity"})
	void loginByX() {
		System.out.println("login to X ");
	}
	
	
}
