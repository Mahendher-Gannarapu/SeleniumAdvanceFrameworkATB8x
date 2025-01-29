package com.mahendhergannarapu.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage_POM {

        // instance variable
        WebDriver driver;

        // Do first thing add default constructor
        // Whatever the WebDriver that will passed on parameterized it will automatically send
        public LoginPage_POM(WebDriver driver) {
            this.driver = driver;
        }

        // Step 1 - Page Locators
        // Encapsulation principle :keep all the fields(here locators) which is our page keep them as private
        private By username = By.id("login-username");
        private By password = By.id("login-password");
        private By signButton = By.id("js-login-btn");
        private By error_Message = By.id("js-notification-box-msg");

        // If you are not using it , don't keep.

        // Step 2 - Creating Page Actions
        public String loginToVWOLoginInvalidCreds(String user, String pwd) {
            driver.findElement(username).sendKeys(user);
            driver.findElement(password).sendKeys(pwd);
            driver.findElement(signButton).click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String error_message_text = driver.findElement(error_Message).getText();
            return error_message_text;

        }


        public void loginToVWOLoginValidCreds(String user, String pwd) {
            driver.findElement(username).sendKeys(user);
            driver.findElement(password).sendKeys(pwd);
            driver.findElement(signButton).click();

        }



}
