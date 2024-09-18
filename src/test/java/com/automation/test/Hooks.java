package com.automation.test;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.automation.utils.ReportManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static freemarker.log._Log4jOverSLF4JTester.test;


public class Hooks {

    @BeforeTest
    public void setUp(Test test) {
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

    @AfterTest
    public void cleanUp(Test test) {
        if (test()) {
            ReportManager.attachScreenShot();
        }
        DriverManager.getDriver().quit();
    }
}
