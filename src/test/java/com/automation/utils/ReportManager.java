package com.automation.utils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportManager {

    public static byte[] takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }
}
