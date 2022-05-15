package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ComparativeIncomeStatement extends BasePage {

    private final By COMPARATIVE_INCOME_STATEMENT = By.cssSelector("li[data-report-name='comparative_income_statement'] a");

    public ComparativeIncomeStatement(WebDriver driver) {
        super(driver);
    }
    public boolean comparativeIncomeStatementLinkClick() {
        return clickElement(COMPARATIVE_INCOME_STATEMENT);
    }
}
