package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MeetYourHostTest extends BaseTest{

    @Test
    public void verifyMeetYourHost(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnBeachfront("Amazing views");
        bookingPage.clickOnFirstCard();
        homePage.selectMeetYourHost();
        Assert.assertTrue(homePage.verifyDisplayedDetailsOfHost());
    }
}
