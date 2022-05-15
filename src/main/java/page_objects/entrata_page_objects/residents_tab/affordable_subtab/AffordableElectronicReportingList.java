package page_objects.entrata_page_objects.residents_tab.affordable_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AffordableElectronicReportingList extends BasePage {

    public AffordableElectronicReportingList(WebDriver driver) {
        super(driver);
    }

    //Dashboard Residents >> Affordable sub tab UI locators
    private final By VERIFY_AFFORDABLE_ELECTRONIC_REPORTING = By.id("navigation_item_affordable_electronic_reportingxxx");
    private final By VERIFY_AFFORDABLE_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By VERIFY_AFFORDABLE_REPORT_TYPE_COLUMN = By.xpath("//th[text()='Report Type']");
    private final By VERIFY_AFFORDABLE_DATA_RANGE_COLUMN = By.xpath("//th[text()='Data Range']");
    private final By VERIFY_AFFORDABLE_CREATED_COLUMN = By.xpath("//th[text()='Created']");

    //Dashboard >> Resident >> Affordable methods
    public boolean confirmAffordableElectronicReporting() {
        return confirmElementIsVisible(VERIFY_AFFORDABLE_ELECTRONIC_REPORTING);
    }

    public boolean confirmAffordableColumn_Property() {
        return confirmElementIsVisible(VERIFY_AFFORDABLE_PROPERTY_COLUMN);
    }

    public boolean confirmAffordableColumn_ReportType() {
        return confirmElementIsVisible(VERIFY_AFFORDABLE_REPORT_TYPE_COLUMN);
    }

    public boolean confirmAffordableColumn_DataRange() {
        return confirmElementIsVisible(VERIFY_AFFORDABLE_DATA_RANGE_COLUMN);
    }

    public boolean confirmAffordableColumn_Created() {
        return confirmElementIsVisible(VERIFY_AFFORDABLE_CREATED_COLUMN);
    }

}
