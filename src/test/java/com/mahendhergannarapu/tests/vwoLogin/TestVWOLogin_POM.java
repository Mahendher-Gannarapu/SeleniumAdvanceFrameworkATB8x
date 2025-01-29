package com.mahendhergannarapu.tests.vwoLogin;

import com.mahendhergannarapu.pages.pageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_POM {

    @Owner("Mahendher")
    @Description("Verify that invalid credentials give error message")
    @Test
    public void testLoginNegativeVWO()
    {
        WebDriver driver = new ChromeDriver(); //set the driver
        driver.get("https://app.vwo.com");

        LoginPage_POM loginPagePom = new LoginPage_POM(driver); //send the driver
        String error_msg = loginPagePom.loginToVWOLoginInvalidCreds("admi@gmail.com","123");

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
