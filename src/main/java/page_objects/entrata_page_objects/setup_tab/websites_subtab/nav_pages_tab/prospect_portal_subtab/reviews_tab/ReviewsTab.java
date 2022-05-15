package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.reviews_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReviewsTab extends BasePage {
    public ReviewsTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_RATINGS_AND_REVIEWS_HEADER = By.xpath("//h3[text()='Ratings & Reviews']");
    private final By PP_REVIEWS_EDIT_BTN = By.id("reviews-content-button");
    private final By PP_REVIEWS_RENAME_RATINGS_AND_REVIEWS = By.xpath("//*[text()='Rename Ratings & Reviews:']");
    private final By PP_REVIEWS_RENAME_RATINGS_AND_REVIEWS_TOOL_TIPS = By.id("RENAME_RATINGS_AND_REVIEWS_TAB_WEBSITE_PREFERENCES_HELP");

    public boolean ppRatingsAndReviewsHeader() {
        return confirmElementIsVisible(PP_RATINGS_AND_REVIEWS_HEADER);
    }
    public boolean ppReviewsEditBtn() {
        return confirmElementIsVisible(PP_REVIEWS_EDIT_BTN);
    }
    public boolean ppReviewsRenameRatingsAndReviews() {
        return confirmElementIsVisible(PP_REVIEWS_RENAME_RATINGS_AND_REVIEWS);
    }
    public boolean ppReviewsRenameRatingsAndReviewsToolTips() {
        return clickElement(PP_REVIEWS_RENAME_RATINGS_AND_REVIEWS_TOOL_TIPS);
    }
}
