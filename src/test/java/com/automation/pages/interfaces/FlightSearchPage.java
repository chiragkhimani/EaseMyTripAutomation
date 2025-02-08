package com.automation.pages.interfaces;

public interface FlightSearchPage {

    boolean isFlightSearchPageDisplayed();

    void enterFromCity(String fromCity);

    void enterToCity(String toCity);

    void enterDate(String date);

    void clickOnFlightSearchBtn();

    void clickOnReturnDateElement();

    boolean isRoundTripTabActivated();
}
