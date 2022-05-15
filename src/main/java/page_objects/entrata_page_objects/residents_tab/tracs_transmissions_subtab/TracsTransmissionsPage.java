package page_objects.entrata_page_objects.residents_tab.tracs_transmissions_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TracsTransmissionsPage extends BasePage {

    public TracsTransmissionsPage(WebDriver driver) {
        super(driver);
    }

    //TRACS sub-tab locators
    private final By TRACS_TRANSACTION_ID_COLUMN = By.xpath("//th[text()='Transaction ID']");
    private final By TRACS_TYPE_COLUMN = By.xpath("//th[text()='Type']");
    private final By TRACS_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By TRACS_RECIPIENT_COLUMN = By.xpath("//th[text()='Recipient']");
    private final By TRACS_SUBJECT_COLUMN = By.xpath("//th[text()='Subject']");
    private final By TRACS_ITEMS_COLUMN = By.xpath("//th[text()='Items']");
    private final By TRACS_TRANSMISSION_DATE_COLUMN = By.xpath("//th[text()='Transmission Date']");
    private final By TRACS_RESPONSE_DATE_ID_COLUMN = By.xpath("//th[text()='Response Date / ID']");
    //TRACS sync transmissions locators
    private final By SYNC_TRANSMISSIONS_BUTTON = By.cssSelector("i[class='sync transition']");
    private final By SYNC_TRANSMISSIONS_WINDOW_TITLE = By.xpath("//div/span[text()='Sync Transmissions']");
    private final By ENVIRONMENT_URL_DROPDOWN = By.cssSelector("select[name='wass_authentications[environment_url]']");
    private final By USER_ID_SYNC_TRANSMISSIONS_WINDOW = By.cssSelector("input[name='wass_authentications[user_id]']");
    private final By PASSWORD_SYNC_TRANSMISSIONS_WINDOW = By.cssSelector("input[name='wass_authentications[password]']");
    private final By NEED_HELP_LOGGING_IN_LINK = By.linkText("Need help logging in?");
    private final By LOGIN_BUTTON_SYNC_TRANSMISSIONS = By.id("submit_wass_login");
    private final By CANCEL_BUTTON_SYNC_TRANSMISSIONS = By.id("cancel");

    //TRACS methods
    public boolean confirmTracsColumn_TransactionId() {
        return confirmElementIsVisible(TRACS_TRANSACTION_ID_COLUMN);
    }

    public boolean confirmTracsColumn_Type() {
        return confirmElementIsVisible(TRACS_TYPE_COLUMN);
    }

    public boolean confirmTracsColumn_Property() {
        return confirmElementIsVisible(TRACS_PROPERTY_COLUMN);
    }

    public boolean confirmTracsColumn_Recipient() {
        return confirmElementIsVisible(TRACS_RECIPIENT_COLUMN);
    }

    public boolean confirmTracsColumn_Subject() {
        return confirmElementIsVisible(TRACS_SUBJECT_COLUMN);
    }

    public boolean confirmTracsColumn_Items() {
        return confirmElementIsVisible(TRACS_ITEMS_COLUMN);
    }

    public boolean confirmTracsColumn_TransmissionDate() {
        return confirmElementIsVisible(TRACS_TRANSMISSION_DATE_COLUMN);
    }

    public boolean confirmTracsColumn_ResponseDateId() {
        return confirmElementIsVisible(TRACS_RESPONSE_DATE_ID_COLUMN);
    }

    //TRACS sync transmissions methods
    public boolean clickSyncButtonTracs() {
        return clickElement(SYNC_TRANSMISSIONS_BUTTON);
    }

    public String verifySyncTransmissionsWindowTitle() {
        return getElementText(SYNC_TRANSMISSIONS_WINDOW_TITLE);
    }

    public boolean verifyEnvironmentUrlDropdown() {
        return confirmElementIsVisible(ENVIRONMENT_URL_DROPDOWN);
    }

    public boolean verifyUserIdFieldSyncTransmissions() {
        return confirmElementIsVisible(USER_ID_SYNC_TRANSMISSIONS_WINDOW);
    }

    public boolean verifyPasswordFieldSyncTransmissions() {
        return confirmElementIsVisible(PASSWORD_SYNC_TRANSMISSIONS_WINDOW);
    }

    public boolean verifyNeedHelpLoggingInLinkSyncTransmissions() {
        return confirmElementIsVisible(NEED_HELP_LOGGING_IN_LINK);
    }

    public boolean verifyLoginButtonSyncTransmissionsScreen() {
        return confirmElementIsVisible(LOGIN_BUTTON_SYNC_TRANSMISSIONS);
    }

    public boolean verifyCancelLinkSyncTransmissions() {
        return confirmElementIsVisible(CANCEL_BUTTON_SYNC_TRANSMISSIONS);
    }

}
