package page_objects.entrata_page_objects.residents_tab.charges_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostDepositsInterest extends BasePage {

    public PostDepositsInterest(WebDriver driver) {
        super(driver);
    }

    private final By POST_DEPOSITS_INTERESTS_PAGE = By.id("deposit_interests");

    public boolean postDepositsInterestsPageVisible() {
        return confirmElementIsVisible(POST_DEPOSITS_INTERESTS_PAGE);
    }
}
