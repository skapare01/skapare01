package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_team_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProgressReportPage extends BasePage {
    public ProgressReportPage(WebDriver driver){
        super(driver);
    }

    private final By MY_CPA = By.linkText("My CPA");
    private final By MY_LEARNING_GOALS = By.linkText("My Learning Goals");
    private final By SEARCH_BAR = By.id("div_search_employee_input");
    private final By DEV_TEAM_TAB = By.id("devqa_team");
    private final By TEAM_DROPDOWN = By.id("teamsDropdown");
    private final By MY_TEAM_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public boolean confirmVisibilityOfMyCPA(){return confirmElementIsVisible(MY_CPA);}
    public boolean confirmVisibilityOfMyLearningGoals(){return confirmElementIsVisible(MY_LEARNING_GOALS);}
    public boolean confirmVisibilityOfSearchBar(){return confirmElementIsVisible(SEARCH_BAR);}
    public boolean clickDevTeamTab(){return clickElement(DEV_TEAM_TAB);}
    public boolean clickTeamDropdown(){
        myTeamOverlay();
        return clickElement(TEAM_DROPDOWN);}
    private void myTeamOverlay() {
        waitForOverlay(MY_TEAM_OVERLAY);
    }

}
