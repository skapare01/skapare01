package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyProblemTab extends BasePage {

    private final By PROBLEM_TAB = By.cssSelector("li[id='maintenance_request_problem_tab']");

    private final By PROBLEM_DETAILS_OVERVIEW = By.cssSelector("li[id='maintenance_request_problem_tab']");

    public MakeReadyProblemTab(WebDriver driver) {
        super(driver);
    }

    public boolean confirmProblemTabExists() { return confirmElementIsVisible(PROBLEM_TAB); }

    public boolean clickProblemTab() { return clickElement(PROBLEM_TAB); }

    public boolean confirmProblemDetailsExists() { return confirmElementIsVisible(PROBLEM_DETAILS_OVERVIEW); }

}
