package com.OEMTestCases.oem;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.Searchdropdwon;
import com.utilities.oem.ExcelUtilSerialNumber;

public class DropDWobnBtnTest extends Base {

	Searchdropdwon sdpdn;
	@Test(priority = 3)
	public void searchdata(String u, String p ) throws EncryptedDocumentException, IOException {
		LoginPage LPDP = new  LoginPage(driver);	
		LPDP.passwordlogin(u);
		LPDP.passwordlogin(p);;
		LPDP.loginbtnlogin();
	 String filePath = "C:\\Users\\SYAA TECH\\eclipse-workspace\\TOOLOEM-01\\data\\serialnumberdata.xlsx";
	 String keyword=	ExcelUtilSerialNumber.getCellData(filePath, "Searchdata1", 0, 0);
		sdpdn  =	new Searchdropdwon(driver);
		sdpdn.Search_bySerialNofordata(keyword, filePath);
		sdpdn.SearchbyIMIE(filePath, keyword);
	}
}
