package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class GrossPotentialRentReport extends ReportsBasePage {
    private final By NON_EXCLUDED_UNITS_TEXT_LOCATOR = By.xpath("//*[text()='Non-Excluded Units']");
    private final By POTENTIAL_RENT_TOTAL_LOCATOR = By.cssSelector("tr.section-row > td:nth-of-type(4)");

    public GrossPotentialRentReport (WebDriver driver) { super(driver); }

    public boolean confirmNonExcludedUnitsText() {
        return confirmElementIsVisible(NON_EXCLUDED_UNITS_TEXT_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public String getPotentialRentTotalFromGrossPotentialRentReport() {
        return getElementText(POTENTIAL_RENT_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

}
