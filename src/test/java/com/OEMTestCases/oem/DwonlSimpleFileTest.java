package com.OEMTestCases.oem;

import org.testng.annotations.Test;

import com.base.oem.Base;

import com.pom.oem.LoginPage;
import com.pom.oem.SampleFilePage;

public class DwonlSimpleFileTest extends Base{
	

	SampleFilePage dp;

	
	@Test(priority = 2)
	public void simpleFiledwonlod(String un, String up) throws InterruptedException {
	LoginPage LPDP = new  LoginPage(driver);	
	LPDP.passwordlogin(un);
	LPDP.passwordlogin(up);;
	LPDP.loginbtnlogin();
	
		
    dp= new  SampleFilePage(driver);
	Thread.sleep(2000);
	dp.simplefileDeviceManagerPage();
	}
	
}
