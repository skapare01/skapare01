package page_objects.entrata_page_objects.residents_tab.special_claims_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SpecialClaimsPage extends BasePage {

    public SpecialClaimsPage(WebDriver driver) {
        super(driver);
    }

    //Special Claims sub-tab locators
    private final By SPECIAL_CLAIMS_TYPE_COLUMN = By.xpath("//th[text()='Type']");
    private final By SPECIAL_CLAIMS_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By SPECIAL_CLAIMS_UNIT_COLUMN = By.xpath("//th[text()='Unit']");
    private final By SPECIAL_CLAIMS_VACANT_TENANT_NAME_COLUMN = By.xpath("//th[text()='Vacant Tenant Name']");
    private final By SPECIAL_CLAIMS_MOVE_OUT_COLUMN = By.xpath("//th[text()='Move-out']");
    private final By SPECIAL_CLAIMS_AVAILABLE_ON_COLUMN = By.xpath("//th[text()='Available On']");
    private final By SPECIAL_CLAIMS_STATUS_COLUMN = By.xpath("//th[text()='Status']");
    private final By SPECIAL_CLAIMS_CREATED_COLUMN = By.xpath("//th[text()='Created']");
    private final By SPECIAL_CLAIMS_ID_COLUMN = By.xpath("//a[text()='ID']");
    private final By SPECIAL_CLAIMS_AMOUNT_SUBMITTED_COLUMN = By.xpath("//th[text()='Amount Submitted']");
    private final By SPECIAL_CLAIMS_AMOUNT_APPROVED_COLUMN = By.xpath("//th[text()='Amount Approved']");

    //Special Claims methods
    public boolean confirmSpecialClaimsColumn_Type() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_TYPE_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_Property() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_PROPERTY_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_Unit() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_UNIT_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_VacantTenantName() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_VACANT_TENANT_NAME_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_MoveOut() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_MOVE_OUT_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_AvailableOn() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_AVAILABLE_ON_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_Status() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_STATUS_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_Created() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_CREATED_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_ID() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_ID_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_AmountSubmitted() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_AMOUNT_SUBMITTED_COLUMN);
    }

    public boolean confirmSpecialClaimsColumn_AmountApproved() {
        return confirmElementIsVisible(SPECIAL_CLAIMS_AMOUNT_APPROVED_COLUMN);
    }

}
