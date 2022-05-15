package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DashboardFilters extends BasePage {
    public DashboardFilters(WebDriver driver) { super(driver); }

    // Filter Buttons Selectors
    private final By FILTER_BUTTON = By.cssSelector("i[class='dark-filter']");
    private final By FILTER_RESULTS_BUTTON = By.cssSelector("input[class='form-submit']");
    // Click Remove Property Selector
    private final By REMOVE_PROPERTY_ALL_PROPERTIES = By.cssSelector("i[class='delete'][title='Remove']");
    // Add Property(ies) Button Selector
    private final By ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By ADD_PROPERTY_CHERRY_HILL = By.xpath("//span[text()='Cherry Hill Apartments']");
    // Property Search Text Bar Selector
    private final By ADD_PROPERTIES_FROM_PROPERTY_LIST_TEXT_BAR = By.id("test");
    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    //View / Click Filter Button Methods
    public boolean clickOpenFilterButton() {return clickElement(FILTER_BUTTON);}
    // Click Remove Property Method
    public boolean clickRemovePropertyAllProperties() {return clickElement(REMOVE_PROPERTY_ALL_PROPERTIES, waitTimes.LONG_WAIT);}
    // Add Property(ies) Button Method
    public boolean clickAddPropertiesButton() {waitForPotentialOverlayDashboardFiltersSection(); return clickElement(ADD_PROPERTY_BUTTON);}
    public boolean clickAddPropertyCherryHill() {return clickElement(ADD_PROPERTY_CHERRY_HILL);}
    // Property Search Text Bar Methods
    public boolean clickAndSendKeysToPropertyListSearchTextBarCherryHill() {return sendKeysToElement(ADD_PROPERTIES_FROM_PROPERTY_LIST_TEXT_BAR, "Cherry Hill Apartments");}
    // Filter Properties Button Method
    public boolean clickFilterResultsButton() {waitForPotentialOverlayDashboardFiltersSection(); return clickElement(FILTER_RESULTS_BUTTON);}
    //Overlay Method
    private void waitForPotentialOverlayDashboardFiltersSection() { waitForOverlay(LOADING_OVERLAY);}
}
