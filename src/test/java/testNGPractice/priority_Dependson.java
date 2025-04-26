package testNGPractice;

import org.testng.annotations.Test;

public class priority_Dependson
{

	/* Open App 
	 * Login 
	 * Logout 
	 */
	@Test(priority = 1)
	void openurl() {
		System.out.println("opening the app");
	}
	@Test(priority = 2 , dependsOnMethods = {"openurl"})
	void login() {
		System.out.println("Login to app");
	}
	@Test(priority = 3, dependsOnMethods = {"login"})
	void logout() {
		System.out.println("logging out of app");
	}

}
