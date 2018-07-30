package Stepdefinition;

import Pages.HomeScreen;
import Pages.SplashScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by mdrahman on 7/28/18.
 * Spring 2018
 */
public class SplashScreenSD {

    SplashScreen splashScreen = new SplashScreen();

    @Given("^I am on Splash screen of the ionic conference app$")
    public void verifySplashScreen() {
        splashScreen.verifySplashScreen();
    }

    @When("^I swipe right 3 times on tutorials slides$")
    public void slide3Times() {
        splashScreen.slideRight(3);
    }

    @Then("^I verify Continue button is displayed$")
    public void verifyContinueButton() {
        splashScreen.verifyContinueButton();
    }

}

