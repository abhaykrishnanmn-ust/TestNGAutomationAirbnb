package com.automation.test;


import com.automation.pages.HostPage;
import com.automation.utils.ReportManager;
import org.testng.Assert;

public class HostPageTest {
    HostPage hostPage = new HostPage();

    
    public void userSelectsACardWithHostPreview() {
        hostPage.clicksOnHostPreview();
    }

    
    public void hostDetailsAreTaken() {
        hostPage.getsHostDetails();
    }

    
    public void userCloseThePreview() {
        hostPage.closeHostDetails();
    }

    
    public void userOpenTheSameCard() {
        hostPage.openCardWithPreview();
    }

    
    public void verify_displayed_host_details_with_the_details_in_preview() {
        Assert.assertTrue(hostPage.verifyHostNameOnPreview());
        ReportManager.attachScreenShot();
    }
}
