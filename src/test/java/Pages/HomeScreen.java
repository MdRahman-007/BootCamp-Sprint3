package Pages;

import Config_Runner.AppiumWrapper;
import Config_Runner.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.List;


/**
 * Created by mdrahman on 7/28/18.
 * Spring 2018
 */
public class HomeScreen extends BaseClass {

    @AndroidFindBy(accessibility = "SKIP ")
    private MobileElement skip_Button;

    @AndroidFindBy(accessibility = "menu ")
    private MobileElement menu_Button;

    @AndroidFindBy(xpath = "//android.view.View[@index = '3']")
    private MobileElement about_Button_HomeScreen;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index = '4']")
    private MobileElement searchBox;

    @AndroidFindBy(xpath = "//android.widget.Button[@index = '9']")
    private MobileElement searchItem;

    @AndroidFindBy(xpath = "//android.view.View[@index = '2']")
    private MobileElement header;

    @AndroidFindBy(xpath = "//android.view.View[@index = '3']")
    private MobileElement duration;

    @AndroidFindBy(xpath = "//android.view.View[@index = '4']")
    private MobileElement description;

    @AndroidFindBy(accessibility = "options ")
    private MobileElement filterButton;

    @AndroidFindBy(id = "tgl-56-0")
    private MobileElement angularButton;

    @AndroidFindBy(accessibility = "calendar Schedule ")
    private MobileElement resetAllButton;

    @AndroidFindBy(className = "android.widget.CheckBox")
    private MobileElement allOptionsCheckBox;


    public void verifyHomeScreen(){
        tapOn(skip_Button);
        Assert.assertTrue(isElementDisplayed(about_Button_HomeScreen));
    }
    public void searchItem(String text){
        setValue(searchBox,text);
    }

    public void verifySearchResult(String eventHeader, String eventDuration, String eventDescription) {

        tapOn(searchItem);

        if (eventHeader.contains(getText(header))) {
            System.out.println("Header Displayed as expected"+getText(header));
        } else {
            System.out.println("Header is mismatched or not displayed"+getText(header));
        }

        if (eventDuration.contains(getText(duration))) {
            System.out.println("Duration displayed as expected");
        } else {
            System.out.println("Duration is mismatched or not displayed");
        }

        if (eventDescription.contains(getText(description))) {
            System.out.println("Description displayed as expected");
        } else {
            System.out.println("Description is mismatched or not displayed");
        }
    }

    public void clickOnFilterButton(){
        tapOn(filterButton);
    }
    public void clickOnAngularOption(){
        tapOn(angularButton);
    }
    public void clickOnResetAll() {
        scrollDown(100,2000,800);
        tapOn(resetAllButton);
    }


    public void verifyAllOptionsAreEnabled() {
        try {
            Assert.assertEquals(numberOfOptions(), numberOfCheckBoxes());
            System.out.println("Verification completed !\n---------------------------");
            System.out.println("All the options are enabled");
        }catch (AssertionError a){
            a.printStackTrace();
            System.out.println("All the options are not enabled ! ");
        }
    }
    public int numberOfCheckBoxes() {

        List<MobileElement> listOfCheckBox = AppiumWrapper.getAppiumDriver().findElements(By.className("android.widget.CheckBox"));

        int counter = 0;
        for (MobileElement mE : listOfCheckBox) {
            boolean isEnambled = mE.isEnabled();
            if (isEnambled) {
                counter++;
            }
        } return counter;
    }
    public int numberOfOptions() {

        List<AndroidElement> listOfFilterOptions = AppiumWrapper.getAppiumDriver().findElements
                (By.xpath("//android.view.View[contains(@resource-id,'lbl')]"));
        int c = 0;
        for (AndroidElement aE : listOfFilterOptions) {

            if ((aE.getAttribute("name").contains(":"))
                    ||aE.getAttribute("name").contains(" am")
                    ||aE.getAttribute("name").contains(" pm")) {

            }else{
                c++;
            }
        }
        return c;
    }


    public void clickOnHamburgerMenue() {
        try {
            tapOn(menu_Button);
        }catch (AssertionError a){
            a.printStackTrace();
            System.out.println("All the options are not enabled ! ");
        }
    }
    public void verifyMainMenueBar() {
        try {
            Assert.assertEquals(numberOfOptions(), numberOfCheckBoxes());
            System.out.println("Verification completed !\n---------------------------");
            System.out.println("All the options are enabled");
        }catch (AssertionError a){
            a.printStackTrace();
            System.out.println("All the options are not enabled ! ");
        }
    }



}

