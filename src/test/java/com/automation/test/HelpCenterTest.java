package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpCenterTest extends BaseTest{

    @Test
    public void verifyHelpCenter(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.profileIconSelection();
        homePage.clicksOnHelpCentre();
        Assert.assertTrue(helpCenterPage.verifyDisplayedMessage("Hi, how can we help"));
    }
}
