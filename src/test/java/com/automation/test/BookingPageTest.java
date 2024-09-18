package com.automation.test;


import com.automation.pages.BookingPage;
import com.automation.utils.ReportManager;
import org.testng.Assert;


public class BookingPageTest {
    BookingPage bookingPage = new BookingPage();

    
    public void verify_searched_page_is_displayed() {
        Assert.assertTrue(bookingPage.isSearchedPageIsDisplayed());
        ReportManager.attachScreenShot();
    }

    
    public void user_selects_first_card() {
        bookingPage.clickOnFirstCard();
    }

    
    public void verify_displayed_details_with_the_input_details() {
        Assert.assertTrue(bookingPage.verifyCheckInDate());
        ReportManager.attachScreenShot();
        Assert.assertTrue(bookingPage.verifyCheckOutDate());
        ReportManager.attachScreenShot();
        Assert.assertTrue(bookingPage.verifyNoOfPersons());
        ReportManager.attachScreenShot();
    }

    
    public void userSelectsAnyCard() {
        bookingPage.clickOnAnyCard();

    }

    
    public void verifyThePriceDistributionIsEqualsTotalPrice() {
        bookingPage.verifyPrice();
    }

    
    public void verifyPriceAndTotalPriceIsDisplayedCorrectly() {
        Assert.assertTrue(bookingPage.verifyTotalPrice());
    }
}
