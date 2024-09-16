package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageSlidingTest extends BaseTest{

    @Test
    public void verifyImageSliding(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnBeachfront("Amazing views");
        homePage.clickOnNextCardImage();
        Assert.assertTrue(homePage.verifySlidingImage("2"));
    }
}
