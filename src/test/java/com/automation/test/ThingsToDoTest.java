package com.automation.test;

import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThingsToDoTest extends BaseTest{

    @Test
    public void verifyThingsToDo(){
        homePage.openWebsite();
//        ExtentReportManager.getTest().pass("Open website");
        Assert.assertTrue(homePage.isHomePageDisplayed());
//        ExtentReportManager.attachScreenshot();
        homePage.clicksOnThingsToDo();
        homePage.clickOnDestination();
        searchPage.clickOnSearchButton();
        bookingPage.clickOnFirstCard();
        Assert.assertTrue(homePage.verifyThingsToDoMessage("What you'll do"));
    }
}