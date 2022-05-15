package page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class AddTrainingCoursePage extends BasePage {

    private final By TRAINING_COURSE_TITLE = By.cssSelector("input[name = 'help_resource[title]']");
    private final By TRAINING_COURSE_DESCRIPTION = By.cssSelector("textarea[name = 'help_resource[description]']");
    private final By RELEVANT_LOCATIONS = By.xpath("//*[@id=\"relevant_locations\"]/span[1]/input");
    private final By RELEVANT_KEYWORDS_FIELD = By.cssSelector("input[name = 'help_resource[keywords]']");
    private final By ADVANCED_BUDGETING_RELEVANT_PRODUCT = By.cssSelector("input[value='28841']");
    private final By SAVE_AND_NEXT_BUTTON = By.cssSelector("input[value = 'Save and Next']");

    public AddTrainingCoursePage(WebDriver driver){
        super(driver);}

    public boolean enterTrainingCourseTitle(String title){return sendKeysToElement(TRAINING_COURSE_TITLE,title);}

    public boolean enterTrainingCourseDescription(String description){return sendKeysToElement(TRAINING_COURSE_DESCRIPTION,description);}

    public boolean clickFirstCheckboxInRelevantLocations(){return clickElement(RELEVANT_LOCATIONS);}

    public boolean enterRelevantKeywords(String keyword){return sendKeysToElement(RELEVANT_KEYWORDS_FIELD,keyword);}

    public boolean clickAdvancedBudgetingRelevantProduct(){return clickElement(ADVANCED_BUDGETING_RELEVANT_PRODUCT);}

    public boolean clickSaveAndNextButton(){return clickElement(SAVE_AND_NEXT_BUTTON);}
}
