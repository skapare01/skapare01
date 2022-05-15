package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalNavigationPage extends BasePage {

    //Variables
    private final By RESIDENT_PORTAL_RESIDENT_PROFILE_ICON_BUTTON = By.cssSelector(".css-nbduhy");
    private final By RESIDENT_PORTAL_HAMBURGER_MENU = By.cssSelector("button[title='More']");
    private final By RESIDENT_PORTAL_PAYMENTS_FROM_MAIN_MENU = By.name("Payments");
    private final By MY_APARTMENT_DROPDOWN_BUTTON_COLLAPSED = By.cssSelector("#item-title-14[aria-expanded='false']");
    private final By MY_APARTMENT_DROPDOWN_BUTTON_EXPANDED = By.cssSelector("#item-title-14[aria-expanded='true']");
    private final By EXTENDED_MENU_CONTACT_PROPERTY_BUTTON = By.name("Contact Property");
    private final By EXTENDED_MENU_MESSAGES_AND_ALERTS_BUTTON = By.name("Messages & Alerts");
    private final By EXTENDED_MENU_MAINTENANCE_BUTTON = By.cssSelector("a[href='/app/apartment/maintenance']");
    private final By EXTENDED_MENU_SETTINGS_BUTTON = By.cssSelector("a[href='/app/setting']");
    private final By EXTENDED_MENU_LABEL = By.id("modal-2d46e2-title");

    public ResidentPortalNavigationPage(WebDriver driver) {
        super(driver);
    }

    //Methods

    public boolean residentInitialsAreVisibleAtTopRightCorner() {
        return confirmElementIsVisible(RESIDENT_PORTAL_RESIDENT_PROFILE_ICON_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean clickHamburgerMenu() {
        return clickElement(RESIDENT_PORTAL_HAMBURGER_MENU, waitTimes.DEFAULT_WAIT);
    }

    public boolean clickResidentProfileIconButton() {
        return clickElement(RESIDENT_PORTAL_RESIDENT_PROFILE_ICON_BUTTON);
    }

    public boolean clickPaymentsFromMainMenu() {
        return clickElement(RESIDENT_PORTAL_PAYMENTS_FROM_MAIN_MENU);
    }

    public boolean expandMyApartmentMenu() {
        waitForExtendedMenu();
        return clickElement(MY_APARTMENT_DROPDOWN_BUTTON_COLLAPSED);
    }

    public boolean confirmMyApartmentMenuExpanded() {
        return confirmElementIsVisible(MY_APARTMENT_DROPDOWN_BUTTON_EXPANDED);
    }

    public boolean clickMaintenanceFromExtendedMenu() {
        return clickElement(EXTENDED_MENU_MAINTENANCE_BUTTON);
    }

    public boolean clickContactPropertyFromExtendedMenu() {
        return clickElement(EXTENDED_MENU_CONTACT_PROPERTY_BUTTON);
    }

    public boolean clickMessagesAndAlertsFromExtendedMenu() {
        return clickElement(EXTENDED_MENU_MESSAGES_AND_ALERTS_BUTTON);
    }

    public boolean clickSettingsFromExtendedMenu() {
        return clickElement(EXTENDED_MENU_SETTINGS_BUTTON);
    }

    private void waitForExtendedMenu() {
        confirmElementIsVisible(EXTENDED_MENU_LABEL);
    }

}
