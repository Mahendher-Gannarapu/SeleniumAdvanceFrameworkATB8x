package com.mahendhergannarapu.tests.OrangeHR;

import com.mahendhergannarapu.base.CommonToAllTest;
import com.mahendhergannarapu.driver.DriverManager;
import com.mahendhergannarapu.pages.pageObjectModel.OrangeHR.DashboardPage_POM_OHR;
import com.mahendhergannarapu.pages.pageObjectModel.OrangeHR.LoginPage_POM_OHR;
import com.mahendhergannarapu.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOrangeHR_POM extends CommonToAllTest {

    //private static final Logger log = LoggerFactory.getLogger(TestOrangeHR_POM.class);

    @Owner("Mahendher")
    @Description("Verify the OrangeHR login page")
    @Test
    public void testLoginPositive()
    {
        LoginPage_POM_OHR loginPagePomOhr = new LoginPage_POM_OHR(DriverManager.getDriver());
        loginPagePomOhr.loginToOHRCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));

        DashboardPage_POM_OHR dashboardPagePomOhr= new DashboardPage_POM_OHR(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePomOhr.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("ohr_expected_username"));
    }
}
