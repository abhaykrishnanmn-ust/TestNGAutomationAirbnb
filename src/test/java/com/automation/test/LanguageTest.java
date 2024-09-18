package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest{

    @Test
    public void verifyLanguage(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnGlobalIcon();
        Assert.assertTrue(homePage.verifyLanguageIsDisplayed());
        homePage.selectLanguage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnGlobalIcon();
        Assert.assertTrue(homePage.verifyLanguageIsChanged());
    }
}
