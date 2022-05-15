package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadySubtasksTab extends BasePage {

    private final By SUBTASKS_IS_SELECTED = By.cssSelector("li[id='maintenance_request_sub_tasks_tab'][class='selected']");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close");
    private final By PROPERTY_NAME_UNIT_INFORMATION = By.xpath("//*[@id=\"js-wo-info\"]/dl[1]/dd");
    private final By SUBTASKS_TAB = By.id("maintenance_request_sub_tasks_tab");
    private final By SUBTASKS_OVERVIEW = By.id("tab-4b");

    public MakeReadySubtasksTab(WebDriver driver) {
        super(driver);
    }

    public boolean verifySubtasksTabIsSelected() { return confirmElementIsVisible(SUBTASKS_IS_SELECTED); }

    public boolean clickCloseButton() { return clickElement(CLOSE_BUTTON); }

    public String confirmLoftsOfLorienIsTheSelectedPropertyForMakeReady() { return getElementText(PROPERTY_NAME_UNIT_INFORMATION); }

    public boolean confirmSubtasksTabExists() { return confirmElementIsVisible(SUBTASKS_TAB); }

    public boolean clickSubtasksTab() { return clickElement(SUBTASKS_TAB); }

    public boolean confirmSubtasksOverviewExists() { return confirmElementIsVisible(SUBTASKS_OVERVIEW); }

}
