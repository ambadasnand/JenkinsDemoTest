package TestCasesWithinGroups;

import org.testng.annotations.Test;

public class OrangeHRMLogin {
	
	@Test (groups = {"SmokeTest"})
	public void OrangeLogin() {
		
		System.out.println("OrangeHRM User Can able to Login");
	}
	
	@Test
	public void OrangeAdminLogin() {
		
		System.out.println("OrangeHRM Admin Can able to Login");
	}
	
	@Test
	public void OrangeEmployeeLogin() {
		
		System.out.println("OrangeHRM Employee Can able to Login");
	}

}
