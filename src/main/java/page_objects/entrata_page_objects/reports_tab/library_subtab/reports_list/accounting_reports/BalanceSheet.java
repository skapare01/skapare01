package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BalanceSheet extends BasePage {

    private final By BALANCE_SHEET_LINK = By.cssSelector("li[data-report-name='balance_sheet'] a");

    public BalanceSheet(WebDriver driver) {
        super(driver);
    }
    public boolean balanceSheetLinkClick() {
        return clickElement(BALANCE_SHEET_LINK);
    }
}
