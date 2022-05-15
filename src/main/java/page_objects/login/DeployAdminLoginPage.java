package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DeployAdminLoginPage extends BasePage {
    public DeployAdminLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By USERNAME_TEXT_FIELD = By.id("user_login");
    private final By PASSWORD_TEXT_FIELD = By.id("user_pass");
    private final By LOGIN_BUTTON_LOCATOR = By.id("Login");

    public boolean enterUsernameInTextField(String username) {
        return sendKeysToElement(USERNAME_TEXT_FIELD, username);
    }

    public boolean enterPasswordInTextField(String password) {
        return sendKeysToElement(PASSWORD_TEXT_FIELD, password);
    }

    public boolean clickLoginButton() {
        return clickElement(LOGIN_BUTTON_LOCATOR);
    }
}
