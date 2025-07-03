package com.pom.oem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewDevicePage {

	@FindBy(xpath ="//div//button[2][text()=\"Add New Device\"]")
	private WebElement SingledriveAdd;
	@FindBy(xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div/div/label[1][text()=\"Serial No\"]")
	private WebElement SerialNoTextField;
	@FindBy(xpath = "//*[@id=\"«r29»\"]")
	private WebElement imeinumber;
	@FindBy (id ="«r2b»")
	private WebElement devicemake;
	@FindBy(id="«r2c»")
	private WebElement devicemodel;
     @FindBy(xpath = "//*[text()=\"Add Device\"]")
     private WebElement Adddevices;
	private WebDriver driver;
	
	
public 	AddNewDevicePage(WebDriver driver) {
	this.driver = driver ;
	PageFactory.initElements(driver,this );
}

public void  SrialNumber() {
	SingledriveAdd.click();
}

public void  SerialNoTextField(String SNdata) {
	SerialNoTextField.sendKeys(SNdata);
}
public void imeinumbertext() {
	imeinumber.sendKeys();
}

public void devicemaketext() {
	devicemake.sendKeys();
}
public void devicemodeltext() {
	devicemodel.sendKeys();
}

public void AdddevicesSingalData() {
	Adddevices.click();
}
}
