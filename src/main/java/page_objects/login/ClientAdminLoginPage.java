package page_objects.login;

import navigation.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientAdminLoginPage extends BasePage {

    private final By USERNAME_INPUT = By.name("ctl00$ContentPlaceHolder1$UsernameTextBox");
    private final By PASSWORD_INPUT = By.name("ctl00$ContentPlaceHolder1$PasswordTextBox");
    private final By ADVANCE_BUTTON_LOCATOR = By.id("details-button");
    private final By PROCEED_LINK_LOCATOR = By.id("proceed-link");
    private final By LOGIN_BUTTON = By.id("signin-submit");
    private final By CLICK_HERE_TO_LOGIN = By.linkText("click here");

    public ClientAdminLoginPage(WebDriver driver) {
        super(driver);
    }


    public boolean pressEnterOnPassword() {
        return pressEnter(PASSWORD_INPUT);
    }

    public boolean enterClientAdminUsername(String username) {
        if (System.getProperty("certificatesExpiredBanner").equalsIgnoreCase("true")) {
            clickElement(ADVANCE_BUTTON_LOCATOR, waitTimes.SHORT_WAIT);
            clickElement(PROCEED_LINK_LOCATOR, waitTimes.SHORT_WAIT);
        }
        return sendKeysToElement(USERNAME_INPUT, username);
    }

    public boolean enterClientAdminPassword(String password) {
        return sendKeysToElement(PASSWORD_INPUT, password);
    }

    public boolean clickClickHereToLogin() {
        return clickElement(CLICK_HERE_TO_LOGIN);
    }

    public boolean clickLoginButton() {
        return clickElement(LOGIN_BUTTON);
    }
    public boolean openNewTabAndNavigateToClientAdmin() {
        return openNewTabAndSwitchToThatTab("https://clientadmin" + System.getProperty("login.url"));
    }
}
