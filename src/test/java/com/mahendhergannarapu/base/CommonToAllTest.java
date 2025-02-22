// Before running test case we want do something
// like run the WebDriver and after run testcase close the WebDriver
package com.mahendhergannarapu.base;

import com.mahendhergannarapu.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp()
    {
        DriverManager.init();
    }


    @AfterMethod
    public void tearDown()
    {
        DriverManager.down();
    }

}
