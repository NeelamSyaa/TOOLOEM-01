package com.OEMTestCases.oem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;

public class LoginTest extends Base {
	

    @Test(dataProvider = "loginData", priority = 1)
    public void loginTest(String uname, String password) {
        LoginPage lp = new LoginPage(driver);
        lp.Usernamelogin(uname);
        lp.passwordlogin(password);
        lp.loginbtnlogin();
        lp.successMessagelogin();
        lp.getcurrentURl();
        lp.gettitle();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "❌ Login might have failed!");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginCredentials() {
        return new Object[][] {
            {"admin", "admin"},
           // {"admin", "wrongpass"},
           // {"", ""}
        };
    }

}
