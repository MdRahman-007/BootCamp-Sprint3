@mobile-regression @mobile

  Feature: Mobile Ionic-Conference App



    @mobile-2
    Scenario: Verify user should be able to search for event
      Given I am on home page of the app
      When  I Search for Breakfast
      Then  I verify Event displayed with header, Duration, description


    @mobile-3
    Scenario: Verify user should be able to view default main menu bar items
      Given I am on home page of the app
      When  I click on hamburger menu
      Then  I verify default main menu bar fields


    @mobile-4
    Scenario: Mobile_App: User should be able filter options
      Given I am on home page of the app
      When  I click on filter button
      And   I disable Angular option
      And   I click on All Reset Filter button
      Then  I verify all options are enabled