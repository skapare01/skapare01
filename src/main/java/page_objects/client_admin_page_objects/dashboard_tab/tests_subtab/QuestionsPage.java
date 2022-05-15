package page_objects.client_admin_page_objects.dashboard_tab.tests_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;


public class QuestionsPage extends BasePage {
    public QuestionsPage(WebDriver driver){
        super(driver);}
    RandomGenerator randomGenerator = new RandomGenerator();

    private final By ADD_QUESTION = By.linkText("Add Question");
    private final By PREVIEW_BUTTON = By.cssSelector(".preview");


    //Add Question popup
    private final By QUESTION_TYPE_DROPDOWN = By.id("test_question_type");
    private final String  MULTIPLE_CHOICE_TYPE_OPTION = "2";
    private final By GROUP_DROPDOWN = By.cssSelector("select[name = 'test_question[test_question_group_id]']");
    private final String GENERAL_GROUP_OPTION = "24";
    private final By LEVEL_DROPDOWN = By.cssSelector("select[name = 'test_question[test_level_type_id]']");
    private final String BEGINNER_LEVEL_OPTION = "1";
    private final By ENTER_QUESTION_FIELD = By.id("test_question");
    private final By MAXIMUM_POINTS_FIELD = By.cssSelector("input[name = 'test_question[maximum_points]']");
    private final By ANSWER_OPTION_ONE = By.cssSelector("input[name = 'test_answer_option[1][answer_option]']");
    private final By ANSWER_OPTION_TWO = By.cssSelector("input[name = 'test_answer_option[2][answer_option]']");
    private final By ANSWER_OPTION_THREE = By.cssSelector("input[name = 'test_answer_option[3][answer_option]']");
    private final By ANSWER_OPTION_FOUR = By.cssSelector("input[name = 'test_answer_option[4][answer_option]']");
    private final By CORRECT_ANSWER_BUTTON_TWO = By.cssSelector("input[value = '2']");
    private final By CANCEL_BUTTON = By.linkText("Cancel");

    // Preview Question popup
    private final By TEST_QUESTION_DIV = By.cssSelector(".test-note");


    public boolean clickAddQuestion(){return clickElement(ADD_QUESTION);}
    public boolean selectMultipleChoice(){return selectElementByValue(QUESTION_TYPE_DROPDOWN,MULTIPLE_CHOICE_TYPE_OPTION);}
    public boolean selectGeneralGroup(){return selectElementByValue(GROUP_DROPDOWN,GENERAL_GROUP_OPTION);}
    public boolean selectBeginnerLevel(){return selectElementByValue(LEVEL_DROPDOWN,BEGINNER_LEVEL_OPTION);}
    public boolean enterQuestion(){return sendKeysToElement(ENTER_QUESTION_FIELD,randomGenerator.randomName());}
    public boolean enterMaximumPoints(){return sendKeysToElement(MAXIMUM_POINTS_FIELD,"3");}
    public boolean enterAnswerOne(){return sendKeysToElement(ANSWER_OPTION_ONE,randomGenerator.randomName());}
    public boolean enterAnswerTwo(){return sendKeysToElement(ANSWER_OPTION_TWO,randomGenerator.randomName());}
    public boolean enterAnswerThree(){return sendKeysToElement(ANSWER_OPTION_THREE,randomGenerator.randomName());}
    public boolean enterAnswerFour(){return sendKeysToElement(ANSWER_OPTION_FOUR,randomGenerator.randomName());}
    public boolean clickCancelButton(){return clickElement(CANCEL_BUTTON);}
    public boolean clickCorrectAnswerTwo(){return clickElement(CORRECT_ANSWER_BUTTON_TWO);}
    public boolean clickPreviewIcon(){return clickElement(PREVIEW_BUTTON);}
    public boolean confirmVisibilityOfTestQuestion(){return confirmElementIsVisible(TEST_QUESTION_DIV);}

}
