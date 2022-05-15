package page_objects.client_admin_page_objects.trainings_tab.content_audit_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContentAuditDashboardPage extends BasePage {

    // content audit dashboard tabs
    private final By VIDEOS_TAB = By.cssSelector("li[data-audit_tabs ='videos']");
    private final By VIDEOS_REVIEW_TAB = By.cssSelector("li[data-audit_tabs ='videos_to_review']");
    private final By LANGUAGE_TAB = By.cssSelector("li[data-audit_tabs ='language']");
    private final By COURSES_TAB = By.cssSelector("li[data-audit_tabs ='courses']");
    private final By SUMMARY_TAB = By.cssSelector("li[data-audit_tabs ='summary']");
    private final By ARTICLES_TAB = By.cssSelector("li[data-audit_tabs ='articles']");

    //content audit dashboard filters
    private final By SEARCH_BAR = By.cssSelector("input[placeholder = 'Search...']");

    //content audit dashboard settings navigation
    private final By SETTINGS_BUTTON = By.id("settings-curtain-btn");

    public ContentAuditDashboardPage(WebDriver driver){
        super(driver);}

    // content audit dashboard tabs
    public boolean clickVideosTab(){return clickElement(VIDEOS_TAB);}
    public boolean clickVideosReviewTab(){return clickElement(VIDEOS_REVIEW_TAB);}
    public boolean clickLanguageTab(){return clickElement(LANGUAGE_TAB);}
    public boolean clickCoursesTab(){return clickElement(COURSES_TAB);}
    public boolean clickSummaryTab(){return clickElement(SUMMARY_TAB);}
    public boolean clickArticlesTab(){return clickElement(ARTICLES_TAB);}

    //content audit dashboard filters
    public boolean clickSearchBar(){return clickElement(SEARCH_BAR);}

    //content audit dashboard settings navigation
    public boolean clickSettingsButton(){return clickElement(SETTINGS_BUTTON);}
}
