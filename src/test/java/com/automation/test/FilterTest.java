package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest{

    @Test
    public void verifyFilter(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnBeachfront("farm");
        homePage.clickOnFilterOption();
        homePage.clickOnEntireHome();
        homePage.enterFilterMaximumPrice(ConfigReader.getValue("filter.maximum.price"));
        homePage.enterFilterMinimumPrice(ConfigReader.getValue("filter.minimum.price"));
        homePage.increaseBedroomCount(Integer.parseInt(ConfigReader.getValue("filter.bedroom.count")));
        homePage.increaseBedCount(Integer.parseInt(ConfigReader.getValue("filter.bed.count")));
        homePage.clickOnWifi();
        homePage.clickOnInstantBook();
        homePage.clickOnFavourite();
        homePage.clickOnHotel();
        homePage.clickOnAccessibility();
        homePage.clickOnLanguage();
        homePage.clickOnShow();
        bookingPage.clickOnFirstCard();
        Assert.assertTrue(homePage.verifyGuestFavourite());
        Assert.assertTrue(homePage.verifyFilterBedroomCount());
        Assert.assertTrue(homePage.verifyFilterBedCount());
        Assert.assertTrue(homePage.verifyFilterPrice());
    }
}
