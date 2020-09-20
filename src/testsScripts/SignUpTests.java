package testsScripts;


import org.testng.annotations.Test;

import base.ConfigClass;
import pageFactoryObject.LandingPageObjects;
import pageFactoryObject.LoginPageObjects;

public class SignUpTests extends ConfigClass {

	
	@Test
	public void signUp() throws Exception {
		
		LoginPageObjects lpo2= new LoginPageObjects(driver);
		LandingPageObjects lpo = new LandingPageObjects(driver);
		lpo.SignInLink.click();
		lpo2.createAccount();
		Thread.sleep(3000);
		
	}
	
}
