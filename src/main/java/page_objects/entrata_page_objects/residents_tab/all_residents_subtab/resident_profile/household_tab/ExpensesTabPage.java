package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ExpensesTabPage extends BasePage {

    //Resident Profile Expenses tab locators
    private final By EXPENSES_CURRENT_SIDETAB = By.className("js-current-tab");
    private final By EXPENSES_FUTURE_SIDETAB = By.className("js-future-tab");
    private final By EXPENSES_PAST_SIDETAB = By.className("js-past-tab");
    private final By EXPENSES_TYPE_COLUMN = By.xpath("//*[text()='Type']");
    private final By EXPENSES_EFFECTIVE_COLUMN = By.xpath("//*[text()='Effective']");
    private final By EXPENSES_DESCRIPTION_COLUMN = By.xpath("//*[text()='Description']");
    private final By EXPENSES_ANNUAL_EXPENSE_COLUMN = By.xpath("//*[text()='Annual Expense']");
    private final By EXPENSES_MEMBER_COLUMN = By.xpath("//*[text()='Member']");
    private final By EXPENSES_ACTIONS_COLUMN = By.xpath("//*[text()='Actions']");
    //Add current expense locators
    private final By ADD_CURRENT_EXPENSES_BUTTON = By.className("add-expense");
    private final By EFFECTIVE_DATE_CALENDAR = By.xpath("//*[@id=\"frm_add_edit_customer_expense\"]/fieldset[1]/div[1]/div[2]");
    private final By END_DATE_CALENDAR = By.xpath("//*[@id=\"frm_add_edit_customer_expense\"]/fieldset[1]/div[2]/div[2]");
    private final By SELECT_TODAY = By.xpath("//div/button[text()='Today']");
    private final By EXPENSE_TYPE_DROPDOWN = By.cssSelector("select[name='customer_expense[expense_type_id]']");
    private final By HOUSEHOLD_MEMBER_DROPDOWN = By.id("household_member");
    private final By FREQUENCY_OF_EXPENSE = By.id("customer_expense_frequency_id");
    private final By ANNUAL_EXPENSE_AMOUNT = By.id("customer_expense_detail_amount");
    private final By TOTAL_ANNUAL_EXPENSE_AMOUNT = By.id("label_customer_expenses_total_annual_expense_amount");
    private final By DISABILITY_EXPENSE_MEMBERS_CHECKBOX = By.id("member_to_work");
    private final By DESCRIPTION = By.cssSelector("input[name='customer_expense[description]']");
    private final By DOCTOR_PHARMACY_NAME = By.cssSelector("input[name='customer_expense[institution_name]']");
    private final By CONTACT_PERSON = By.cssSelector("input[name='customer_expense[contact_name]']");
    private final By PHONE = By.id("customer_expenses[contact_phone_number]-base");
    private final By FAX = By.id("customer_expenses[contact_fax_number]-base");
    private final By EMAIL = By.cssSelector("input[name='customer_expense[contact_email]']");
    private final By COUNTRY_DROPDOWN = By.cssSelector("select[name='customer_expense[postal_addresses][default][country]']");
    private final By ADDRESS_LINE_ONE = By.cssSelector("input[name='customer_expense[postal_addresses][default][addressLine1]']");
    private final By ADDRESS_LINE_TWO = By.cssSelector("input[name='customer_expense[postal_addresses][default][addressLine2]']");
    private final By ADDRESS_LINE_THREE = By.cssSelector("input[name='customer_expense[postal_addresses][default][addressLine3]']");
    private final By CITY = By.cssSelector("input[name='customer_expense[postal_addresses][default][locality]']");
    private final By STATE_DROPDOWN = By.cssSelector("select[name='customer_expense[postal_addresses][default][administrativeArea]']");
    private final By ZIPCODE = By.cssSelector("input[name='customer_expense[postal_addresses][default][postalCode]']");
    private final By SAVE_BUTTON_ADD_CURRENT_EXPENSE = By.id("expense_submit");
    private final By SUCCESS_MESSAGE_ADD_CURRENT_EXPENSE = By.cssSelector("p[class='alert success slim']");
    private final By LOADING_OVERLAY_AFTER_EXPENSE_TYPE = By.className("loading-overlay");

    public ExpensesTabPage(WebDriver driver) {
        super(driver);
    }

    //Expenses confirm column methods
    public boolean confirmExpensesCurrentSideTab() {
        return confirmElementIsVisible(EXPENSES_CURRENT_SIDETAB);
    }

    public boolean confirmExpensesFutureSideTab() {
        return confirmElementIsVisible(EXPENSES_FUTURE_SIDETAB);
    }

    public boolean confirmExpensesPastSideTab() {
        return confirmElementIsVisible(EXPENSES_PAST_SIDETAB);
    }

    public boolean confirmAddCurrentExpenseButton() {
        return confirmElementIsVisible(ADD_CURRENT_EXPENSES_BUTTON);
    }

    public boolean confirmExpenseColumn_Type() {
        return confirmElementIsVisible(EXPENSES_TYPE_COLUMN);
    }

    public boolean confirmExpenseColumn_Effective() {
        return confirmElementIsVisible(EXPENSES_EFFECTIVE_COLUMN);
    }

    public boolean confirmExpenseColumn_Description() {
        return confirmElementIsVisible(EXPENSES_DESCRIPTION_COLUMN);
    }

    public boolean confirmExpenseColumn_Annual_Expense() {
        return confirmElementIsVisible(EXPENSES_ANNUAL_EXPENSE_COLUMN);
    }

    public boolean confirmExpenseColumn_Member() {
        return confirmElementIsVisible(EXPENSES_MEMBER_COLUMN);
    }

    public boolean confirmExpenseColumn_Actions() {
        return confirmElementIsVisible(EXPENSES_ACTIONS_COLUMN);
    }

    //Add current expense methods
    public boolean clickAddCurrentExpenseButton() {
        return clickElement(ADD_CURRENT_EXPENSES_BUTTON);
    }

    public boolean clickEffectiveDateCalendar() {
        return clickElement(EFFECTIVE_DATE_CALENDAR);
    }

    public boolean clickTodayEffectiveDate() {
        return clickElement(SELECT_TODAY);
    }

    public boolean clickEndDateCalendar() {
        return clickElement(END_DATE_CALENDAR);
    }

    public boolean clickTodayEndDateCalendar() {
        return clickElement(SELECT_TODAY);
    }

    public boolean selectExpenseTypeByIndex(int select) {
        return selectElementByIndex(EXPENSE_TYPE_DROPDOWN, select);
    }

    public boolean checkDisabilityExpenseMemberAllowToWorkCheckbox() {
        waitForOverlayAfterExpenseType();
        return clickElement(DISABILITY_EXPENSE_MEMBERS_CHECKBOX);
    }

    public boolean selectHouseholdMemberByIndex(int select) {
        return selectElementByIndex(HOUSEHOLD_MEMBER_DROPDOWN, select);
    }

    public boolean selectFrequencyOfExpenseByValue(String value) {
        return selectElementByValue(FREQUENCY_OF_EXPENSE, value);
    }

    public boolean enterAnnualExpenseAmount(String amount) {
        return sendKeysToElement(ANNUAL_EXPENSE_AMOUNT, amount);
    }

    public boolean confirmTotalAnnualExpenseAmountField() {
        return confirmElementIsVisible(TOTAL_ANNUAL_EXPENSE_AMOUNT);
    }

    public boolean enterDescription(String keys) {
        return sendKeysToElement(DESCRIPTION, keys);
    }

    public boolean confirmDoctorPharmacyNameField() {
        return confirmElementIsVisible(DOCTOR_PHARMACY_NAME);
    }

    public boolean confirmContactPersonField() {
        return confirmElementIsVisible(CONTACT_PERSON);
    }

    public boolean confirmPhoneField() {
        return confirmElementIsVisible(PHONE);
    }

    public boolean confirmFaxField() {
        return confirmElementIsVisible(FAX);
    }

    public boolean confirmEmailField() {
        return confirmElementIsVisible(EMAIL);
    }

    public boolean confirmCountryDropdown() {
        return confirmElementIsVisible(COUNTRY_DROPDOWN);
    }

    public boolean confirmAddressLineOne() {
        return confirmElementIsVisible(ADDRESS_LINE_ONE);
    }

    public boolean confirmAddressLineTwo() {
        return confirmElementIsVisible(ADDRESS_LINE_TWO);
    }

    public boolean confirmAddressLineThree() {
        return confirmElementIsVisible(ADDRESS_LINE_THREE);
    }

    public boolean confirmCityField() {
        return confirmElementIsVisible(CITY);
    }

    public boolean confirmStateDropdown() {
        return confirmElementIsVisible(STATE_DROPDOWN);
    }

    public boolean confirmZipCodeField() {
        return confirmElementIsVisible(ZIPCODE);
    }

    public boolean clickSaveButtonAddCurrentExpense() {
        return clickElement(SAVE_BUTTON_ADD_CURRENT_EXPENSE);
    }

    public boolean confirmSuccessMessageAddCurrentExpense() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_ADD_CURRENT_EXPENSE);
    }

    private void waitForOverlayAfterExpenseType() {
        waitForOverlay(LOADING_OVERLAY_AFTER_EXPENSE_TYPE);
    }

}

