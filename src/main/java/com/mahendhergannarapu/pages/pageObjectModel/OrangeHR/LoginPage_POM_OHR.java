package com.mahendhergannarapu.pages.pageObjectModel.OrangeHR;

import com.mahendhergannarapu.base.CommonToAllPage;
import com.mahendhergannarapu.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM_OHR extends CommonToAllPage {

// Parametrized Constructor
    WebDriver driver;
    public LoginPage_POM_OHR(WebDriver driver)
    {
        this.driver =driver;
    }

// Page Locators
    private By username = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By submit_btn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

// Creating Page Actions
    public void loginToOHRCreds(String user, String pwd)
    {
        driver.get(PropertiesReader.readKey("orange_hr_url"));
        visibilityOfElement(username);
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(submit_btn);

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
