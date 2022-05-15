package page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class AddNewContentPopup extends BasePage {
    public AddNewContentPopup(WebDriver driver){
        super(driver);}
    RandomGenerator randomGenerator = new RandomGenerator();
    // Content Type Dropdown
    private final By CONTENT_TYPE_DROPDOWN = By.id("help_resource_type_id");
    private final By VIDEO_OPTION_CONTENT_TYPE_DROPDOWN_SELECTION = By.cssSelector("option[value='4']");
    private final By ARTICLE_CONTENT_TYPE_DROPDOWN_SELECTION = By.cssSelector("option[value='5']");

    // Title field
    private final By NEW_CONTENT_TITLE = By.id("help_resource_name");

    //Description Field
    private final By NEW_CONTENT_DESCRIPTION = By.id("help_resource_description_field");

    // Video URL Field
    private final By NEW_CONTENT_VIDEO_URL = By.id("youtube_video_url");


    //Visible To Dropdown
    private final By VISIBLE_TO_DROPDOWN = By.cssSelector("select[name = 'help_resource[is_visible_to]']");
    private final String EVERYONE_VISIBLE_TO_VALUE = "1";

    // Relevant Locations
    private final By RELEVANT_LOCATIONS_FIRST_CHECKBOX = By.xpath("//*[@id=\"relevant_locations\"]/span[1]/input");
    // Relevant Keywords Field
    private final By RELEVANT_KEYWORDS_TEXT_FIELD = By.cssSelector("input[class='form-field wide6']");

    //Relevant Products
    private final By ADVANCED_BUDGETING_RELEVANT_PRODUCT = By.cssSelector("input[value='28841']");

    //New Content Save Button
    private final By NEW_CONTENT_SAVE_BUTTON = By.cssSelector("input[class='form-submit js-insert_update_resource']");

   // Content Type Dropdown Methods
    public boolean clickContentTypeDropdown() {
        return clickElement(CONTENT_TYPE_DROPDOWN);
    }

    public boolean clickVideoOptionContentTypeDropdownSelection() { return clickElement(VIDEO_OPTION_CONTENT_TYPE_DROPDOWN_SELECTION); }

    public boolean clickFocusedCourseContentTypeDropdownSelection(){return clickElement(ARTICLE_CONTENT_TYPE_DROPDOWN_SELECTION);}

    //Title Methods
    public boolean enterRandomTitle(){return sendKeysToElement(NEW_CONTENT_TITLE,randomGenerator.randomName());}

    // Description Methods
    public boolean enterNewContentDescription() {
        return sendKeysToElement(NEW_CONTENT_DESCRIPTION, "Automation Test Description");}

    public boolean enterRandomDescription(){return sendKeysToElement(NEW_CONTENT_DESCRIPTION,randomGenerator.randomName());}

    // Visible To Dropdown
    public boolean selectAdminsVisibleToValue(){return selectElementByValue(VISIBLE_TO_DROPDOWN,EVERYONE_VISIBLE_TO_VALUE);}


    //Video URL Field Methods
    public boolean enterNewContentVideoURL() {
        return sendKeysToElement(NEW_CONTENT_VIDEO_URL, "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }

    // Relevant Locations
    public boolean clickRelevantLocationsFirstCheckBox(){return clickElement(RELEVANT_LOCATIONS_FIRST_CHECKBOX);}

    // Relevant Keywords Methods
    public boolean enterRelevantKeywords() { return sendKeysToElement(RELEVANT_KEYWORDS_TEXT_FIELD, "Automation Test"); }

    // Relevant Topics
    public boolean clickAdvancedBudgeting(){return clickElement(ADVANCED_BUDGETING_RELEVANT_PRODUCT);}

    //Save Button for Add New Content Method

    public boolean clickNewContentSaveButton() {
        return clickElement(NEW_CONTENT_SAVE_BUTTON);
    }
}
