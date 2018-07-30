$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Andrd_SplashScrn.feature");
formatter.feature({
  "line": 3,
  "name": "Mobile Screen Swipe",
  "description": "",
  "id": "mobile-screen-swipe",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mobile-regression"
    },
    {
      "line": 1,
      "name": "@mobile"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should be able to slide right on tutorial pages",
  "description": "",
  "id": "mobile-screen-swipe;verify-user-should-be-able-to-slide-right-on-tutorial-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@mobile-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on Splash screen of the ionic conference app",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I swipe right 3 times on tutorials slides",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify Continue button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SplashScreenSD.verifySplashScreen()"
});
formatter.result({
  "duration": 13653683665,
  "status": "passed"
});
formatter.match({
  "location": "SplashScreenSD.slide3Times()"
});
formatter.result({
  "duration": 6461110974,
  "status": "passed"
});
formatter.match({
  "location": "SplashScreenSD.verifyContinueButton()"
});
formatter.result({
  "duration": 570986981,
  "status": "passed"
});
});