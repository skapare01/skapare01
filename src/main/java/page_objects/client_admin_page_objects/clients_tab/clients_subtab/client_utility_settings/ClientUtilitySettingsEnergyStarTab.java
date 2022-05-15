package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsEnergyStarTab extends BasePage {

    public ClientUtilitySettingsEnergyStarTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By IMPORT_TO_ENERGY_STAR_CONTAINER = By.id("sub_container");
    //Overlay Selector
    private final By OVERLAY_SELECTOR = By.cssSelector("[class='loading-overlay bg-img-medium']");
    //Methods
    public boolean confirmImportToEnergyStarContainerIsVisible() {waitForPotentialOverlayEnergyStarTab();
        return confirmElementIsVisible(IMPORT_TO_ENERGY_STAR_CONTAINER);
    }

    private void waitForPotentialOverlayEnergyStarTab(){ waitForOverlay(OVERLAY_SELECTOR);
    }
}