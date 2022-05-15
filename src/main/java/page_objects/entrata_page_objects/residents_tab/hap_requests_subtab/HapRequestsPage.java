package page_objects.entrata_page_objects.residents_tab.hap_requests_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HapRequestsPage extends BasePage {

    public HapRequestsPage(WebDriver driver) {
        super(driver);
    }

    //HAP Requests sub-tab locators
    private final By HAP_REQUEST_MONTH_COLUMN = By.xpath("//a[text()='Month']");
    private final By HAP_REQUEST_STATUS_COLUMN = By.xpath("//th[text()='Status']");
    private final By HAP_REQUEST_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By HAP_REQUEST_CONTRACT_COLUMN = By.xpath("//th[text()='Contract']");
    private final By HAP_REQUEST_ASSISTANCE_PAYMENTS_COLUMN = By.xpath("//th[text()='Assistance Payments']");
    private final By HAP_REQUEST_ADJUSTMENTS_COLUMN = By.xpath("//th[text()='Adjustments']");
    private final By HAP_REQUEST_MISC_REQUESTS_COLUMN = By.xpath("//th[text()='Misc. Requests']");
    private final By HAP_REQUEST_REPAYMENT_AGMTS_COLUMN = By.xpath("//th[text()='Repayment Agmts.']");
    private final By HAP_REQUEST_SPECIAL_CLAIMS_COLUMN = By.xpath("//th[text()='Special Claims']");
    private final By HAP_REQUEST_TOTAL_SUBSIDY_COLUMN = By.xpath("//th[text()='Total Subsidy']");

    //Hap Requests methods
    public boolean confirmHapRequestsColumn_Month() {
        return confirmElementIsVisible(HAP_REQUEST_MONTH_COLUMN);
    }

    public boolean confirmHapRequestsColumn_Status() {
        return confirmElementIsVisible(HAP_REQUEST_STATUS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_Property() {
        return confirmElementIsVisible(HAP_REQUEST_PROPERTY_COLUMN);
    }

    public boolean confirmHapRequestsColumn_Contract() {
        return confirmElementIsVisible(HAP_REQUEST_CONTRACT_COLUMN);
    }

    public boolean confirmHapRequestsColumn_AssistancePayments() {
        return confirmElementIsVisible(HAP_REQUEST_ASSISTANCE_PAYMENTS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_Adjustments() {
        return confirmElementIsVisible(HAP_REQUEST_ADJUSTMENTS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_MiscRequests() {
        return confirmElementIsVisible(HAP_REQUEST_MISC_REQUESTS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_RepaymentAgmts() {
        return confirmElementIsVisible(HAP_REQUEST_REPAYMENT_AGMTS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_SpecialClaims() {
        return confirmElementIsVisible(HAP_REQUEST_SPECIAL_CLAIMS_COLUMN);
    }

    public boolean confirmHapRequestsColumn_TotalSubsidy() {
        return confirmElementIsVisible(HAP_REQUEST_TOTAL_SUBSIDY_COLUMN);
    }

}
