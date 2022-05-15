package page_objects.entrata_page_objects.residents_tab.renewals_subtab.create_renewals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkCreateRenewalsPage extends BasePage {
    private final By HEADER_SELECT_RESIDENTS_TO_RENEW_TEXT = By.xpath("//a[text()='Select Residents to Renew']");
    //Left Side Filters
    private final By NAME_OR_EMAIL_TEXT_BOX = By.name("lease_renewals_filter[name_first]");
    private final By UNIT_TEXT_BOX = By.name("lease_renewals_filter[unit_number]");
    private final By PROPERTY_SELECTION_BOX = By.id("lease_renewals_filterproperty_group_ids");
    private final By UNIT_TYPES_DROPDOWN_BOX = By.cssSelector("div[class='form-advancedmultiselect form-search-multiselect']");
    private final By LEASE_EXPIRES_BETWEEN_FROM_DAYS_BOX = By.id("from_days");
    private final By LEASE_EXPIRES_BETWEEN_TO_DAYS_BOX = By.id("to_days");
    private final By LEASE_EXPIRES_FROM_DAYS_DATE_PICKER = By.xpath("//div[1][@class='form-date datepicker binded']");
    private final By LEASE_EXPIRES_TO_DAYS_DATE_PICKER = By.xpath("//div[3][@class='form-date datepicker binded']");
    private final By INCLUDE_MONTH_TO_MONTH_LEASES_CHECKBOX = By.id("is_month_to_month_lease");
    private final By SHOW_NON_RENEWABLE_RESIDENTS_CHECKBOX = By.id("non_renewable_lease");
    private final By SEARCH_BUTTON = By.id("search_active_button");
    private final By RESET_BUTTON = By.id("search_reset_button");
    //Main list
    private final By SELECT_ALL_CHECKBOX = By.id("checkAll");
    private final By SET_UP_OFFERS_BUTTON = By.id("renewal_leases_selection");
    private final By OFFER_LIST_RESIDENT_COLUMN = By.cssSelector("th[data-sort_by='name']");
    private final By OFFER_LIST_PROPERTY_COLUMN = By.cssSelector("th[data-sort_by='property_name']");
    private final By OFFER_LIST_UNIT_TYPE_COLUMN = By.cssSelector("th[data-sort_by='unit_type_name']");
    private final By OFFER_LIST_BLDG_UNIT_COLUMN = By.cssSelector("th[data-sort_by='unit_number']");
    private final By OFFER_LIST_LEASE_EXPIRES_COLUMN = By.cssSelector("th[data-sort_by='lease_end_date']");

    public BulkCreateRenewalsPage(WebDriver driver) {
        super(driver);
    }

    public boolean selectResidentsToRenewTextVisible() {
        return confirmElementIsVisible(HEADER_SELECT_RESIDENTS_TO_RENEW_TEXT);
    }

    //Left Side Filter Methods
    public boolean nameOrEmailTextBoxVisible() {
        return confirmElementIsVisible(NAME_OR_EMAIL_TEXT_BOX);
    }
    public boolean unitTextBoxVisible() {
        return confirmElementIsVisible(UNIT_TEXT_BOX);
    }
    public boolean propertySelectionBoxVisible() {
        return confirmElementIsVisible(PROPERTY_SELECTION_BOX);
    }
    public boolean unitTypesDropdownBoxVisible() {
        return confirmElementIsVisible(UNIT_TYPES_DROPDOWN_BOX);
    }
    public boolean leaseExpiresBetweenFromDaysTextBoxVisible() {
        return confirmElementIsVisible(LEASE_EXPIRES_BETWEEN_FROM_DAYS_BOX);
    }
    public boolean leaseExpiresBetweenToDaysTextBoxVisible() {
        return confirmElementIsVisible(LEASE_EXPIRES_BETWEEN_TO_DAYS_BOX);
    }
    public boolean leaseExpiresBetweenFromDaysDatePickerVisible() {
        return confirmElementIsVisible(LEASE_EXPIRES_FROM_DAYS_DATE_PICKER);
    }
    public boolean leaseExpiresBetweenToDaysDatePickerVisible() {
        return confirmElementIsVisible(LEASE_EXPIRES_TO_DAYS_DATE_PICKER);
    }
    public boolean includeMonthToMonthLeasesCheckboxVisible() {
        return confirmElementIsVisible(INCLUDE_MONTH_TO_MONTH_LEASES_CHECKBOX);
    }
    public boolean showNonRenewableResidentsCheckBoxVisible() {
        return confirmElementIsVisible(SHOW_NON_RENEWABLE_RESIDENTS_CHECKBOX);
    }
    public boolean searchButtonVisible() {
        return confirmElementIsVisible(SEARCH_BUTTON);
    }
    public boolean resetButtonVisible() {
        return confirmElementIsVisible(RESET_BUTTON);
    }

    //Main List Methods
    public boolean selectAllOffersCheckboxVisible() {
        return confirmElementIsVisible(SELECT_ALL_CHECKBOX);
    }
    public boolean setUpOffersButtonVisible() {
        return confirmElementIsVisible(SET_UP_OFFERS_BUTTON);
    }
    public boolean offerListResidentColumnVisible() {
        return confirmElementIsVisible(OFFER_LIST_RESIDENT_COLUMN);
    }
    public boolean offerListPropertyColumnVisible() {
        return confirmElementIsVisible(OFFER_LIST_PROPERTY_COLUMN);
    }
    public boolean offerListUnitTypeColumnVisible() {
        return confirmElementIsVisible(OFFER_LIST_UNIT_TYPE_COLUMN);
    }
    public boolean offerListBldgUnitColumnVisible() {
        return confirmElementIsVisible(OFFER_LIST_BLDG_UNIT_COLUMN);
    }
    public boolean offerListLeaseExpiresColumnVisible() {
        return confirmElementIsVisible(OFFER_LIST_LEASE_EXPIRES_COLUMN);
    }

}
