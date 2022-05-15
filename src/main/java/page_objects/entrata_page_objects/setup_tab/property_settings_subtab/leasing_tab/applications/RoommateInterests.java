package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RoommateInterests extends BasePage {

    public RoommateInterests(WebDriver driver) {
        super(driver);}

    private final By ADD_QUESTION = By.linkText("Add Question");
    private final By ROOMMATE_INTEREST_QUESTION_DROPDOWN = By.id("preference_question_id");
    private final By CLOSE_BUTTON = By.cssSelector("button[title = 'Close']");

    public boolean clickAddQuestion(){return clickElement(ADD_QUESTION);}
    public boolean verifyVisibilityOfInterestQuestionDropdown(){return confirmElementIsVisible(ROOMMATE_INTEREST_QUESTION_DROPDOWN);}
    public boolean clickCloseButton(){return clickElement(CLOSE_BUTTON);}


}
