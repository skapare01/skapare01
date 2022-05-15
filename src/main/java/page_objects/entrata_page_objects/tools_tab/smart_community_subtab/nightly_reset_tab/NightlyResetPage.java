package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.nightly_reset_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NightlyResetPage extends BasePage {

    public NightlyResetPage(WebDriver driver) {
        super(driver);
    }

    private final By NIGHTLY_RESET_PAGE = By.id("js-view-nightly-reset-tab");

    public boolean nightlyResetPageVisible() {
        return confirmElementIsVisible(NIGHTLY_RESET_PAGE);
    }
}
