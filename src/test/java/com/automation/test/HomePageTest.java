package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {


    @Test
    public void destination() {
        openWebPage();
        verify_user_is_on_homepage();
        user_clicks_on_where();
        user_selects_destination_by();
        select_check_in_and_check_out_date();
        select_number_of_people();
        user_click_on_search_button();
    }


    public void openWebPage() {
        homePage.openWebsite();
    }


    public void verify_user_is_on_homepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());

    }


    public void user_clicks_on_where() {
        homePage.clickOnWhere();
    }


    public void user_selects_destination_by() {
        homePage.selectRegion();
    }

    public void select_check_in_and_check_out_date() {
        homePage.selectCheckInDate();
        homePage.selectCheckOutDate();
    }

    public void select_number_of_people() {
        homePage.selectNumberOfPeople();
    }

    public void user_click_on_search_button() {
        homePage.clickOnSearch();
    }

    public void userClicksOnExperiences() {
        homePage.clickOnExperiences();
    }

    public void selectDates() {
        homePage.selectDatesOfExperiences();
    }

    public void user_clicks_on_global_icon() {
        homePage.clickOnGlobalIcon();
    }

    public void verify_language_options_are_displayed() {
        Assert.assertTrue(homePage.verifyLanguageIsDisplayed());

    }

    public void user_clicks_on_language() {
        homePage.selectLanguage();
    }

    public void verify_language_is_changed_to_the_selected_language() {
        Assert.assertTrue(homePage.verifyLanguageIsChanged());

    }

    public void userTypesLocationInTheSearchDestinationField(String destination) {
        homePage.searchDestinationInStays(destination);
    }

    public void userClicksOnDestination() {
        homePage.clickOnLocationInStaysSearch();
    }

    public void userClicksOnAirbnbYourHome() {
        homePage.clickOnAirbnbYourHome();
    }

    public void userClickOn(String location) {
        homePage.clickOnBeachfront(location);
    }

    public void userClicksOnTheShowMap() {
        homePage.clickOnShowMap();
    }

    public void userClicksOnTheDisplayTotalBeforeTaxes() {
        homePage.clickOnBeforeTax();
    }

    public void userSelectsCurrency() {
        homePage.clickOnCurrency();
    }

    public void user_selects_meet_your_host_option() {
        homePage.selectMeetYourHost();
    }

    public void verify_displayed_details_with_the_host_details() {
        Assert.assertTrue(homePage.verifyDisplayedDetailsOfHost());

    }

    public void userClicksOnProfileIcon() {
        homePage.profileIconSelection();
    }

    public void userClicksOnTheHelpCentreOption() {
        homePage.clicksOnHelpCentre();
    }

    public void userClicksOnThingsToDo() {
        homePage.clicksOnThingsToDo();
    }

    public void userSelectsDestination() {
        homePage.clickOnDestination();
    }

    public void userClicksOnFilter() {
        homePage.clickOnFilterOption();
    }


    public void userSelectsFilterByEntireHome() {
        homePage.clickOnEntireHome();
    }


    public void userSelectsFilterByPriceRange() {
        homePage.clickOnPriceFilter();
    }


    public void verifyDisplayedDetailsWithTheText(String message) {
        Assert.assertTrue(homePage.verifyThingsToDoMessage(message));

    }


    public void userClicksOnTheNextInCardImage() {
        homePage.clickOnNextCardImage();
    }


    public void verifyImageDisplayedIsSecond(String page) {
        Assert.assertTrue(homePage.verifySlidingImage(page));

    }


    public void verifyTotalBeforePriceIsDisplayedInThePage() {
        Assert.assertTrue(homePage.isTotalPriceBeforePageIsDisplayed());

    }


    public void userEntersMinimumPriceAndMaximumPrice(String min, String max) throws InterruptedException {
//        homePage.enterFilterMinimumPrice(min);
        homePage.enterFilterMaximumPrice(max);
        homePage.enterFilterMinimumPrice(min);
    }


    public void userSelectsBedroomsAndBeds(String bedroomsCount, String bedsCount) {
        homePage.increaseBedroomCount(Integer.parseInt(bedroomsCount));
        homePage.increaseBedCount(Integer.parseInt(bedsCount));
    }


    public void verifyCurrencyOptionsAreDisplayed() {
        homePage.lineOnCurrency();
    }

    public void selectTheCurrency() {
        homePage.clickOnNewCurrency();
    }

    public void verify_currency_is_changed_to_the_selected_currency() {
        Assert.assertTrue(homePage.verifyCurrency());

    }

    public void userSelectsGuestFavouritesInTopTierStays() {
        homePage.clickOnFavourite();
    }

    public void userSelectsWifiInAmenities() {
        homePage.clickOnWifi();
    }

    public void userSelectsInstantBookInBookingOptions() {
        homePage.clickOnInstantBook();
    }


    public void userSelectsHotelPropertyType() {
        homePage.clickOnHotel();
    }


    public void userSelectsFilterByAccessibilityFeatures() {
        homePage.clickOnAccessibility();
    }


    public void userSelectsLanguageEnglishInFilter() {
        homePage.clickOnLanguage();
    }


    public void userClicksOnShow() {
        homePage.clickOnShow();
    }

}
