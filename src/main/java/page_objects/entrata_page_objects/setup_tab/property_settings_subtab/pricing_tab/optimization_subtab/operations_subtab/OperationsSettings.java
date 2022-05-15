package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.operations_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OperationsSettings extends BasePage {

    private final By EDIT_REASON_CODES = By.id("rent-override-reason-button");
    private final By EDIT_PUBLISHING_CONSTRAINTS = By.id("publishing-constraints-button");
    private final By EDIT_OPTIMIZATION = By.id("rent-update-days-button");
    private final By OPTIMIZATION_NAVIGATION_OVERLAY = By.className("loading-overlay");

    public OperationsSettings(WebDriver driver) {
        super(driver);
    }

    private void optimizationSettingsOverlay() {
        waitForOverlay(OPTIMIZATION_NAVIGATION_OVERLAY);
    }

    public boolean findEditReasonCodes() {
        optimizationSettingsOverlay();
        return confirmElementIsVisible(EDIT_REASON_CODES);
    }

    public boolean findEditPublishingConstraints() {
        return confirmElementIsVisible(EDIT_PUBLISHING_CONSTRAINTS);
    }

    public boolean findEditOptimization() {
        return confirmElementIsVisible(EDIT_OPTIMIZATION);
    }

}
