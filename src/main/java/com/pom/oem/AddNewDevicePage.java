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

}
