package testNGPractice.Groupping;

import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test(priority = 1,groups = {"sanity", "regression","functional"})
	void paymentByINR() {
		System.out.println("paymentByINR ");
	}
	
	@Test(priority = 2,groups = {"sanity", "regression","functional"})
	void paymentByDoller(){
		System.out.println("paymentByDoller ");
	}
	
	
	@Test(priority = 3,groups = {"sanity", "regression","functional"})
	void paymentByYen() {
		System.out.println("PaymentByYen");
	}
}
