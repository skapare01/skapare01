package page_objects.entrata_page_objects.residents_tab.charges_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostLateFees extends BasePage {

    public PostLateFees(WebDriver driver) {
        super(driver);
    }

    private final By POST_LATE_FEES_PAGE = By.id("post_late_fees");

    public boolean postLateFeesPageVisible() {
        return confirmElementIsVisible(POST_LATE_FEES_PAGE);
    }
}
