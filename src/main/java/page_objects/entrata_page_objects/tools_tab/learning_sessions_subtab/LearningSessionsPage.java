package page_objects.entrata_page_objects.tools_tab.learning_sessions_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LearningSessionsPage extends BasePage{
    public LearningSessionsPage(WebDriver driver){
        super(driver);}

    private final By CREATE_SESSION = By.id("create-db-btn");

    // Create Session Page
    private final By TRAINING_NAME_FIELD = By.cssSelector("input[name = 'training_databases[name]']");
    private final By USER_LIST = By.id("selected-company-user_list");

    public boolean clickCreateSession(){return clickElement(CREATE_SESSION);}
    public boolean findTrainingNameField(){return confirmElementIsVisible(TRAINING_NAME_FIELD);}
    public boolean findUserList(){return confirmElementIsVisible(USER_LIST);}



}
