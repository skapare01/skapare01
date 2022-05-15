package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AssetsTabPage extends BasePage {

    //Resident Profile Asset tab locators
    private final By ASSETS_CURRENT_SIDETAB = By.className("js-current-tab");
    private final By ASSETS_FUTURE_SIDETAB = By.className("js-future-tab");
    private final By ASSETS_PAST_SIDETAB = By.className("js-past-tab");
    private final By ASSETS_TYPE_COLUMN = By.xpath("//*[text()='Type']");
    private final By ASSETS_EFFECTIVE_COLUMN = By.xpath("//*[text()='Effective']");
    private final By ASSETS_DESCRIPTION_COLUMN = By.xpath("//*[text()='Description']");
    private final By ASSETS_DISPOSED_COLUMN = By.xpath("//*[text()='Disposed']");
    private final By ASSETS_CASH_VALUE_COLUMN = By.xpath("//*[text()='Cash Value']");
    private final By ASSETS_ANNUAL_INCOME_COLUMN = By.xpath("//*[text()='Annual Income']");
    private final By ASSETS_MEMBER_COLUMN = By.xpath("//*[text()='Member']");
    private final By ASSETS_ACTIONS_COLUMN = By.xpath("//*[text()='Actions']");
    //Add current asset locators
    private final By ADD_CURRENT_ASSET_BUTTON = By.className("add-asset");
    private final By EFFECTIVE_DATE_CALENDAR = By.xpath("//*[@id=\"asset_information\"]/fieldset/div[1]/div[2]");
    private final By END_DATE_CALENDAR = By.xpath("//*[@id=\"asset_information\"]/fieldset/div[2]/div[2]");
    private final By HOUSEHOLD_MEMBER_DROPDOWN = By.cssSelector("select[name='customer_assets[customer_id]']");
    private final By SELECT_TODAY = By.xpath("//div/button[text()='Today']");
    private final By ASSET_TYPE_DROPDOWN = By.cssSelector("select[name='customer_assets[customer_asset_type_id]']");
    private final By DISPOSED_TOGGLE = By.cssSelector("div[class='onoff slim off advanced js-imputed-switch js-update-stripes']");
    private final By MARKET_VALUE = By.id("market_value");
    private final By COST_TO_SELL_OR_LIQUIDATE = By.id("cost_to_dispose");
    private final By CASH_VALUE = By.className("cash_value");
    private final By INTEREST_RATE = By.id("interest_rate");
    private final By ANNUAL_INCOME = By.id("annual_income");
    private final By DESCRIPTION = By.cssSelector("input[name='customer_assets[description]']");
    private final By BANK_INSTITUTION_NAME = By.cssSelector("input[name='customer_assets[institution_name]']");
    private final By CONTACT_PERSON = By.cssSelector("input[name='customer_assets[contact_name]']");
    private final By PHONE = By.id("customer_assets[contact_phone_number]-base");
    private final By FAX = By.id("customer_assets[contact_fax_number]-base");
    private final By EMAIL = By.cssSelector("input[name='customer_assets[contact_email]']");
    private final By COUNTRY_DROPDOWN = By.cssSelector("select[name='customer_assets[postal_addresses][default][country]']");
    private final By ADDRESS_LINE_ONE = By.cssSelector("input[name='customer_assets[postal_addresses][default][addressLine1]']");
    private final By ADDRESS_LINE_TWO = By.cssSelector("input[name='customer_assets[postal_addresses][default][addressLine2]']");
    private final By ADDRESS_LINE_THREE = By.cssSelector("input[name='customer_assets[postal_addresses][default][addressLine3]']");
    private final By CITY = By.cssSelector("input[name='customer_assets[postal_addresses][default][locality]']");
    private final By STATE_DROPDOWN = By.cssSelector("select[name='customer_assets[postal_addresses][default][administrativeArea]']");
    private final By ZIP = By.cssSelector("input[name='customer_assets[postal_addresses][default][postalCode]']");
    private final By SAVE_BUTTON_ADD_CURRENT_ASSET = By.id("asset_submit");
    private final By SUCCESS_MESSAGE_ADD_CURRENT_ASSET = By.cssSelector("p[class='alert success slim']");

    public AssetsTabPage(WebDriver driver) {
        super(driver);
    }

    //Resident Profile Household >> Assets sub-tab methods
    public boolean confirmAssetsCurrentSideTab() {
        return confirmElementIsVisible(ASSETS_CURRENT_SIDETAB);
    }

    public boolean confirmAssetsFutureSideTab() {
        return confirmElementIsVisible(ASSETS_FUTURE_SIDETAB);
    }

    public boolean confirmAssetsPastSideTab() {
        return confirmElementIsVisible(ASSETS_PAST_SIDETAB);
    }

    public boolean confirmAddCurrentAssetButton() {
        return confirmElementIsVisible(ADD_CURRENT_ASSET_BUTTON);
    }

    public boolean confirmAssetColumn_Type() {
        return confirmElementIsVisible(ASSETS_TYPE_COLUMN);
    }

    public boolean confirmAssetColumn_Effective() {
        return confirmElementIsVisible(ASSETS_EFFECTIVE_COLUMN);
    }

    public boolean confirmAssetColumn_Description() {
        return confirmElementIsVisible(ASSETS_DESCRIPTION_COLUMN);
    }

    public boolean confirmAssetColumn_Disposed() {
        return confirmElementIsVisible(ASSETS_DISPOSED_COLUMN);
    }

    public boolean confirmAssetColumn_CashValue() {
        return confirmElementIsVisible(ASSETS_CASH_VALUE_COLUMN);
    }

    public boolean confirmAssetColumn_AnnualIncome() {
        return confirmElementIsVisible(ASSETS_ANNUAL_INCOME_COLUMN);
    }

    public boolean confirmAssetColumn_Member() {
        return confirmElementIsVisible(ASSETS_MEMBER_COLUMN);
    }

    public boolean confirmAssetColumn_Actions() {
        return confirmElementIsVisible(ASSETS_ACTIONS_COLUMN);
    }

    //Add current asset methods
    public boolean clickAddCurrentAssetButton() {
        return clickElement(ADD_CURRENT_ASSET_BUTTON);
    }

    public boolean clickEffectiveDateCalendar() {
        return clickElement(EFFECTIVE_DATE_CALENDAR);
    }

    public boolean clickTodayButtonEffectiveDate() {
        return clickElement(SELECT_TODAY);
    }

    public boolean selectHouseholdMemberDropdownByValue(String value) {
        return selectElementByValue(HOUSEHOLD_MEMBER_DROPDOWN, value);
    }

    public boolean clickEndDateCalendar() {
        return clickElement(END_DATE_CALENDAR);
    }

    public boolean clickTodayEndDateCalendar() {
        return clickElement(SELECT_TODAY);
    }

    public boolean selectAssetTypeDropdownByValue(String value) {
        return selectElementByValue(ASSET_TYPE_DROPDOWN, value);
    }

    public boolean confirmDisposedToggle() {
        return confirmElementIsVisible(DISPOSED_TOGGLE);
    }

    public boolean enterMarketValueAmount(String amount) {
        return sendKeysToElement(MARKET_VALUE, amount);
    }

    public boolean confirmCostToSellOrLiquidateField() {
        return confirmElementIsVisible(COST_TO_SELL_OR_LIQUIDATE);
    }

    public boolean confirmCashValueField() {
        return confirmElementIsVisible(CASH_VALUE);
    }

    public boolean confirmInterestRateField() {
        return confirmElementIsVisible(INTEREST_RATE);
    }

    public boolean confirmAnnualIncomeField() {
        return confirmElementIsVisible(ANNUAL_INCOME);
    }

    public boolean enterDescription(String keys) {
        return sendKeysToElement(DESCRIPTION, keys);
    }

    public boolean enterBankInstitutionName(String name) {
        return sendKeysToElement(BANK_INSTITUTION_NAME, name);
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

    public boolean confirmCountryDropDown() {
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

    public boolean confirmZipField() {
        return confirmElementIsVisible(ZIP);
    }

    public boolean clickSaveButtonAddCurrentAsset() {
        return clickElement(SAVE_BUTTON_ADD_CURRENT_ASSET);
    }

    public boolean confirmSuccessMessageAfterAddingCurrentAsset() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_ADD_CURRENT_ASSET);
    }
}
