package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyAssignmentTab extends BasePage {

    private final By ASSIGNMENT_TAB = By.id("maintenance_request_assignment_tab");
    private final By ASSIGNMENT_OVERVIEW = By.cssSelector("b[class='colorbox highlight-gray']");

    public MakeReadyAssignmentTab(WebDriver driver) {
        super(driver);
    }

    public boolean confirmAssignmentTabExists() { return confirmElementIsVisible(ASSIGNMENT_TAB); }

    public boolean clickAssignmentTab() { return clickElement(ASSIGNMENT_TAB); }

    public boolean confirmAssignmentOverviewExists() { return confirmElementIsVisible(ASSIGNMENT_OVERVIEW); }


}
