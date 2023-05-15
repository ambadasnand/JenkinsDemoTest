package TestCasesWithinGroups;

import org.testng.annotations.Test;

public class DemoOpenCartLogin {
	
	@Test
	public void DemoOpenLogin() {
		
		System.out.println("DemoOpenCart User Can able to Login");
	}
	
	@Test
	public void DemoOpenAdminLogin() {
		
		System.out.println("DemoOpenCart Admin Can able to Login");
	}
	
	@Test (groups = {"SmokeTest"})
	public void DemoOpenEmployeeLogin() {
		
		System.out.println("DemoOpenCart Employee Can able to Login");
	}

}
