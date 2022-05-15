package page_objects.entrata_page_objects.setup_tab.property_settings_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyListPage extends BasePage {

    public PropertyListPage(WebDriver driver) {
        super(driver);
    }

    //Property List General Variables.
    private final By PROPERTY_SEARCH = By.id("search_property_by_name");
    private final By PROPERTY_SEARCH_FIRST_RESULT = By.cssSelector("#properties_list_container > table > tbody > tr:nth-child(2) > td:nth-child(2) > div");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By ADD_PROPERTY_BUTTON = By.linkText("Add Property");

    //Product Specific Variables.
    private final String RV_PROPERTY_SEARCH_1 = "RV_Sid_PMEnable";
    private final By RV_PROPERTY_RESULT = By.xpath("//div//em[text()='" + RV_PROPERTY_SEARCH_1 + "']");
    private final By RENEWALS_PROPERTY_VILLAGE_BEND = By.xpath("//div//em[text()='The Village Bend East']");
    private final By PROPERTY_BATTLEFIELD_PARK = By.xpath("//div//em[text()='Battlefield Park Apartments']");
    private final By EARLE_PROPERTY = By.cssSelector("tr[data-property-name = '114 Earle']");
    private final By THIRTEENTH_NORTH_PARKWAYS_PROPERTY_LOCATOR = By.cssSelector("tr[data-property-name='13th North Parkways']");
    private final By LOFTS_AT_LORIEN = By.cssSelector("tr[data-property-name = 'Lofts at Lorien']");
    private final By AFFORDABLE_AUTOMATION = By.cssSelector("tr[data-property-name = 'Affordable_Automation']");
    private final By PROPERTY_BY_MANAGEMENT_NEW = By.cssSelector("tr[data-property-name = '0009 Property Management New']");

    //General Methods
    public boolean selectFirstPropertyFromList() {
        waitForOverlay(LOADING_OVERLAY);
        return clickElement(PROPERTY_SEARCH_FIRST_RESULT);
    }

    public boolean pressEnterInPropertySearch() {
        return pressEnter(PROPERTY_SEARCH);
    }

    public boolean searchPropertyName(String keys) {
        return sendKeysToElement(PROPERTY_SEARCH, keys);
    }

    public boolean clickPropertyInput() {
        return clickElement(PROPERTY_SEARCH);
    }

    public boolean clickAddPropertyButton(){return clickElement(ADD_PROPERTY_BUTTON);}

    //Product Specific Methods
    public boolean searchResidentVerifyProperty() {
        return sendKeysToElement(PROPERTY_SEARCH, RV_PROPERTY_SEARCH_1);
    }

    public boolean selectResidentVerifyProperty() {
        return clickElement(RV_PROPERTY_RESULT);
    }

    public boolean clickRenewalsPropertyVillageBend() {
        return clickElement(RENEWALS_PROPERTY_VILLAGE_BEND);
    }

    public boolean clickPropertyBattlefieldPark() {
        return clickElement(PROPERTY_BATTLEFIELD_PARK);
    }

    public boolean clickEarleProperty() {
        return clickElement(EARLE_PROPERTY);
    }

    public boolean selectThirteenthNorthParkwaysPropertyInList() {
        return clickElement(THIRTEENTH_NORTH_PARKWAYS_PROPERTY_LOCATOR);
    }

    public boolean clickLoftsAtLorien(){return clickElement(LOFTS_AT_LORIEN);}

    public boolean selectAffordableAutomationProperty() {
        return clickElement(AFFORDABLE_AUTOMATION);
    }

    public boolean clickPropertyManagementNew(){return clickElement(PROPERTY_BY_MANAGEMENT_NEW);}

}