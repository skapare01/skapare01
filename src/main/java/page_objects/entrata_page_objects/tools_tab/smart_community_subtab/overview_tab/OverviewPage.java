package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.overview_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OverviewPage extends BasePage {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    private final By OVERVIEW_PAGE = By.id("js-view-overview");

    public boolean overviewPageVisible() {
        return confirmElementIsVisible(OVERVIEW_PAGE);
    }
}