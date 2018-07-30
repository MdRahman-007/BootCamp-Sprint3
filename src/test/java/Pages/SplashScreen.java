package Pages;

import Config_Runner.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;


/**
 * Created by mdrahman on 7/28/18.
 * Spring 2018
 */
public class SplashScreen extends BaseClass {

    @AndroidFindBy(accessibility = "SKIP ")
    private MobileElement skip_Button;

    @AndroidFindBy(xpath= "//android.widget.Button[@index='0']")
    private MobileElement continue_Button;


    public void verifySplashScreen() {
        try {
            Assert.assertTrue(isElementDisplayed(skip_Button));
        } catch (AssertionError a) {
            a.printStackTrace();
        }
    }
    public void slideRight(int x) {
        try {
            for (int i = 1; i <= x; i++) {
                slideScreen(50, 2000, 1000);
            }
        } catch (AssertionError a) {
            a.printStackTrace();
        }
    }
    public void verifyContinueButton()  {
        try {
            Assert.assertTrue(isElementDisplayed(continue_Button));
        }catch (AssertionError a){
            a.printStackTrace();
        }



    }

}

