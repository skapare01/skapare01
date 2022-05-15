package page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class KnowledgeBasePage extends BasePage {

    private final By ADD_NEW_CONTENT_BUTTON = By.cssSelector("a[class='action button js-add-resource']");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By PUBLISH_CONTENT_BUTTON = By.id("publish_status_li_icon_text");
    private final By ADD_NEW_CONTENT_HEADER_TEXT = By.id("ui-id-1");
    private final By ADD_TRAINING_COURSE_BUTTON = By.cssSelector("a[data-is_help_resource_course = '1']");


    public KnowledgeBasePage(WebDriver driver) {
        super(driver);
    }

    public boolean clickAddNewContentButton() {
        return clickElement(ADD_NEW_CONTENT_BUTTON,waitTimes.LONG_WAIT);
    }

    public boolean verifyContentAddedSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    public boolean clickPublishContentButton() {
        return clickElement(PUBLISH_CONTENT_BUTTON);
    }

    public boolean verifyContentPublishedSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    public boolean addNewContentHeaderText() {
        return confirmElementIsVisible(ADD_NEW_CONTENT_HEADER_TEXT);
    }

    public boolean clickAddTrainingCourseButton(){return clickElement(ADD_TRAINING_COURSE_BUTTON,waitTimes.LONG_WAIT);}
}
