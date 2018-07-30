package Stepdefinition;


import Pages.HomeScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by mdrahman on 7/30/18.
 * Spring 2018
 */
public class HomeScrnSD {
    HomeScreen homeScreen = new HomeScreen();

    @Given("^I am on home page of the app$")
    public void verifyHomeScreen() {
        homeScreen.verifyHomeScreen();
    }


    @When("^I Search for (.+)$")
    public void searchForItem(String item) {
        homeScreen.searchItem(item);
    }

    @Then("^I verify Event displayed with header, Duration, description$")
    public void verifyHeaderDurationDescription() { homeScreen.verifySearchResult(
            "Breakfast",
            "8:00 am-9:00 am",
            "MainHallway");
    }



    @When("^I click on hamburger menu$")
    public void clickOnHamburgerMenue() {
        homeScreen.clickOnHamburgerMenue();
    }

    @Then("^I verify default main menu bar fields$")
    public void verifyMainMenuBar() {
        homeScreen.verifyMainMenueBar();
    }



    @When("^I click on filter button$")
    public void clickOnFilter() {
        homeScreen.clickOnFilterButton();
    }

    @When("^I disable Angular option$")
    public void disableOption() {
        homeScreen.clickOnAngularOption();
    }

    @When("^I click on All Reset Filter button$")
    public void resetAllFilterButton() {
        homeScreen.clickOnResetAll();
    }

    @Then("^I verify all options are enabled$")
    public void verifyAllOptionsAreEnabled() {
        homeScreen.verifyAllOptionsAreEnabled();
    }

}
