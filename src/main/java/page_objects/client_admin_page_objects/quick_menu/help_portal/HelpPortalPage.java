package page_objects.client_admin_page_objects.quick_menu.help_portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HelpPortalPage extends BasePage {

    private final By USER_GUIDE = By.id("user_guides");
    private final By TRAINING_VIDEOS = By.cssSelector("h6[title= 'Training Videos']");
    private final By TRAINING_COURSES = By.cssSelector("h6[title= 'Training Courses']");
    private final By AP_PAYMENTS_TOPIC_LINK = By.cssSelector("li[data-search_string='AP Payments']");
    private final By APPROVING_INVOICES_FOR_PAYMENT_ARTICLE_LINK = By.cssSelector("li[data-help_resource_id='3544']");
    private final By ACCOUNTING_AP_USER_GUIDE_WATCH_VIDEO_BUTTON = By.cssSelector("a[data-help_resource_id='5277']");
    private final By APPROVING_INVOICES_VIDEO_CLOSE_BUTTON = By.cssSelector("i[class='close']");
    private final By ACCOUNTING_AP_TRAINING_COURSE_BUTTON = By.id("browse_training_courses");
    private final By ACCOUNTING_AP_TRAINING_COURSES_CLOSE_BUTTON = By.cssSelector("span[class='ui-button-text']");

    //User Guide Popup
    private final By FIRST_EXPANSION_ARROW = By.cssSelector(".guide");
    private final By CLOSE_WINDOW = By.cssSelector("button[title = 'Close']");
    private final By EXPANSION_ARROW = By.cssSelector(".accordion-arrow");
    private final By VIEW_BUTTON = By.cssSelector(".viewBtn");

    public HelpPortalPage(WebDriver driver){
        super(driver);}

    public boolean clickUserGuides(){switchToRecentlyOpenedTab(); return clickElement(USER_GUIDE);}
    public boolean clickTrainingVideos(){return clickElement(TRAINING_VIDEOS);}
    public boolean clickTrainingCourses(){return clickElement(TRAINING_COURSES);}
    public boolean clickAPPaymentsTopicLink() {return clickElement(AP_PAYMENTS_TOPIC_LINK);}
    public boolean clickApprovingInvoicesForPaymentArticleLink() {return clickElement(APPROVING_INVOICES_FOR_PAYMENT_ARTICLE_LINK);}
    public boolean clickAccountingAPUserGuideWatchVideoButton() {return clickElement(ACCOUNTING_AP_USER_GUIDE_WATCH_VIDEO_BUTTON);}
    public boolean clickApprovingInvoicesVideoCloseButton() {return clickElement(APPROVING_INVOICES_VIDEO_CLOSE_BUTTON);}
    public boolean clickAccountingAPTrainingCourseButton() {return clickElement(ACCOUNTING_AP_TRAINING_COURSE_BUTTON);}
    public boolean clickAccountingAPTrainingCoursesCloseButton() {return clickElement(ACCOUNTING_AP_TRAINING_COURSES_CLOSE_BUTTON);}


    //User Guide Popup methods
    public boolean clickFirstArrow(){return  clickElement(FIRST_EXPANSION_ARROW);}
    public boolean clickCloseWindow(){return clickElement(CLOSE_WINDOW);}
    public boolean confirmViewButtonVisible(){return confirmElementIsVisible(VIEW_BUTTON);}
    public boolean clickArrow(){return clickElement(EXPANSION_ARROW);}
}

