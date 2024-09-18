package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;
    WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
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
        ConfigReader.setValue("window", window);
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

    public void javaScriptClear(WebElement element) {
        js.executeScript("arguments[0].value = '';", element);
    }

    public void sliderSlideXAxis(WebElement element, int value) {
        actions.clickAndHold(element)
                .moveByOffset(value, 0).pause(1000)
                .release()
                .perform();
    }

    public void javaScriptExecutorClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void resetImplicitWait(long sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public void scrollTillElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void switchToCurrentWindow(){
        String window =ConfigReader.getValue("window");
        driver.switchTo().window(window);
    }

    public String javaExecutorGetText(WebElement element) {
        return (String) js.executeScript("return arguments[0].innerText;", element);
    }

    public boolean isPresents(WebElement element) {
        try {
            resetImplicitWait(0);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            resetImplicitWait(60);
        }
    }
}

