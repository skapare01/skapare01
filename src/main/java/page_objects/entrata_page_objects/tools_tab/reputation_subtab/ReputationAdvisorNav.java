package page_objects.entrata_page_objects.tools_tab.reputation_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReputationAdvisorNav extends BasePage {

    //Constructor
    public ReputationAdvisorNav(WebDriver driver) {
        super(driver);
    }

    //Reputation Advisor Tab Navigation
    private final By REVIEWS_TAB_LOCATOR = By.id("reviews_systemxxx");
    private final By POSTING_TOOL_TAB_LOCATOR = By.id("reputation_posting_toolxxx");
    private final By GOOGLE_QA_TAB_LOCATOR = By.id("google_qaxxx");

    //Reputation Advisor Navigation Methods
    public boolean confirmVisibilityOfReviewsTab() {
        return confirmElementIsVisible(REVIEWS_TAB_LOCATOR);
    }

    public boolean selectReviewsTab() {
        return clickElement(REVIEWS_TAB_LOCATOR);
    }

    public boolean selectPostingToolTab() {
        return clickElement(POSTING_TOOL_TAB_LOCATOR);
    }

    public boolean selectGoogleQATab() {
        return clickElement(GOOGLE_QA_TAB_LOCATOR);
    }

}
