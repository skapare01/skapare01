package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.influencers_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InfluencersSettings extends BasePage {

    private final By EDIT_RENT_CONSTRAINTS_BUTTON = By.id("rate-constraints-button");
    private final By EDIT_EXPIRATION_BUTTON = By.id("rent-matrix-factors-button");
    private final By EDIT_SUSTAINABLE_OCCUPANCY_BUTTON = By.id("sustainable-capacity-limits-button");
    private final By EDIT_ANCHOR_RENT_BUTTON = By.id("base-rent-parameters-button");
    private final By EDIT_ANALYTICS_BUTTON = By.id("forecast-basis-button");
    private final By OPTIMIZATION_NAVIGATION_OVERLAY = By.className("loading-overlay");

    public InfluencersSettings(WebDriver driver) {
        super(driver);
    }

    private void optimizationSettingsOverlay() {
        waitForOverlay(OPTIMIZATION_NAVIGATION_OVERLAY);
    }

    public boolean findEditRentConstraints() {
        optimizationSettingsOverlay();
        return confirmElementIsVisible(EDIT_RENT_CONSTRAINTS_BUTTON);
    }

    public boolean findEditExpirationButton() {
        return confirmElementIsVisible(EDIT_EXPIRATION_BUTTON);
    }

    public boolean findEditSustainableOccupancyButton() { return confirmElementIsVisible(EDIT_SUSTAINABLE_OCCUPANCY_BUTTON); }

    public boolean findEditAnchorRentButton() {
        return confirmElementIsVisible(EDIT_ANCHOR_RENT_BUTTON);
    }

    public boolean findEditAnalyticsButton() {
        return confirmElementIsVisible(EDIT_ANALYTICS_BUTTON);
    }


}
