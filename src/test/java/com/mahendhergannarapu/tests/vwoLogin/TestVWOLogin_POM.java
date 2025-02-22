package com.mahendhergannarapu.tests.vwoLogin;

import com.mahendhergannarapu.base.CommonToAllTest;
import com.mahendhergannarapu.driver.DriverManager;
import com.mahendhergannarapu.pages.pageObjectModel.VWO.DashboardPage_POM;
import com.mahendhergannarapu.pages.pageObjectModel.VWO.LoginPage_POM;
import com.mahendhergannarapu.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_POM extends CommonToAllTest {

    @Owner("Mahendher")
    @Description("Verify that invalid credentials give error message")
    @Test
    public void testLoginNegativeVWO()
    {
       // WebDriver driver = new ChromeDriver(); //Intially set the driver
//        WebDriver driver = DriverManager.getDriver(); // getting driver from the DriverManager class
//        driver.get("https://app.vwo.com");

        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver()); //send the driver
        String error_msg = loginPagePom.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));

    }

    @Owner("Mahendher")
    @Description("Verify that valid credentials and navigates to dashboard page")
    @Test
    public void testPositive()
    {
        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver()); //send the driver
        loginPagePom.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashboardPage_POM dashboardPagePom = new DashboardPage_POM(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("expected_username"));
    }
}
