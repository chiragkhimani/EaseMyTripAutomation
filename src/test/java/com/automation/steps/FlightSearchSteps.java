package com.automation.steps;

import com.automation.pages.FlightSearchPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FlightSearchSteps {

    FlightSearchPage flightSearchPage = new FlightSearchPage();

    @Then("verify flight search page is displayed")
    public void verifyFlightSearchPageIsDisplayed() {
        Assert.assertTrue(flightSearchPage.isFlightSearchPageDisplayed());
    }

    @When("user search flight with from city {string} and to city {string} with date {string}")
    public void userSearchFlightWithFromCityAndToCityWithDate(String fromCity, String toCity, String date) {
        flightSearchPage.enterFromCity(ConfigReader.getConfigValue(fromCity));
        flightSearchPage.enterToCity(ConfigReader.getConfigValue(toCity));
        flightSearchPage.enterDate(ConfigReader.getConfigValue(date));
        flightSearchPage.clickOnFlightSearchBtn();
    }

    @When("user select return date {string}")
    public void userSelectReturnDate(String date) {
        flightSearchPage.clickOnReturnDateElement();
        flightSearchPage.enterDate(ConfigReader.getConfigValue(date));
    }

    @Then("verify round trip tab is activated")
    public void verifyRoundTripTabIsActivated() {
        Assert.assertTrue(flightSearchPage.isRoundTripTabActivated());
    }
}
