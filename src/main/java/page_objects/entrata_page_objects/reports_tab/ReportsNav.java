package page_objects.entrata_page_objects.reports_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportsNav extends ReportsBasePage {
    //Locators:
    private final By MY_REPORTS_LOADED_PAGE = By.xpath("//h3[contains(text(), 'My Reports')]");
    private final By REPORTS_LIBRARY = By.xpath("//h3[contains(text(), 'Library')]");
    private final By COMPANY_REPORTS = By.xpath("//h3[contains(text(), 'Company Reports')]");
    private final By HISTORY = By.xpath("//h3[contains(text(), 'Report History')]");
    private final By SCHEDULED_REPORTS = By.xpath("//h3[contains(text(), 'Scheduled Report Instances')]");
    private final By ARCHIVE = By.xpath("//li[contains(text(), 'Private Reports')]");
    private final By INBOX_LOADED_PAGE = By.xpath("//h3[contains(text(), 'Report Inbox')]");
    private final By PACKETS_LOADED_PAGE = By.xpath("//h3[contains(text(), 'Report Packets')]");

    //Constructor method:
    public ReportsNav(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean confirmMyReportsLoads (){
        return confirmElementIsVisible(MY_REPORTS_LOADED_PAGE, waitTimes.LONG_WAIT);
    }
    public boolean confirmReportsLibraryLoads () {
        return confirmElementIsVisible(REPORTS_LIBRARY);
    }
    public boolean confirmCompanyReportsLoads () {
        return confirmElementIsVisible(COMPANY_REPORTS);
    }
    public boolean confirmHistoryTabLoads () {
        return confirmElementIsVisible(HISTORY);
    }
    public boolean confirmScheduledReportsLoads () {
        return confirmElementIsVisible(SCHEDULED_REPORTS);
    }
    public  boolean confirmArchiveLoads () {
        return confirmElementIsVisible(ARCHIVE);
    }
    public boolean checkReportInboxLoaded () {return clickElement(INBOX_LOADED_PAGE, waitTimes.UNREASONABLE_WAIT);}
    public boolean checkReportPacketsLoaded () {return clickElement(PACKETS_LOADED_PAGE, waitTimes.UNREASONABLE_WAIT);}
}
