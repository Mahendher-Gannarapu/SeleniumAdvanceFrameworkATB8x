package com.mahendhergannarapu.pages.pageObjectModel.OrangeHR;

import com.mahendhergannarapu.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM_OHR extends CommonToAllPage {

    // instance variable
    WebDriver driver;

    // Do first thing add default constructor
    // Whatever the WebDriver that will passed on parameterized it will automatically send
    public DashboardPage_POM_OHR(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    By userNameOnDashboard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module' and text()='PIM']");

    //Page Actions
    public String loggedInUserName()
    {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
