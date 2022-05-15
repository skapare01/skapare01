package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OptimizationNav extends BasePage {

    private final By INFLUENCERS_TAB = By.id("property_details_pricing_price_influencersxxx");
    private final By OPERATIONS_TAB = By.id("property_details_pricing_operationsxxx");
    private final By DEFINITION_TAB = By.id("property_details_pricing_price_influencers_psxxx");

    public OptimizationNav(WebDriver driver) {
        super(driver);
    }

    public boolean clickInfluencersTab() {
        return clickElement(INFLUENCERS_TAB);
    }

    public boolean clickOperationsTab() {
        return clickElement(OPERATIONS_TAB);
    }

    public boolean clickDefinitionTab() {
        return clickElement(DEFINITION_TAB);
    }
}
