package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CommunityAccessPage extends BasePage {

    public CommunityAccessPage(WebDriver driver) {
        super(driver);
    }

    private final By COMMUNITY_ACCESS_PAGE = By.id("view_access_provider");

    public boolean communityAccessPageVisible() {
        return confirmElementIsVisible(COMMUNITY_ACCESS_PAGE);
    }
}
