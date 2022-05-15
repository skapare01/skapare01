package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertySetup extends BasePage {

    public PropertySetup(WebDriver driver) {
        super(driver);
    }

    private final By SELECT_NAVIGATE_TO_PROPERTY_SETTINGS = (By.xpath("/html/body/div[1]/div[3]/ul/li[2]/a"));
    // private final By SELECT_NAVIGATE_TO_PROPERTY_SETTINGS = (By.cssSelector("a href[module='properties setupxxx']"));
    private final By SELECT_CLICK_PROPERTY_COMMUNICATION = (By.id("property_communicationxxx"));

    private final By PROPERTY_BATTLEFIELD_PARK = By.xpath("//div//em[text()='Battlefield Park Apartments']");
    private final By SELECT_CAVALIER_COURT_PROPERTY_LOCATOR = (By.cssSelector("tr[data-property-name='Cavalier Court']")); //Dans Test Property
    private final By CLICK_CLOSE_BUTTON_FROM_PROPERTY_SETTINGS = (By.cssSelector("i[class='close-button close']"));

//Overlay Selector
    private final By SELECT_WAIT_FOR_PROPERTY_COMMUNICATION_OVERLAY = (By.cssSelector("div[class='loading-overlay bg-img-medium']"));
    public boolean selectCloseButtonFromPropertySettings() {return clickElement(CLICK_CLOSE_BUTTON_FROM_PROPERTY_SETTINGS); }

    public boolean clickPropertyBattlefieldPark() { return clickElement(PROPERTY_BATTLEFIELD_PARK); }
    public boolean selectCavalierCourtProperty() { return clickElement(SELECT_CAVALIER_COURT_PROPERTY_LOCATOR); } //Dan's Test Property
    public boolean navigateToPropertySettings() { return clickElement(SELECT_NAVIGATE_TO_PROPERTY_SETTINGS); }
//Communication Tab
    public boolean clickPropertyCommunication() {waitForPropertyCommunicationOverlay(); return clickElement(SELECT_CLICK_PROPERTY_COMMUNICATION, waitTimes.SHORT_WAIT); }
//Overlay Method
    public void waitForPropertyCommunicationOverlay() {waitForOverlay(SELECT_WAIT_FOR_PROPERTY_COMMUNICATION_OVERLAY); }
}
