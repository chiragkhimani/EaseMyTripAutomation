package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a/span[text()='Flights']")
    WebElement flightTab;

    public void openApplication() {
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isHomePageDisplayed() {
        // We don't have homepage in Web
        return true;
    }

    public void clickOnFlightTab() {
        flightTab.click();
    }
}
