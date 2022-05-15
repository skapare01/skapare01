package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class ResidentAgedReceivablesReport extends ReportsBasePage {
    private final By RESIDENT_AGED_RECEIVABLES_REPORT_NAME_TEXT_LOCATOR = By.xpath("//*[text()='Resident Aged Receivables']");
    private final By UNALLOCATED_CHARGES_AND_CREDITS_COLUMN_TOTAL_LOCATOR = By.cssSelector("tr.section-row > td:nth-of-type(8)");
    private final By PREPAYMENTS_COLUMN_TOTAL_LOCATOR = By.cssSelector("tr.section-row > td:nth-of-type(13)");

    public ResidentAgedReceivablesReport (WebDriver driver) { super(driver); }

    public boolean confirmResidentAgedReceivablesReportNameText() {
        return confirmElementIsVisible(RESIDENT_AGED_RECEIVABLES_REPORT_NAME_TEXT_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public String getUnallocatedChargesAndCreditsTotalFromResidentAgedReceivablesReport() {
        return getElementText(UNALLOCATED_CHARGES_AND_CREDITS_COLUMN_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getPrePaymentsTotalFromResidentAgedReceivablesReport() {
        return getElementText(PREPAYMENTS_COLUMN_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

}