package page_objects.entrata_page_objects.dashboard_tab.pricing_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PricingDashboard extends BasePage {

    private final By PRICING_FILTERS = By.id("open-filter-by-default");
    private final By CLEAR_ALL_PROPERTIES = By.id("js-clear-all-properties");
    private final By ADD_PROPERTIES = By.id("addbutton");
    private final By ADD_PROPERTY_NAME = By.xpath("//li//span[text()='Second Property']");
    private final By UNIT_STATUS = By.id("addbutton");
    private final By UNIT_STATUS_ALL_AVAILABLE = By.xpath("//select//option[text()='All Available']");
    private final By PUBLISH_STATUS = By.id("property_filter");
    private final By PUBLISH_STATUS_ALL = By.xpath("//select//option[text()='Published & Unpublished']");
    private final By SAVE_FILTERS_BUTTON = By.cssSelector("a.button.small.green.generate-report.margin5-right span");
    private final By PRICING_PROPERTY_NAME = By.xpath("//h4//span[text()='Second Property']");

    public PricingDashboard(WebDriver driver) { super(driver); }

    public boolean clickFilters() { return clickElement(PRICING_FILTERS); }

    public boolean clickClearProperties() { return clickElement(CLEAR_ALL_PROPERTIES); }

    public boolean clickAddProperties() { return clickElement(ADD_PROPERTIES); }

    public boolean clickAddPropertyName() { return clickElement(ADD_PROPERTY_NAME); }

    public boolean clickUnitStatusDropdown() { return clickElement(UNIT_STATUS); }

    public boolean clickUnitStatusAllAvailable() { return clickElement(UNIT_STATUS_ALL_AVAILABLE); }

    public boolean clickPublishStatusDropdown() { return clickElement(PUBLISH_STATUS); }

    public boolean clickPublishStatusAll() { return clickElement(PUBLISH_STATUS_ALL); }

    public boolean clickSaveFiltersButton() { return clickElement(SAVE_FILTERS_BUTTON); }

    public boolean findPricingDashboardPropertyName() { return confirmElementIsVisible(PRICING_PROPERTY_NAME); }



}
