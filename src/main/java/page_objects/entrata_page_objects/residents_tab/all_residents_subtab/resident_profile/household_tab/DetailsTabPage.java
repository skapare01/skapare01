package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DetailsTabPage extends BasePage {

    //Resident Profile household sub-tabs and sections locators
    private final By DETAILS_HOUSEHOLD_INFO = By.xpath("//*[@id=\"resident_lease\"]/b/h4");
    private final By EDIT_DETAILS_BUTTON = By.id("edit_household_details");
    private final By PREVIOUS_SUBSIDY_TYPE_DROPDOWN = By.cssSelector("select[name='application_subsidy_details[previous_subsidy_contract_type_id]']");
    private final By PREVIOUS_HOUSING_DROPDOWN = By.cssSelector("select[name='application_subsidy_details[subsidy_previous_housing_type_id]']");
    private final By DISPLACEMENT_STATUS = By.cssSelector("select[name='application_subsidy_details[subsidy_displacement_status_type_id]']");
    private final By HOUSEHOLD_CITIZENSHIP_ELIGIBILITY = By.cssSelector("select[name='application_subsidy_details[subsidy_citizenship_eligibility_type_id]']");
    private final By MINIMUM_RENT_HARDSHIP = By.cssSelector("select[name='application_subsidy_details[subsidy_min_rent_exemption_type_id]']");
    private final By INCOME_LEVEL_AT_MOVE_IN = By.cssSelector("select[name='application_subsidy_details[move_in_income_level_type_id]']");
    private final By CURRENT_INCOME = By.cssSelector("select[name='application_subsidy_details[current_income_level_type_id]']");
    private final By INCOME_EXCEPTION = By.cssSelector("select[name='application_subsidy_details[subsidy_income_exception_type_id]']");
    private final By WAIVER_TYPE = By.cssSelector("select[name='application_subsidy_details[subsidy_waiver_type_id]']");
    private final By SAVE_BUTTON = By.cssSelector("input[class='form-submit']");
    private final By ERROR_MESSAGE_DETAILS = By.cssSelector("p[id='error_previous_subsidy_contract_type_id']");
    private final By SUCCESS_MESSAGE_DETAILS = By.cssSelector("p[class='alert success slim']");
    //Overlay locator
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public DetailsTabPage(WebDriver driver) {
        super(driver);
    }

    //Resident Profile Details methods
    public String confirmHouseholdDetailsSection() {
        return getElementText(DETAILS_HOUSEHOLD_INFO);
    }

    public boolean clickEditDetailsButton() {
        waitForOverlayAfterClickingDetailsTab();
        return clickElement(EDIT_DETAILS_BUTTON, waitTimes.LONG_WAIT);
    }

    public boolean clickSaveButtonDetails() {
        return clickElement(SAVE_BUTTON);
    }

    public boolean confirmPreviousSubsidyTypeDropdown() {
        return confirmElementIsVisible(PREVIOUS_SUBSIDY_TYPE_DROPDOWN);
    }

    public boolean clickChooseOnePreviousSubsidyTypeDropdown(int select) {
        return selectElementByIndex(PREVIOUS_SUBSIDY_TYPE_DROPDOWN, select);
    }

    public boolean selectRentSupplementPreviousSubsidyTypeDropdown(int select) {
        return selectElementByIndex(PREVIOUS_SUBSIDY_TYPE_DROPDOWN, select);
    }

    public boolean confirmPreviousHousingDropdown() {
        return confirmElementIsVisible(PREVIOUS_HOUSING_DROPDOWN);
    }

    public boolean confirmDisplacementStatusDropdown() {
        return confirmElementIsVisible(DISPLACEMENT_STATUS);
    }

    public boolean confirmHouseholdCitizenshipEligibilityDropdown() {
        return confirmElementIsVisible(HOUSEHOLD_CITIZENSHIP_ELIGIBILITY);
    }

    public boolean confirmMinimumRentHardshipDropdown() {
        return confirmElementIsVisible(MINIMUM_RENT_HARDSHIP);
    }

    public boolean confirmIncomeLevelAtMoveInDropdown() {
        return confirmElementIsVisible(INCOME_LEVEL_AT_MOVE_IN);
    }

    public boolean confirmCurrentIncomeDropdown() {
        return confirmElementIsVisible(CURRENT_INCOME);
    }

    public boolean confirmIncomeExceptionDropdown() {
        return confirmElementIsVisible(INCOME_EXCEPTION);
    }

    public boolean confirmWaiverTypeDropdown() {
        return confirmElementIsVisible(WAIVER_TYPE);
    }

    public boolean confirmErrorMessageWhenSavingWithBlankRequiredFields() {
        return confirmElementIsVisible(ERROR_MESSAGE_DETAILS);
    }

    public boolean confirmSuccessMessageAfterUpdatingDetails() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_DETAILS);
    }

    //wait for overlay method after clicking details tab
    private void waitForOverlayAfterClickingDetailsTab() {
        waitForOverlay(LOADING_OVERLAY);
    }


}
