package com.pom.oem;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Searchdropdwon {
	private WebDriver driver;
	@FindBy(xpath = "//div[text()=\"Search by IMEI\"]")
    private	WebElement Searchbydata;
	@FindBy(xpath =  "//input[@placeholder=\"Search by Serial No\"]")
	private WebElement Search_bySerialNo;
	@FindBy(xpath = "//div[@class=\"MuiFormControl-root MuiTextField-root css-4bwmf8\"]//input[@placeholder=\"Search by IMEI\"]")
	private WebElement SearchbyIMIE;

 public Searchdropdwon (WebDriver  driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 public void Search_bySerialNofordata( String SerialNo , String keyword) {
	 Search_bySerialNo.clear();
	 Search_bySerialNo.sendKeys(keyword);
	 Search_bySerialNo.sendKeys(SerialNo );
	 Search_bySerialNo.sendKeys(Keys.ENTER);
 }
   public  void SearchbyIMEIdata() {
	   Searchbydata.click();
   }
   
   public void SearchbyIMIE(String imie ,String keyword) {
	   SearchbyIMIE.clear();
	   SearchbyIMIE.sendKeys(keyword);
	   SearchbyIMIE.sendKeys(imie ,Keys.ENTER);
   }
   
   
 
}