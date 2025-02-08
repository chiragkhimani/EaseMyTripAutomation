package com.automation.pages.interfaces;

public interface FlightListingPage {
    boolean isFlightListingPageDisplayed();

    void selectFilterOption(String filterOption);

    boolean isFlightListingDisplayedWithFilter(String filterOption);
}
