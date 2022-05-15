package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.automations_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AutomationsPage extends BasePage {

    private final By AUTOMATIONS_PAGE = By.id("js-view-smart-community-automations-tab");

    public AutomationsPage(WebDriver driver) {
        super(driver);
    }

    public boolean automationsPageVisible() {
        return confirmElementIsVisible(AUTOMATIONS_PAGE, waitTimes.LONG_WAIT);
    }
}
