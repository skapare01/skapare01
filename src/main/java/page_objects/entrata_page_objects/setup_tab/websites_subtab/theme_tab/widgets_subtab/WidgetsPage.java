package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.widgets_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WidgetsPage extends BasePage {

    public WidgetsPage(WebDriver driver) {
        super(driver);
    }

    private final By WIDGETS_PAGE = By.id("widget-main-section");

    public boolean widgetsPageVisible() {
        return confirmElementIsVisible(WIDGETS_PAGE);
    }
}
