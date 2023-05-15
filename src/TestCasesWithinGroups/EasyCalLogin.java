package TestCasesWithinGroups;

import org.testng.annotations.Test;

public class EasyCalLogin {
	
	@Test
	public void EasyCalculaLogin() {
		
		System.out.println("EasyCalcula User Can able to Login");
	}
	
	@Test (groups = {"SmokeTest"})
	public void EasyCalculaAdminLogin() {
		
		System.out.println("EasyCalcula Admin Can able to Login");
	}
	
	@Test
	public void EasyCalculaEmployeeLogin() {
		
		System.out.println("EasyCalcula Employee Can able to Login");
	}


}
