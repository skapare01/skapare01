package page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;
import wait_times.WaitTimes;


public class ViewContentPage extends BasePage {

    private final By HTML_EDITOR = By.id("html_content");
    private final By PREVIEW_HTML_BUTTON = By.cssSelector("input[value = 'Preview HTML']");
    private final By PREVIEW_HTML_TEXTBOX = By.id("perview_html_contents");
    private final By VIEW_CONTENT_SAVE_BUTTON = By.cssSelector("input[value = 'Save']");
    private final By OTHER_ACTIONS_DROPDOWN = By.cssSelector(".otheractionswidth104");
    private final By DOWNLOAD_PDF_BUTTON = By.cssSelector("li[class = 'download-article-pdf binded']");
    private final By PUBLISH_BUTTON = By.id("publish_status_li_icon_text");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By OVERLAY = By.cssSelector(".loading-overlay");

    // add training course view contents screen only
    private final By ADD_CONTENT_BUTTON = By.xpath("//*[@id=\"load-course-container\"]/a[1]/span");
    private final By QUIZ_TAB = By.id("help_quiz_tab");
    private final By CREATE_NEW_QUESTION = By.xpath("//*[@id=\"load-course-container\"]/a[1]");

    // ADD QUESTION POPUP
    private final By QUESTION_FIELD = By.cssSelector("textarea[name = 'help_quiz_question[question]']");
    private final By ANSWER_ONE = By.cssSelector("input[name = 'help_quiz_answers[0]']");
    private final By ANSWER_TWO = By.cssSelector("input[name = 'help_quiz_answers[1]']");
    private final By FIRST_CORRECT_ANSWER_BUTTON = By.xpath("//*[@id=\"answer_panel\"]/tbody/tr[2]/td[1]/input");
    private final By SAVE_ADD_QUESTION_BUTTON = By.id("add_help_quiz_question");

    public ViewContentPage(WebDriver driver){
        super(driver);
    }



    public boolean enterHTML(String text){return sendKeysToElement(HTML_EDITOR,"<p>" + text + "<p>");}
    public boolean clickPreviewHTML(){return clickElement(PREVIEW_HTML_BUTTON);}
    public String getPreviewHtmlText(){return getElementText(PREVIEW_HTML_TEXTBOX);}
    public boolean clickSaveViewContentButton(){return clickElement(VIEW_CONTENT_SAVE_BUTTON);}
    public boolean clickOtherActions(){ return clickElement(OTHER_ACTIONS_DROPDOWN);}
    public boolean clickDownloadPDFBUTTON(){return clickElement(DOWNLOAD_PDF_BUTTON);}
    public boolean clickPublishButton(){return clickElement(PUBLISH_BUTTON);}
    public boolean confirmSuccessMessageVisible(){waitForOverlay(OVERLAY); return confirmElementIsVisible(SUCCESS_MESSAGE);}
    public boolean waitForSuccessMessageToDisappear(){return confirmElementIsInvisible(SUCCESS_MESSAGE,waitTimes.LONG_WAIT);}

    // Training Course View Content Only
    public boolean clickAddContentButton(){return clickElement(ADD_CONTENT_BUTTON);}
    public boolean clickQuizTab(){waitForOverlay(OVERLAY); return clickElement(QUIZ_TAB);}
    public boolean clickCreateQuizQuestion(){waitForOverlay(OVERLAY); return clickElement(CREATE_NEW_QUESTION);}

    // Add Question Popup for Training Course Quiz tab
    public boolean enterQuestion(String question){return sendKeysToElement(QUESTION_FIELD,question, waitTimes.LONG_WAIT);}
    public boolean enterAnswerOne(String answer){return sendKeysToElement(ANSWER_ONE,answer);}
    public boolean enterAnswerTwo(String answer){return sendKeysToElement(ANSWER_TWO,answer);}
    public boolean clickSaveAddQuestionButton(){return clickElement(SAVE_ADD_QUESTION_BUTTON);}
    public boolean clickCorrectAnswerOne(){return clickElement(FIRST_CORRECT_ANSWER_BUTTON);}





}
