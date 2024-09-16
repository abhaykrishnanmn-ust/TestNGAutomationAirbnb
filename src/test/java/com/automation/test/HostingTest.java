package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HostingTest extends BaseTest{

    @Test
    public void verifyPriceSliding(){
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnAirbnbYourHome();
        Assert.assertTrue(airbnbYourHomePage.verifyAirbnbYourHomeMessage("You could earn"));
        airbnbYourHomePage.slideSlider();
        Assert.assertFalse(airbnbYourHomePage.verifyPriceChange());
    }
}
