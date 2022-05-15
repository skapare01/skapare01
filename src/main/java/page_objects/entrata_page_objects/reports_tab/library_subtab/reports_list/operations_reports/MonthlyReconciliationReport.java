package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class MonthlyReconciliationReport extends ReportsBasePage {
    private final By MONTHLY_RECONCILIATION_REPORT_LINK_LOCATOR = By.cssSelector("li[data-report-title ='Monthly Reconciliation'] a");
    private final By DIFFERENTIAL_REBUILD_TOGGLE_FILTER = By.cssSelector("div#differential_rebuild > b:nth-of-type(1)");
    private final By POTENTIAL_RENT_LINK_LOCATOR = By.cssSelector("td[title='Drill down for Gross Potential Rent (GPR)'] a");
    private final By ENDING_DELINQUENCY_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(2) > td.align-right.pointer > a");
    private final By ENDING_DELINQUENCY_WITHOUT_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(3) > td:nth-child(2)");
    private final By ENDING_PREPAYMENTS_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(3) > td.align-right.pointer > a");
    private final By ENDING_PREPAYMENTS_WITHOUT_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(3) > td:nth-child(3)");
    private final By ENDING_DELINQUENCY_AND_PREPAYMENTS_LINK_LOCATOR = By.cssSelector("td[title='Drill down for Resident Aged Receivables'] a");

    public MonthlyReconciliationReport (WebDriver driver) {
        super(driver);
    }

    public boolean clickingMonthlyReconciliationReportLink() {
        return clickElement(MONTHLY_RECONCILIATION_REPORT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickDifferentialRebuildToggleFilterInMonthlyReconciliationReportFilters() {
        return clickElement(DIFFERENTIAL_REBUILD_TOGGLE_FILTER);
    }

    public String getPotentialRentAmountFromMonthlyReconciliationReportLink() {
        return getElementText(POTENTIAL_RENT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickDrillDownLinkForGrossPotentialRentReport() {
        return doubleClickElement(POTENTIAL_RENT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getChangeInDelinquencyAmountFromMonthlyReconciliationReportLink() {
        if (confirmElementIsInvisible(ENDING_DELINQUENCY_LINK_LOCATOR, waitTimes.LONG_WAIT)) {
            return getElementText(ENDING_DELINQUENCY_WITHOUT_LINK_LOCATOR, waitTimes.LONG_WAIT);
        } else {
            return getElementText(ENDING_DELINQUENCY_LINK_LOCATOR);
        }
    }

    public boolean clickChangeInDelinquencyDrillDownLinkForResidentAgedReceivablesReport() {
        if (confirmElementIsInvisible(ENDING_DELINQUENCY_LINK_LOCATOR, waitTimes.LONG_WAIT)) {
            return doubleClickElement(ENDING_DELINQUENCY_AND_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT);
        } else {
            return doubleClickElement(ENDING_DELINQUENCY_LINK_LOCATOR, waitTimes.LONG_WAIT);
        }
    }

    public String getChangeInPrePaymentsAmountFromMonthlyReconciliationReportLink() {
        if (confirmElementIsInvisible(ENDING_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT)) {
            return getElementText(ENDING_PREPAYMENTS_WITHOUT_LINK_LOCATOR, waitTimes.LONG_WAIT);
        } else {
            return getElementText(ENDING_PREPAYMENTS_LINK_LOCATOR);
        }
    }

    public boolean clickChangeInPrePaymentsDrillDownLinkForResidentAgedReceivablesReport() {
        if (confirmElementIsInvisible(ENDING_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT)) {
            return doubleClickElement(ENDING_DELINQUENCY_AND_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT);
        } else {
            return doubleClickElement(ENDING_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT);
        }
    }
}