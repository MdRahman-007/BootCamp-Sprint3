package Config_Runner;

/**
 * Created by mdrahman on 7/28/18.
 * Spring 2018
 */

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    /**
     * This is a constructor which initializes initPageElements()
     */
    public BaseClass() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " );
        }
    }

    public boolean isElementDisplayed(MobileElement mobileElement) {
        return mobileElement.isDisplayed();
    }


    /**
     * This method is used to slide screen
     *
     * @param x1
     * @param x2
     * @param y0
     *
     */
    protected void slideScreen(int x1, int x2, int y0 ) {
        try {
            TouchAction touchAction =new TouchAction(AppiumWrapper.getAppiumDriver());
            Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
            x1 = (int) (size.getWidth()*.20);
            x2 = (int) (size.getWidth()*.80);
            y0  = (int) (size.getHeight() * .50);

            touchAction.longPress(x2, y0).moveTo(x1, y0).release().perform();

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " );
        }
    }

    /**
     * This method is used to scroll screen
     *
     * @param y1
     * @param y2
     * @param x0
     *
     */
    protected void scrollDown(int y1, int y2, int x0 ) {
        try {
            TouchAction touchAction =new TouchAction(AppiumWrapper.getAppiumDriver());
            Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
            y1 = (int)  (size.getHeight()*.20);
            y2 = (int)  (size.getHeight()*.80);
            x0 = (int)  (size.getWidth ()*.50);

            touchAction.longPress(x0, y2).moveTo(x0, y1).release().perform();

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " );
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }




    /**
     * This method is used to set value in text field
     *
     * @param mobileElement element to extract text
     *
     */
    protected String getText(MobileElement mobileElement) {
        try {
            return mobileElement.getAttribute("text");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using:" +
                    " " + mobileElement.toString());
        }
    }


}

