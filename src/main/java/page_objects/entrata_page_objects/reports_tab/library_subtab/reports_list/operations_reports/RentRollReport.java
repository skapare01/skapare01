package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class RentRollReport extends ReportsBasePage {

    //Variables
    private final By RENT_ROLL_REPORT_LINK_LOCATOR = By.cssSelector("li[data-report-title ='Rent Roll'] a");

    //Constructor
    public RentRollReport (WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean clickRentRollReportLink() {
        return clickElement(RENT_ROLL_REPORT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }
}
