package com.automation.pages.android;

import com.automation.pages.common.BasePage;
import com.automation.pages.interfaces.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidHomePage extends BasePage implements HomePage {

    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    WebElement doNotAllowBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Flights']")
    WebElement flightsTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Hotels']")
    WebElement hotelsTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Trains']")
    WebElement trainsTab;


    public void openApplication() {
        doNotAllowBtn.click();
    }

    public boolean isHomePageDisplayed() {
        return flightsTab.isDisplayed() && hotelsTab.isDisplayed();
    }

    public void clickOnFlightTab() {
        flightsTab.click();
    }
}
