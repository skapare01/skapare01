package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyExpensesTab extends BasePage {

    private final By EXPENSES_TAB = By.id("maintenance_request_expenses_tab");
    private final By LABOR_OVERVIEW = By.id("labor");

    public MakeReadyExpensesTab(WebDriver driver) {
        super(driver);
    }

    public boolean confirmExpensesTabExists() { return confirmElementIsVisible(EXPENSES_TAB); }

    public boolean clickExpensesTab() { return clickElement(EXPENSES_TAB); }

    public boolean confirmLaborOverviewExists() { return confirmElementIsVisible(LABOR_OVERVIEW); }



}
