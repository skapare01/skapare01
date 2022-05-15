package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalLoginPage extends BasePage {

    //Variables
    private final By RESIDENT_PORTAL_LOGIN_USERNAME = By.id("username");
    private final By RESIDENT_PORTAL_LOGIN_PASSWORD = By.name("password");
    private final By RESIDENT_PORTAL_LOGIN_BUTTON = By.cssSelector(".ehlti5m0");

    //Bulk Payment Login
    private final By MAKE_A_BULK_PAYMENT_BUTTON = By.xpath("//*[contains(text(), 'Make a Bulk Payment')]");

    public ResidentPortalLoginPage(WebDriver driver) {
        super(driver);
    }

    //Login Methods
    public boolean enterEmailToResidentLogin(String username) {
        return sendKeysToElement(RESIDENT_PORTAL_LOGIN_USERNAME, username);
    }

    public boolean enterPasswordToResidentLogin(String password) {
        return sendKeysToElement(RESIDENT_PORTAL_LOGIN_PASSWORD, password);
    }

    public boolean clickLogInButton() {
        return clickElement(RESIDENT_PORTAL_LOGIN_BUTTON);
    }

    public boolean clickMakeABulkPaymentButton() {
        return clickElement(MAKE_A_BULK_PAYMENT_BUTTON, waitTimes.DEFAULT_WAIT);
    }


}
