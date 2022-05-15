package page_objects.entrata_page_objects.reports_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SharedGeneralReportingFunctions extends ReportsBasePage{
    //General report filter locators:
    private final By ADD_PROPERTIES_BUTTON = By.xpath( "//*[@id=\"addbutton\"]/i");
    private final By TEXT_FIELD_IN_PROPERTY_GROUPS_FILTER = By.id("test");
    private final By SELECT_ONE_PROPERTY = By.cssSelector("ul.open");
    private final By ADD_ALL_PROPERTIES = By.xpath("//*[@class='header property-group-record js-all-properties binded binded2']/i[2]");
    private final By SUMMARIZE_BY_DROPDOWN = By.id("summarize_by");
    private final By SUMMARIZE_ACCOUNTS = By.id("summarize_accounts");
    private final By SUMMARIZE_BY_PROPERTY = By.cssSelector("#summarize_by option[value='property']");
    private final By CONSOLIDATED_BY_DROPDOWN = By.id("consolidated_by");
    //Has a typo and is different from the other selector
    private final By CONSOLIDATE_BY_DROPDOWN = By.id("consolidate_by");
    private final String CONSOLIDATE_BY_OPTION_NO_CONSOLIDATION = "no_consolidation";
    private final String CONSOLIDATE_BY_OPTION_CONSOLIDATE_ALL_PROPERTIES = "consolidate_all_properties";
    private final String CONSOLIDATE_BY_OPTION_CONSOLIDATE_BY_PROPERTY_GROUP = "consolidate_by_property_groups";
    private final By GENERATE_REPORT_BUTTON = By.xpath("//a[contains(text(), 'Generate Report')]");
    private final By BLUE_RESET_LINK_FOR_REPORT_FILTERS = By.cssSelector("a.js-reset-report.reset-filter");
    private final By GREEN_DROP_DOWN_MENU_LOCATOR = By.cssSelector("a.button.action.last.menu-only.green.pad5.generate-report-menu-open.allow-propagation.binded.binded-hover-intent > i:nth-of-type(1)");
    private final By FILTERS_TAB = By.id("filters");
    private final By CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER = By.cssSelector("i.close-button.close[onclick='psi.patterns.closeLargeDialog();']");
    private final By GL_ACCOUNTS_NUMBER = By.id("gl_account_numbers_filter");
    //Different id for the same toggle on different reports.
    private final By ACCOUNTS_NUMBER = By.id("account_number_filter");
    private final By BEGINNING_ENDING_CASH_BALANCE_DETAILS = By.id("beginning_cash_balance_detail_filter");

    //Display Options locators:
    private final By DISPLAY_OPTIONS_TAB = By.id("display_options");
    private final By PRIMARY_SORT_DROP_DOWN_MENU = By.id("primary_sort");
    private final By PRIMARY_SORT_ASCENDING_RADIO_BUTTON_OPTION = By.cssSelector("ul.form-picker.radio.js-sort-order-container > li:nth-of-type(1)");
    private final By PRIMARY_SORT_DESCENDING_RADIO_BUTTON_OPTION = By.cssSelector("ul.form-picker.radio.js-sort-order-container > li:nth-of-type(2)");
    private final By SECONDARY_SORT_DROP_DOWN_MENU = By.id("secondary_sort");
    private final By SECONDARY_SORT_ASCENDING_RADIO_BUTTON_OPTION = By.cssSelector("ul.form-picker.radio.js-secondary-sort-order-container > li:nth-of-type(1)");
    private final By SECONDARY_SORT_DESCENDING_RADIO_BUTTON_OPTION = By.cssSelector("ul.form-picker.radio.js-secondary-sort-order-container > li:nth-of-type(2)");
    private final By SUBTITLES_DROP_DOWN_MENU = By.cssSelector("#report_form > fieldset > div > div.js-tab-display.white.overflow-y-scroll > div.clearfix > div:nth-child(2) > div > div:nth-child(4) > select");

    //Green drop menu locators:
    private final By XLS_DOWNLOAD_OPTION_LOCATOR = By.cssSelector("#report_form > fieldset > div > div:nth-child(7) > ul > li:nth-child(2) > a > ul > li:nth-child(4)");
    private final By PDF_DOWNLOAD_OPTION_LOCATOR = By.cssSelector("#report_form > fieldset > div > div:nth-child(7) > ul > li:nth-child(2) > a > ul > li:nth-child(3)");
    private final By CREATE_INSTANCE_OPTION_LOCATOR = By.xpath("//li[text()='Create Instance']");

    //Generated report locators:
    private final By WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR = By.xpath("//*[text()='Was this report helpful?']");
    private final By GRAY_TIMESTAMP_FOOTER_AT_BOTTOM_OF_GENERATED_REPORT = By.cssSelector("div[class='margin10-top pad10 highlight-gray text-gray timestamp']");
    private final By FINAL_GENERATED_REPORT = By.id("generated-report");

    //5 Left-hand tab locators in opened report:
    private final By FILTERS_TAB_ON_LEFT_SIDE = By.cssSelector("div.view-data-left-col.equal-heights.rewrite-report-filter > ul > li:nth-child(1) > a");

    //Download pop-up window locators:
    private final By DOWNLOAD_XLS_BUTTON_LOCATOR = By.xpath( "/html/body/div[12]/div[2]/div[2]/div/input");
    private final By DOWNLOAD_PDF_BUTTON_LOCATOR = By.xpath( "/html/body/div[12]/div[2]/div[2]/div/input[2]");

    //Report Filter overlay locator:
    private final By OVERLAY = By.cssSelector(".filter-overlay");

    //Add Packet/Schedule Pop-up Window locators:
    private final By EVERY_BLANK_DAYS_TEXT_FIELD_LOCATOR = By.name("schedule_reports[num_days]");
    private final By MONTH_DATE_FIELD_LOCATOR = By.cssSelector("input[class='month']");
    private final By DAY_DATE_FIELD_LOCATOR = By.cssSelector("input[class='day']");
    private final By YEAR_DATE_FIELD_LOCATOR = By.cssSelector("input[class='year']");
    private final By COMPANY_USER_DROP_DOWN_HEADER_LOCATOR = By.xpath("//*[text()='Company User']");
    private final By COMPANY_USER_CHECKBOX_LOCATOR = By.cssSelector("input.form-checkbox.binded.binded-click[name='report_schedule_recipients[2][204817][]']");
    private final By REPORT_INSTANCE_DROP_DOWN_ARROW_LOCATOR = By.cssSelector("div.form-search-combobox.wide5 > i:nth-of-type(1)");

    //Constructor method:
    public SharedGeneralReportingFunctions (WebDriver driver) {
        super(driver);
    }


    //General report filter Methods
    public boolean pickFirstProperty (){
        return pickFirstItemInAList(SELECT_ONE_PROPERTY, waitTimes.LUDICROUS_WAIT);
    }
    public boolean addAllPropertiesClick() {
        return clickElement(ADD_ALL_PROPERTIES);
    }
    public boolean sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter(String propertyName) {
        return sendKeysToElement(TEXT_FIELD_IN_PROPERTY_GROUPS_FILTER, propertyName);
    }
    public boolean clickAddPropertiesButton () {
        return clickElement(ADD_PROPERTIES_BUTTON);
    }
    public boolean summarizeByPropertySelection () {
        return moveToAndSelectItemInDropDown(SUMMARIZE_BY_DROPDOWN, SUMMARIZE_BY_PROPERTY);
    }
    public boolean consolidateByNoConsolidationConsolidated() {
        return selectElementByValue(CONSOLIDATED_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_NO_CONSOLIDATION);
    }
    public boolean consolidateByAllPropertiesConsolidated() {
        return selectElementByValue(CONSOLIDATED_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_CONSOLIDATE_ALL_PROPERTIES);
    }
    public boolean consolidateByPropertyGroupConsolidated() {
        return selectElementByValue(CONSOLIDATED_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_CONSOLIDATE_BY_PROPERTY_GROUP);
    }
    public boolean consolidateByNoConsolidationConsolidate() {
        return selectElementByValue(CONSOLIDATE_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_NO_CONSOLIDATION);
    }
    public boolean consolidateByAllPropertiesConsolidate() {
        return selectElementByValue(CONSOLIDATE_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_CONSOLIDATE_ALL_PROPERTIES);
    }
    public boolean consolidateByPropertyGroupConsolidate() {
        return selectElementByValue(CONSOLIDATE_BY_DROPDOWN, CONSOLIDATE_BY_OPTION_CONSOLIDATE_BY_PROPERTY_GROUP);
    }
    public boolean summarizeAccountsToggle() {
        return clickElement(SUMMARIZE_ACCOUNTS);
    }
    public boolean confirmResetBlueLinkIsPresentInReportFilters() {
        return confirmElementIsVisible(BLUE_RESET_LINK_FOR_REPORT_FILTERS);
    }
    public boolean clickGenerateReportButton() {
        waitForReportingOverlay();
        return clickElement(GENERATE_REPORT_BUTTON);
    }
    public boolean clickDropDownArrowForDownloads() {
        return clickElement(GREEN_DROP_DOWN_MENU_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickFiltersTab() {
        return clickElement(FILTERS_TAB, waitTimes.LONG_WAIT);
    }
    public boolean clickCloseXButtonInTopRightCorner() {
        return clickElement(CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER, waitTimes.LONG_WAIT);
    }
    public boolean glAccountNumbersHidden() {
        return confirmElementIsInvisible(GL_ACCOUNTS_NUMBER);
    }
    public boolean accountNumbersHidden() {
        return confirmElementIsInvisible(ACCOUNTS_NUMBER);
    }
    public boolean beginningEndingCashBalanceHidden() {
        return confirmElementIsInvisible(BEGINNING_ENDING_CASH_BALANCE_DETAILS);
    }

    //Display Options Methods:
    public boolean clickDisplayOptionsTab() {
        return clickElement(DISPLAY_OPTIONS_TAB, waitTimes.LONG_WAIT);
    }
    public boolean confirmPrimarySortDropDownMenuIsPresent() {
        return confirmElementIsVisible(PRIMARY_SORT_DROP_DOWN_MENU, waitTimes.LONG_WAIT);
    }
    public boolean confirmPrimarySortAscendingRadioButtonOptionIsPresent() {
        return confirmElementIsVisible(PRIMARY_SORT_ASCENDING_RADIO_BUTTON_OPTION);
    }
    public boolean confirmPrimarySortDescendingRadioButtonOptionIsPresent() {
        return confirmElementIsVisible(PRIMARY_SORT_DESCENDING_RADIO_BUTTON_OPTION);
    }
    public boolean confirmSecondarySortDropDownMenuIsPresent() {
        return confirmElementIsVisible(SECONDARY_SORT_DROP_DOWN_MENU);
    }
    public boolean confirmSecondarySortAscendingRadioButtonOptionIsPresent() {
        return confirmElementIsVisible(SECONDARY_SORT_ASCENDING_RADIO_BUTTON_OPTION);
    }
    public boolean confirmSecondarySortDescendingRadioButtonOptionIsPresent() {
        return confirmElementIsVisible(SECONDARY_SORT_DESCENDING_RADIO_BUTTON_OPTION);
    }
    public boolean confirmSubtitlesDropDownMenuIsPresent() {
        return confirmElementIsVisible(SUBTITLES_DROP_DOWN_MENU);
    }

    //Green drop down menu methods:
    public boolean clickXLSDownloadOption() {
        return clickElement(XLS_DOWNLOAD_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickPdfDownloadOption() {
        return clickElement(PDF_DOWNLOAD_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickCreateInstanceOption() {
        return clickElement(CREATE_INSTANCE_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }

    //Generated report methods:
    public boolean verifyGenerationOfReport () {
        return confirmElementIsVisible(WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR, waitTimes.LUDICROUS_WAIT);
    }
    public boolean scrollToTimeStampAtBottomOfGeneratedReport() {
        return moveToAnElementWithActions(GRAY_TIMESTAMP_FOOTER_AT_BOTTOM_OF_GENERATED_REPORT, waitTimes.LONG_WAIT);
    }
    public boolean finalGeneratedReportVisible() {
        return confirmElementIsVisible(FINAL_GENERATED_REPORT, waitTimes.LUDICROUS_WAIT);
    }

    //5 Left-hand tab methods in opened report:
    public boolean clickFiltersTabOnLeftSideOfOpenReport() {
        return clickElement(FILTERS_TAB_ON_LEFT_SIDE, waitTimes.LONG_WAIT);
    }

    //Download pop-up window methods:
    public boolean confirmDownloadButtonExists() {
        return confirmElementIsVisible(DOWNLOAD_PDF_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickDownloadButton() {
        return clickElement(DOWNLOAD_PDF_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean confirmSecondGenerateXLSButtonExists() {
        return confirmElementIsVisible(DOWNLOAD_XLS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickGenerateXLSDownloadButton() {
        return clickElement(DOWNLOAD_XLS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    //Dynamically move below report for selection
    public boolean moveTo5BelowReport (int numberFiveLowerThanReport) {
        By reportPlusFive = By.cssSelector("#report_groups_list > div:nth-child(35) > ul > li:nth-child("+numberFiveLowerThanReport+") > a");
        return moveToAnElementWithActions(reportPlusFive);
    }

    //Verify file downloads
    public boolean waitToConfirmADownloadIsPresent(String fileName) {
        String FILENAME = ""+fileName+"";
        return checkDownloadsFileName(FILENAME);
    }
    public boolean removeDownloadedFile(String fileName) {
        String FILENAME = ""+fileName+"";
        return deleteFileInDownloads(FILENAME);
    }

    //For bug task 3229391 will be removed once resolved
    public boolean doubleClickOverlay() {
        return doubleClickElement(OVERLAY);}
    public boolean waitForReportingOverlay() {
        waitForOverlay(OVERLAY);
        return true;
    }

    //Add Packet/Schedule Pop-up Window methods:
    public boolean sendKeysForEveryBlankDaysField() {
        return sendKeysToElement(EVERY_BLANK_DAYS_TEXT_FIELD_LOCATOR, "2", waitTimes.LONG_WAIT);
    }
    public boolean sendKeysForMonthDateField() {
        return sendKeysToElement(MONTH_DATE_FIELD_LOCATOR,"01", waitTimes.LONG_WAIT);
    }
    public boolean sendKeysForDayDateField() {
        return sendKeysToElement(DAY_DATE_FIELD_LOCATOR,"01", waitTimes.LONG_WAIT);
    }
    public boolean sendKeysForYearDateField() {
        return sendKeysToElement(YEAR_DATE_FIELD_LOCATOR,"2060", waitTimes.LONG_WAIT);
    }
    public boolean clickCompanyUserDropDownHeader() {
        return clickElement(COMPANY_USER_DROP_DOWN_HEADER_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickCheckBoxForACompanyUser() {
        return clickElement(COMPANY_USER_CHECKBOX_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickReportInstanceDropDownArrow() {
        return clickElement(REPORT_INSTANCE_DROP_DOWN_ARROW_LOCATOR, waitTimes.LONG_WAIT);
    }
}
