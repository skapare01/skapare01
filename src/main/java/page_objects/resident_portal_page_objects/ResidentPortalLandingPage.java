package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalLandingPage extends BasePage {
    private final By PROPERTY_NAME_LABEL = By.cssSelector("h1[class='false css-wl8c9v egojplo1'] span strong");
    private final By RESIDENT_PORTAL_LOADING_FEED_ITEMS_LANDING_SCREEN_FIRST_LOADER = By.cssSelector(".eqqkw7w1");
    private final By RESIDENT_PORTAL_LOADING_FEED_ITEMS_LANDING_SCREEN_SECOND_LOADER = By.cssSelector(".e2jvwuw0");

    public ResidentPortalLandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean confirmLoggedIntoProperty(){
        landingPageLoadingFeedItemsOverlay();
        secondOverlayOnLandingPage();
        return confirmElementIsVisible(PROPERTY_NAME_LABEL);
    }

    private void landingPageLoadingFeedItemsOverlay() {
        waitForOverlay(RESIDENT_PORTAL_LOADING_FEED_ITEMS_LANDING_SCREEN_FIRST_LOADER);
    }
    private void secondOverlayOnLandingPage() {
        waitForOverlay(RESIDENT_PORTAL_LOADING_FEED_ITEMS_LANDING_SCREEN_SECOND_LOADER);
    }
}
