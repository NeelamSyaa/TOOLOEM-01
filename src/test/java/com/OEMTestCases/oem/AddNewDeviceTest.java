package com.OEMTestCases.oem;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.AddNewDevicePage;
import com.utilities.oem.ConfigReader;

public class AddNewDeviceTest extends Base{
	AddNewDevicePage ad;
	LoginTest lg;
	@Test()
	public void addingsigledata( ) throws IOException {

		ConfigReader.loadProperties();
		String sn = ConfigReader.getProperty("Serial_No");
		String im = ConfigReader.getProperty("imei");
		String dm = ConfigReader.getProperty("DeviceMake");
		String dmodel = ConfigReader.getProperty("DeviceModel");
	
	    ad = new AddNewDevicePage(driver);
	    ad.SrialNumber();
	    ad.SerialNoTextField(sn);
		
	}
}
