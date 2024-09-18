package com.automation.utils;


import com.aventstack.extentreports.gherkin.model.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ReportManager {

    static Test test;

    public static void initScenario(Test test) {
        ReportManager.test = test;
    }

    public static void attachScreenShot() {
        test.alwaysRun();
    }


    public static byte[] takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }
}
