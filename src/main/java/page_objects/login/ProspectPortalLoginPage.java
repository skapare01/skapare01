package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProspectPortalLoginPage extends BasePage {

    //Constructor
    public ProspectPortalLoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private final By USERNAME_INPUT = By.name("applicant[username]");
    private final By PASSWORD_INPUT = By.name("applicant[password]");
    private final By LOGIN_BUTTON = By.id("oa_login_submit");

    //Login Methods
    public boolean enterUsername(String username){
        return sendKeysToElement(USERNAME_INPUT, username);
    }

    public boolean enterPassword(String password){
        return sendKeysToElement(PASSWORD_INPUT, password);
    }

    public boolean clickLoginButton(){
        return clickElement(LOGIN_BUTTON);
    }


}
