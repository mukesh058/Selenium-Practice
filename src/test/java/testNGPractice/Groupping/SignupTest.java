package testNGPractice.Groupping;

import org.testng.annotations.Test;

public class SignupTest {
	
	@Test(priority = 1,groups = {"regression"})
	void signupByfacebook() {
		System.out.println("signupByfacebook ");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void signupByGoogle() {
		System.out.println("signupByGoogle ");
	}
	
	
	@Test(priority = 3,groups = {"regression"})
	void signupByX() {
		System.out.println("signupByX ");
	}
	

}
