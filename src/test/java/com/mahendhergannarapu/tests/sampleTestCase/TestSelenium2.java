package com.mahendhergannarapu.tests.sampleTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium2 {

    @Test
    public void test_Method() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.quit();
    }

}
