package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IncomeTabPage extends BasePage {

    //Resident Profile Income Column tab locators
    private final By INCOME_CURRENT_SIDETAB = By.className("js-current-tab");
    private final By INCOME_FUTURE_SIDETAB = By.className("js-future-tab");
    private final By INCOME_PAST_SIDETAB = By.className("js-past-tab");
    private final By INCOME_TYPE_COLUMN = By.xpath("//*[text()='Type']");
    private final By INCOME_EFFECTIVE_COLUMN = By.xpath("//*[text()='Effective']");
    private final By INCOME_DESCRIPTION_COLUMN = By.xpath("//*[text()='Description']");
    private final By INCOME_EMPLOYER_SOURCE_COLUMN = By.xpath("//*[text()='Employer/Source']");
    private final By INCOME_INCOME_COLUMN = By.xpath("//th[text()='Income']");
    private final By INCOME_MEMBER_COLUMN = By.xpath("//*[text()='Member']");
    private final By INCOME_ACTIONS_COLUMN = By.cssSelector("th[width='150px']");
    //Add Current Income locators
    private final By ADD_CURRENT_INCOME_BUTTON = By.className("add-income");
    private final By EFFECTIVE_DATE_CALENDAR = By.xpath("//*[@id=\"frm_add_edit_customer_income\"]/div[1]/fieldset/div[1]/div[2]");
    private final By END_DATE_CALENDAR = By.xpath("//*[@id=\"end_date_container\"]/div[2]");
    private final By SELECT_TODAY = By.xpath("//div/button[text()='Today']");
    private final By FIRST_DAY_OF_MONTH_SELECT = By.xpath("//td/a[text()='1']");
    private final By HOUSEHOLD_MEMBER_DROPDOWN = By.id("customers_incomes_customer_id");
    private final By INCOME_TYPE_DROPDOWN = By.id("customers_incomes_income_type_id");
    private final By ANNUAL_SALARY_TEXT_BOX = By.id("customers_incomes_amount");
    private final By EMPLOYER_TEXT_BOX = By.cssSelector("input[name='customer_incomes[institution_name]']");
    private final By SAVE_BUTTON_ADD_INCOME = By.id("income_submit");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    //Overlay locator
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public IncomeTabPage(WebDriver driver) {
        super(driver);
    }

    //Income column sub-tab methods
    public boolean confirmIncomeCurrentSideTab() {
        return confirmElementIsVisible(INCOME_CURRENT_SIDETAB);
    }

    public boolean confirmIncomeFutureSideTab() {
        return confirmElementIsVisible(INCOME_FUTURE_SIDETAB);
    }

    public boolean confirmIncomePastSideTab() {
        return confirmElementIsVisible(INCOME_PAST_SIDETAB);
    }

    public boolean confirmAddCurrentIncomeButton() {
        return confirmElementIsVisible(ADD_CURRENT_INCOME_BUTTON);
    }

    public boolean confirmIncomeColumnType() {
        return confirmElementIsVisible(INCOME_TYPE_COLUMN);
    }

    public boolean confirmIncomeColumn_Effective() {
        return confirmElementIsVisible(INCOME_EFFECTIVE_COLUMN);
    }

    public boolean confirmIncomeColumn_Description() {
        return confirmElementIsVisible(INCOME_DESCRIPTION_COLUMN);
    }

    public boolean confirmIncomeColumn_EmployerSource() {
        return confirmElementIsVisible(INCOME_EMPLOYER_SOURCE_COLUMN);
    }

    public boolean confirmIncomeColumn_Income() {
        return confirmElementIsVisible(INCOME_INCOME_COLUMN);
    }

    public boolean confirmIncomeColumn_Member() {
        return confirmElementIsVisible(INCOME_MEMBER_COLUMN);
    }

    public boolean confirmIncomeColumn_Actions() {
        return confirmElementIsVisible(INCOME_ACTIONS_COLUMN);
    }

    //Add current income methods
    public boolean clickAddCurrentIncomeButton() {
        return clickElement(ADD_CURRENT_INCOME_BUTTON);
    }

    public boolean clickEffectiveDateCalendar() {
        waitForIncomeWindowOverlay();
        return clickElement(EFFECTIVE_DATE_CALENDAR);
    }

    public boolean clickEndDateCalendar() {
        return clickElement(END_DATE_CALENDAR);
    }

    public boolean clickTodayEndDateCalendar() {
        return clickElement(SELECT_TODAY);
    }

    public boolean selectFirstDayOfMonth() {
        return clickElement(FIRST_DAY_OF_MONTH_SELECT);
    }

    public boolean selectHouseholdMemberByIndex(int select) {
        return selectElementByIndex(HOUSEHOLD_MEMBER_DROPDOWN, select);
    }

    public boolean selectIncomeTypeByValue(String incomeType) {
        return selectElementByValue(INCOME_TYPE_DROPDOWN, incomeType);
    }

    public boolean clearTextAnnualSalaryAmount() {
        return elementClearTextField(ANNUAL_SALARY_TEXT_BOX);
    }

    public boolean enterAnnualSalaryAmount(String amount) {
        return sendKeysToElement(ANNUAL_SALARY_TEXT_BOX, amount);
    }

    public boolean clearTextEmployer() {
        return elementClearTextField(EMPLOYER_TEXT_BOX);
    }

    public boolean enterEmployerName(String employer) {
        return sendKeysToElement(EMPLOYER_TEXT_BOX, employer);
    }

    public boolean clickSaveButtonAfterAddingNewIncome() {
        return clickElement(SAVE_BUTTON_ADD_INCOME);
    }

    public boolean confirmSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    //Overlay
    private void waitForIncomeWindowOverlay() {
        waitForOverlay(LOADING_OVERLAY);
    }


}
