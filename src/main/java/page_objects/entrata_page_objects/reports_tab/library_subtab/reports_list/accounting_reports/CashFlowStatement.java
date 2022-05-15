package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CashFlowStatement extends BasePage {

    private final By CASH_FLOW_STATEMENT_LINK = By.cssSelector("li[data-report-title='Cash Flow Statement'] a");

    public CashFlowStatement(WebDriver driver) {
        super(driver);
    }
    public boolean cashFlowStatementClick() {
        return clickElement(CASH_FLOW_STATEMENT_LINK);
    }
}
