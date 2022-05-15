package page_objects.entrata_page_objects.accounting_tab.closings_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClosingsPage extends BasePage {

    public ClosingsPage(WebDriver driver) {
        super(driver);
    }

    private final By CLOSINGS_PAGE = By.id("view_period_closing_div_listing");

    public boolean closingsPageVisible() {
        return confirmElementIsVisible(CLOSINGS_PAGE);
    }
}
