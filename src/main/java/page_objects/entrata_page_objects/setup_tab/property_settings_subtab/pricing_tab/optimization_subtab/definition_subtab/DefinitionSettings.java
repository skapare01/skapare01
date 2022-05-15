package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.definition_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DefinitionSettings extends BasePage {

    private final By EDIT_PRICING = By.id("enable-pricing-button");
    private final By OPTIMIZATION_NAVIGATION_OVERLAY = By.className("loading-overlay");

    public DefinitionSettings(WebDriver driver) {
        super(driver);
    }

    private void optimizationSettingsOverlay() {
        waitForOverlay(OPTIMIZATION_NAVIGATION_OVERLAY);
    }

    public boolean findEditPricing() {
        optimizationSettingsOverlay();
        return confirmElementIsVisible(EDIT_PRICING);
    }

}
