package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NoticesSubtab extends BasePage {

    public NoticesSubtab(WebDriver driver) {
        super(driver);
    }

    private final By DELINQUENCY_PAGE = By.cssSelector("b[label='delinquencies_notices']");

    public boolean delinquencyPageVisible() {
        return confirmElementIsVisible(DELINQUENCY_PAGE);
    }
}
