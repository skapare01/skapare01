package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EntrataLoginPage extends BasePage {

    private final By PASSWORD_INPUT = By.id("company_user[password]");
    private final By USERNAME_INPUT = By.id("company_user[username]");
    private final By LOGIN_BUTTON = By.xpath("//a[contains(text(), 'Login')]");
    private final By ADMIN_LOGIN_OPTION = By.className("admin_saml_login");
    private final By ADVANCE_BUTTON_LOCATOR = By.id("details-button");
    private final By PROCEED_LINK_LOCATOR = By.id("proceed-link");

    public EntrataLoginPage(WebDriver driver){
        super(driver);
    }

    public boolean enterEntrataUsername(String username){
        if(System.getProperty("certificatesExpiredBanner").equalsIgnoreCase("true")){
            clickElement(ADVANCE_BUTTON_LOCATOR, waitTimes.SHORT_WAIT);
            clickElement(PROCEED_LINK_LOCATOR, waitTimes.SHORT_WAIT);}
         if(confirmElementIsVisible(USERNAME_INPUT)){
            return sendKeysToElement(USERNAME_INPUT, username);}
        else{
                clickElement(ADMIN_LOGIN_OPTION);
            return sendKeysToElement(USERNAME_INPUT, username);
        }
    }

    public boolean enterEntrataPassword(String password){
        return sendKeysToElement(PASSWORD_INPUT, password);
    }

    public boolean clickLoginButton(){
        return clickElement(LOGIN_BUTTON);
    }

}
