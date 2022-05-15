package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RenewalsAndOffersReport extends BasePage {
    //Variables:
    private final By RENEWALS_AND_OFFERS_REPORT_LINK_LOCATOR = By.cssSelector("li[data-report-title ='Renewals and Offers'] a");
    private final By PROPERTY_LOOK_UP_CODE_COLUMN_NAME_LOCATOR = By.xpath("//th[text()='Property Look-Up Code']");
    private final By PROPERTY_LOOK_UP_CODE_CHECKBOX_FOR_SUMMARY_DATASET = By.cssSelector("input.form-checkbox.margin5-left.js-active-col.left[data-columnkey='lookup_code']");
    private final By PROPERTY_LOOK_UP_CODE_CHECKBOX_FOR_DETAILS_DATASET = By.cssSelector("#datasets > div.js-dataset-body.details > div > ul > li:nth-child(5) > div > div > input.form-checkbox.margin5-left.js-active-col.left");
    private final By DATASET_DROP_DOWN_MENU_IN_DISPLAY_OPTIONS = By.cssSelector("select.form-select.wide100.current_dataset[name='dataset_names']");
    private final By DETAIL_DATASET_OPTION_IN_DATASET_DROP_DOWN_MENU = By.cssSelector("select.form-select.wide100.current_dataset > option:nth-of-type(2)");
    private final By PROPERTY_LOOK_UP_CODE_VALUE_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(1) > td:nth-child(1)");
    public String PROPERTY_LOOK_UP_CODE_NUMBER_IN_REPORT = "";

    //Constructor Method:
    public RenewalsAndOffersReport(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean clickRenewalsAndOffersReportLink() {
        return clickElement(RENEWALS_AND_OFFERS_REPORT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean confirmPropertyLookUpCodeColumnIsNotPresent() {
        return confirmElementIsInvisible(PROPERTY_LOOK_UP_CODE_COLUMN_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean confirmPropertyLookUpCodeColumnIsPresent() {
        getPropertyLookUpCodeValue();
        return confirmElementIsVisible(PROPERTY_LOOK_UP_CODE_COLUMN_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickPropertyLookUpCodeCheckboxForSummaryDataset() {
        return clickElement(PROPERTY_LOOK_UP_CODE_CHECKBOX_FOR_SUMMARY_DATASET, waitTimes.LONG_WAIT);
    }
    public boolean clickPropertyLookUpCodeCheckboxForDetailsDataset() {
        return clickElement(PROPERTY_LOOK_UP_CODE_CHECKBOX_FOR_DETAILS_DATASET, waitTimes.LONG_WAIT);
    }
    public boolean clickDatasetDropDownMenuInDisplayOptions() {
        return clickElement(DATASET_DROP_DOWN_MENU_IN_DISPLAY_OPTIONS, waitTimes.LONG_WAIT);
    }
    public boolean clickDetailDatasetOptionInDatasetDropDownMenu() {
        return clickElement(DETAIL_DATASET_OPTION_IN_DATASET_DROP_DOWN_MENU, waitTimes.LONG_WAIT);
    }
    private String getPropertyLookUpCodeValue() {
        PROPERTY_LOOK_UP_CODE_NUMBER_IN_REPORT = getElementText(PROPERTY_LOOK_UP_CODE_VALUE_LOCATOR);
        return PROPERTY_LOOK_UP_CODE_NUMBER_IN_REPORT;
    }
}
