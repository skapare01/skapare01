package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.time.Duration;

public class VendorsContacts extends BasePage {

    public VendorsContacts(WebDriver driver) {
        super(driver);
    }

    private final By CONTACTS_TAB = By.cssSelector("a[onclick*='view_contacts']");
    private final By CONTACTS_INFO = By.id("view_ap_payee_contacts");
    private final By ADD_CONTACT_BUTTON = By.cssSelector("a[onclick*='create_or_edit_contact']");
    private final By FIRST_NAME = By.id("name_first_add");
    private final By LAST_NAME = By.id("name_last");
    private final By ASSOCIATED_LOCATIONS = By.id("advanced_location_id_multiselect");
    private final By SET_AS_PRIMARY_CONTACT_FOR = By.id("advanced_primary_location_id_multiselect");
    private final By POSITION = By.id("title");
    private final By PHONE_BOX = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[6]/div");
    private final By PHONE_AREA_CODE = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[6]/div/input[2]");
    private final By PHONE_FIRST = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[6]/div/input[3]");
    private final By PHONE_SECOND = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[6]/div/input[4]");
    private final By EXTENSION = By.name("ap_payee_contact[extension]");
    private final By FAX_BOX = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[7]/div");
    private final By FAX_AREA_CODE = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[7]/div/input[2]");
    private final By FAX_FIRST = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[7]/div/input[3]");
    private final By FAX_SECOND = By.xpath("//*[@id=\"add_contact_info\"]/fieldset/div[7]/div/input[4]");
    private final By EMAIL = By.id("email_address");
    private final By SUBMIT_CONTACT_BUTTON = By.cssSelector("input[value='Add']");
    private final By CANCEL_HYPERLINK = By.cssSelector("a[onclick*='ap_payee_system_confirm_div']");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");
    private final By OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");


    public boolean contactsTabClick() {
        return clickElement(CONTACTS_TAB);
    }

    public boolean addContactButtonClick() {
        return clickElement(ADD_CONTACT_BUTTON);
    }

    public boolean firstNameInput(String name) {
        return sendKeysToElement(FIRST_NAME, name);
    }

    public boolean lastNameInput(String name) {
        return sendKeysToElement(LAST_NAME, name);
    }

    public boolean positionInput(String name) {
        return sendKeysToElement(POSITION, name);
    }

    public boolean phoneAreaInput(String num) {
        return sendKeysToElement(PHONE_AREA_CODE, num);
    }

    public boolean phoneFirstInput(String num) {
        return sendKeysToElement(PHONE_FIRST, num);
    }

    public boolean phoneSecondInput(String num) {
        return sendKeysToElement(PHONE_SECOND, num);
    }

    public boolean extensionInput(String num) {
        return sendKeysToElement(EXTENSION, num);
    }

    public boolean faxAreaInput(String num) {
        return sendKeysToElement(FAX_AREA_CODE, num);
    }

    public boolean faxFirstInput(String num) {
        return sendKeysToElement(FAX_FIRST, num);
    }

    public boolean faxSecondInput(String num) {
        return sendKeysToElement(FAX_SECOND, num);
    }

    public boolean emailInput(String name) {
        waitForOverlay(OVERLAY, Duration.ofSeconds(2));
        return sendKeysToElement(EMAIL, name);
    }

    public boolean submitContactButtonClick() {
        return clickElement(SUBMIT_CONTACT_BUTTON);
    }

    //Visibility

    public boolean contactsInfoVisible() {
        return confirmElementIsVisible(CONTACTS_INFO);
    }

    public boolean firstNameVisible() {
        return confirmElementIsVisible(FIRST_NAME);
    }

    public boolean lastNameVisible() {
        return confirmElementIsVisible(LAST_NAME);
    }

    public boolean associatedLocationsVisible() {
        return confirmElementIsVisible(ASSOCIATED_LOCATIONS);
    }

    public boolean setAsPrimaryContactVisible() {
        return confirmElementIsVisible(SET_AS_PRIMARY_CONTACT_FOR);
    }

    public boolean positionVisible() {
        return confirmElementIsVisible(POSITION);
    }

    public boolean phoneVisible() {
        return confirmElementIsVisible(PHONE_BOX);
    }

    public boolean extensionVisible() {
        return confirmElementIsVisible(EXTENSION);
    }

    public boolean faxVisible() {
        return confirmElementIsVisible(FAX_BOX);
    }

    public boolean emailVisible() {
        return confirmElementIsVisible(EMAIL);
    }

    public boolean submitContactButtonVisible() {
        return confirmElementIsVisible(SUBMIT_CONTACT_BUTTON);
    }

    public boolean cancelHyperlinkVisible() {
        return confirmElementIsVisible(CANCEL_HYPERLINK);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
