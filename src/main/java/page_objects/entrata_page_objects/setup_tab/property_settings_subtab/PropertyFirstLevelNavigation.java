package page_objects.entrata_page_objects.setup_tab.property_settings_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyFirstLevelNavigation extends BasePage {

    public PropertyFirstLevelNavigation(WebDriver driver) {
        super(driver);
    }

    private final By PROPERTY_TAB = By.id("property_detailsxxx");
    private final By PRICING_TAB = By.id("property_pricingxxx");
    private final By MARKETING_TAB = By.id("property_marketingxxx");
    private final By LEASING_TAB = By.id("property_leasing_systemxxx");
    private final By RESIDENTS_TAB = By.id("property_residents_systemxxx");
    private final By FINANCIAL_TAB = By.id("property_financial_systemxxx");
    private final By COMMUNICATION_TAB = By.id("property_communicationxxx");
    private final By DATA_MANAGEMENT_TAB = By.id("property_data_managementxxx");
    private final By OVERLAY_AFTER_LOADING_PROPERTY_SETTINGS = By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div[2]/div");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");

    private void propertySettingsOverlay() {
        waitForOverlay(OVERLAY_AFTER_LOADING_PROPERTY_SETTINGS);
    }

    public boolean clickPropertyTab() {
        return clickElement(PROPERTY_TAB);
    }

    public String confirmPropertyTab() {
        return getElementText(PROPERTY_TAB);
    }

    public boolean clickPricingTab() {
        propertySettingsOverlay();
        return clickElement(PRICING_TAB);
    }

    public boolean clickMarketingTab() {
        propertySettingsOverlay();
        return clickElement(MARKETING_TAB);
    }

    public boolean clickLeasingTab() {
        propertySettingsOverlay();
        return clickElement(LEASING_TAB);
    }

    public boolean clickResidentsTab() {
        propertySettingsOverlay();
        return clickElement(RESIDENTS_TAB);
    }

    public boolean clickFinancialTab() { propertySettingsOverlay();
        return clickElement(FINANCIAL_TAB);
    }

    public boolean clickCommunicationTab() {
        propertySettingsOverlay();
        return clickElement(COMMUNICATION_TAB);
    }

    public boolean clickDataManagementTab() {
        return clickElement(DATA_MANAGEMENT_TAB);
    }

    public boolean clickDataManagementTabAfterOverlay() {
        propertySettingsOverlay();
        return clickElement(DATA_MANAGEMENT_TAB);
    }

    public boolean clickCloseButton() { return clickElement(CLOSE_BUTTON);}

}
