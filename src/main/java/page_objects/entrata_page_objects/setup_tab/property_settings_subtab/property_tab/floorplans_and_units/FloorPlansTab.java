package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlansTab extends BasePage {
    public FloorPlansTab(WebDriver driver) {
        super(driver);}

    private final By VIEW_LEASE_TERM_PRICING = By.linkText("View Lease Term Pricing");
    private final By LEASE_TERM_DROPDOWN = By.id("lease_term_id");
    private final By CLOSE_LEASE_TERM_PRICING = By.cssSelector("button[title = 'Close']");


    public boolean clickViewLeaseTermPricing(){return clickElement(VIEW_LEASE_TERM_PRICING);}
    public boolean verifyLeaseTermPricingWindow(){return confirmElementIsVisible(LEASE_TERM_DROPDOWN);}
    public boolean clickCloseLeaseTermPricing(){return clickElement(CLOSE_LEASE_TERM_PRICING);}
}
