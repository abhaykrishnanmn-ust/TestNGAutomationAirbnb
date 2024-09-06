package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;
    public BasePage()
    {
        this.driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
    public boolean isPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isDisplayedElement(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void switchToNewWindow() {
        String window = driver.getWindowHandle();
        ConfigReader.setValue("window",window);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!windows.equals(window)) {
                driver.switchTo().window(windows);
            }
        }
    }
    public void scrollThePage(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void moveToAnElement(WebElement element) {
        actions.moveToElement(element).pause(Duration.ofMillis(10)).build().perform();
    }
    public void javaScriptClear(WebElement element){
        js.executeScript("arguments[0].value = '';", element);
    }
    public void sliderSlideXAxis(WebElement element, int value) {
        actions.clickAndHold(element)
                .moveByOffset(value, 0).pause(1000)
                .release()
                .perform();
    }
}

