package com.mahendhergannarapu.pages.pageObjectModel.VWO;

import com.mahendhergannarapu.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM extends CommonToAllPage {

    // instance variable
    WebDriver driver;

    // Do first thing add default constructor
    // Whatever the WebDriver that will passed on parameterized it will automatically send
    public DashboardPage_POM(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    //Page Actions
    public String loggedInUserName()
    {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
