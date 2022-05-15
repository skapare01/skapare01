package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FacebookPageTransmissionLogCurtain extends BasePage {

    //Transmission Log element Locators
    private final By FACEBOOK_PAGE_TRANSMISSION_LOG_WINDOW_LOCATOR = By.id("trans-log");
    private final By FACEBOOK_PAGE_TRANS_LOG_PROPERTY_NODE = By.xpath("//span[text()='Property']");
    private final By FACEBOOK_PAGE_TRANS_LOG_LOCATION_NODE = By.xpath("//span[text()='Location']");
    private final By FACEBOOK_PAGE_TRANS_LOG_DETAILS_NODE = By.xpath("//span[text()='Details']");
    private final By FACEBOOK_PAGE_TRANS_LOG_HOURS_NODE = By.xpath("//span[text()='Hours']");
    private final By FACEBOOK_PAGE_TRANS_LOG_CURRENT_DATA_TOGGLE = By.cssSelector("div[data-pattern='switchbutton']");

    //Property Node Details
    private final By FACEBOOK_PAGE_TRANS_LOG_PROPERTY_NAME_LOCATOR = By.cssSelector("h3[class='margin15-bottom']");

    //Constructor
    public FacebookPageTransmissionLogCurtain(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean confirmTransmissionLogOpenedInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANSMISSION_LOG_WINDOW_LOCATOR);
    }

    public boolean confirmPropertyNodeVisibleInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_PROPERTY_NODE);
    }

    public boolean confirmLocationNodeVisibleInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_LOCATION_NODE);
    }

    public boolean confirmDetailsNodeVisibleInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_DETAILS_NODE);
    }

    public boolean confirmHoursNodeVisibleInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_HOURS_NODE);
    }

    public boolean confirmShowCurrentDataToggleVisibleInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_CURRENT_DATA_TOGGLE);
    }

    public boolean confirmPropertyNameVisibleInPropertyNodeInTransmissionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANS_LOG_PROPERTY_NAME_LOCATOR);
    }

}
