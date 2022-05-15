package page_objects.entrata_page_objects.accounting_tab.budgets_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BudgetsPage extends BasePage {

    public BudgetsPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_BUDGET_BUTTON = By.cssSelector("a[onclick*='loadCreateBudget()']");
    private final By ADD_BUDGET_FORM = By.id("budget_div");
    private final By FIRST_LISTED_BUDGET = By.cssSelector("tr[class='bRow js_view_budget']");
    private final By WORKING_TAB = By.xpath("//*[@id=\"budget_status_type_2\"]/a");
    private final By CURRENT_TAB = By.xpath("//*[@id=\"budget_status_type_1\"]/a");
    private final By ARCHIVED_TAB = By.xpath("//*[@id=\"budget_status_type_4\"]/a");
    private final By BUDGET_OVERVIEW = By.id("budget_div_id");
    private final By OVERLAY = By.cssSelector("div[class='loading-overlay']");


    public boolean addBudgetButtonClick() {
        return clickElement(ADD_BUDGET_BUTTON);
    }

    public boolean firstListedBudgetClick() {
        waitForOverlay(OVERLAY);
        return clickElement(FIRST_LISTED_BUDGET);
    }

    public boolean workingTabClick() {
        return clickElement(WORKING_TAB);
    }

    public boolean currentTabClick() {
        return clickElement(CURRENT_TAB);
    }

    public boolean archivedTabClick() {
        return clickElement(ARCHIVED_TAB);
    }

    //Visibility

    public boolean addBudgetFormVisible() {
        return confirmElementIsVisible(ADD_BUDGET_FORM);
    }

    public boolean budgetOverviewVisible() {
        return confirmElementIsVisible(BUDGET_OVERVIEW, waitTimes.LONG_WAIT);
    }
}
