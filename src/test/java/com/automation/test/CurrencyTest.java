package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrencyTest extends BaseTest{
    @Test
    public void verifyCurrency(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnGlobalIcon();
        homePage.clickOnCurrency();
        homePage.lineOnCurrency();
        homePage.clickOnNewCurrency();
        Assert.assertTrue(homePage.verifyCurrency());
    }
}
