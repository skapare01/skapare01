package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CreateRenewalOfferPage extends BasePage {
    private final By SAVE_CHANGES_BUTTON = By.id("save_changes");
    private final By RENEW_RESIDENT_GENERATE_LEASE_BUTTON = By.cssSelector("input[value='Generate Lease']");
    private final By CLOSE_BUTTON_CREATE_RENEWAL_OFFER_PAGE = By.cssSelector("i[class='close-button close']");
    private final By CUSTOM_TAB = By.xpath("//*[text()='CUSTOM']");
    private final By LEASE_END_DATE = By.className("renewal-previous-lease-end-date");
    private final By LEASE_EXPIRATION_DATE = By.className("renewal-offer-expiry-date-column");
    //lease terms and rent
    private final By SELECT_FIRST_LEASE_TERM_CHECKBOX = By.cssSelector("i[data-lease_term_name='12 months']");
    private final By FIRST_LEASE_TERM_BASE_RENEWAL_RENT_TEXT_BOX = By.xpath("//tr[11]/td[7]/input[1][@data-ui-field='currency']");
    private final By LEASE_TERM_COLUMN = By.xpath("//th[contains(text(),'Lease Term')]");
    private final By LEASE_END_MONTH_COLUMN = By.xpath("//th[contains(text(),'Lease End Month')]");
    private final By LEASE_EXPIRING_COLUMN = By.xpath("//th[contains(text(),'Leases Expiring')]");
    private final By CURRENT_RENT_COLUMN = By.xpath("//b[1]//th[5][contains(text(),'Current Rent')]");
    private final By CALCULATED_RENEWAL_RENT_COLUMN = By.xpath("//th[contains(text(),'Calculated Renewal Rent')]");
    private final By BASE_RENT_COLUMN = By.xpath("//th[contains(text(),'Base Renewal Rent')]");
    private final By TOTAL_RENEWAL_RENT_COLUMN = By.xpath("//th[contains(text(),'Total Renewal Rent')]");
    private final By INCLUDE_IN_OFFER_RENT_COLUMN = By.xpath("//th[contains(text(),'Include In Offer Letter')]");
    //Renewal Specials
    private final By RENEWAL_SPECIALS_HEADING = By.xpath("//div[text()='Renewal Specials']");
    private final By RENEWAL_SPECIALS_TIMING_COLUMN = By.xpath("//b[2]//th[2][text()='Timing']");
    private final By RENEWAL_SPECIALS_NAME_COLUMN = By.xpath("//b[2]//th[3][text()='Name']");
    private final By RENEWAL_SPECIALS_TYPE_COLUMN = By.xpath("//b[2]//th[4][text()='Type']");
    private final By RENEWAL_SPECIALS_NEW_AMOUNT_COLUMN = By.xpath("//b[2]//th[5][text()='New Amount']");
    //Add-ons
    private final By ADD_ONS_HEADING = By.xpath("//div[text()='Add Ons']");
    private final By ADD_ONS_NAME_COLUMN = By.xpath("//b[3]//th[2][text()='Name']");
    private final By ADD_ONS_TYPE_COLUMN = By.xpath("//b[3]//th[3][text()='Type']");
    private final By ADD_ONS_CATEGORY_COLUMN = By.xpath("//b[3]//th[4][text()='Category']");
    private final By ADD_ONS_CURRENT_INCOME_COLUMN = By.xpath("//b[3]//th[5][text()='Current Income']");
    private final By ADD_ONS_NEW_INCOME_COLUMN = By.xpath("//b[3]//th[6][text()='New Income']");
    private final By ADD_ONS_CURRENT_RENT_COLUMN = By.xpath("//b[3]//th[7][text()='Current Rent']");
    private final By ADD_ONS_NEW_RENT_COLUMN = By.xpath("//b[3]//th[8][text()='New Rent']");
    //Amenities
    private final By AMENITIES_HEADING = By.xpath("//div[text()='Amenities']");
    private final By AMENITIES_NAME_COLUMN = By.xpath("//b[4]//th[2][text()='Name']");
    private final By AMENITIES_CHARGE_CODE_COLUMN = By.xpath("//b[4]//th[3][text()='Charge Code']");
    private final By AMENITIES_TIMING_COLUMN = By.xpath("//b[4]//th[4][text()='Timing']");
    private final By AMENITIES_CURRENT_RENT_COLUMN = By.xpath("//b[4]//th[5][text()='Current Rent']");
    private final By AMENITIES_NEW_RENT_COLUMN = By.xpath("//b[4]//th[6][text()='New Rent']");
    //Pets
    private final By PETS_HEADING = By.xpath("//div[text()='Pets']");
    private final By PETS_TYPE_COLUMN = By.xpath("//b[5]//th[2][text()='Type']");
    private final By PETS_COUNT_COLUMN = By.xpath("//b[5]//th[3][text()='Count']");
    private final By PETS_CHARGE_CODE_COLUMN = By.xpath("//b[5]//th[4][text()='Charge Code']");
    private final By PETS_CURRENT_RENT_COLUMN = By.xpath("//b[5]//th[5][text()='Current Rent']");
    private final By PETS_NEW_AMOUNT_COLUMN = By.xpath("//b[5]//th[6][text()='New Amount']");
    //Other Charges
    private final By OTHER_CHARGES_HEADING = By.xpath("//div[text()='Other Charges']");
    private final By OTHER_CHARGES_TIMING_COLUMN = By.xpath("//b[6]//th[2][text()='Timing']");
    private final By OTHER_CHARGES_NAME_COLUMN = By.xpath("//b[6]//th[3][text()='Name']");
    private final By OTHER_CHARGES_CURRENT_AMOUNT_COLUMN = By.xpath("//b[6]//th[4][text()='Current Amount']");
    private final By OTHER_CHARGES_NEW_AMOUNT_COLUMN = By.xpath("//b[6]//th[5][text()='New Amount']");
    //Concessions
    private final By CONCESSIONS_HEADING = By.xpath("//div[text()='Concessions']");
    private final By CONCESSIONS_TIMING_COLUMN = By.xpath("//b[7]//th[2][text()='Timing']");
    private final By CONCESSIONS_NAME_COLUMN = By.xpath("//b[7]//th[3][text()='Name']");
    private final By CONCESSIONS_CURRENT_AMOUNT_COLUMN = By.xpath("//b[7]//th[4][text()='Current Amount']");
    private final By CONCESSIONS_NEW_AMOUNT_COLUMN = By.xpath("//b[7]//th[5][text()='New Amount']");
    //Lease Utilities
    private final By LEASE_UTILITIES_HEADING = By.xpath("//div[text()='Lease Utilities']");
    private final By LEASE_UTILITIES_UTILITIES_COLUMN = By.xpath("//b[8]//th[2][text()='Utility']");
    private final By LEASE_UTILITIES_RESPONSIBLE_COLUMN = By.xpath("//b[8]//th[3][text()='Responsible']");

    public CreateRenewalOfferPage(WebDriver driver) {
        super(driver);
    }

    public boolean createRenewalOfferPageVerifyPageLoadsWithSaveChangesButtonVis() {
        return confirmElementIsVisible(SAVE_CHANGES_BUTTON);
    }
    public boolean saveChangesButtonClick() {
        return clickElement(SAVE_CHANGES_BUTTON);
    }
    public boolean renewResidentGenerateLeaseButtonVisible() {
        return confirmElementIsVisible(RENEW_RESIDENT_GENERATE_LEASE_BUTTON);
    }
    public boolean closeCreateRenewalOfferPage() {
        return clickElement(CLOSE_BUTTON_CREATE_RENEWAL_OFFER_PAGE);
    }
    public boolean customIntervalTabText() {
        return confirmElementIsVisible(CUSTOM_TAB, waitTimes.LUDICROUS_WAIT);
    }
    public boolean leaseEndDate() {
        return confirmElementIsVisible(LEASE_END_DATE);
    }
    public boolean leaseExpirationDate() {
        return confirmElementIsVisible(LEASE_EXPIRATION_DATE);
    }
    //lease terms and rent
    public boolean selectFirstLeaseTermsCheckBox() {
        return clickElement(SELECT_FIRST_LEASE_TERM_CHECKBOX);
    }
    public boolean clearTextBoxForBaseRenewalRentLeaseTermOne() {
        return elementClearTextField(FIRST_LEASE_TERM_BASE_RENEWAL_RENT_TEXT_BOX);
    }
    public boolean enterIn1000ForBaseRenewalRentLeaseTermOne() {
        return sendKeysToElement(FIRST_LEASE_TERM_BASE_RENEWAL_RENT_TEXT_BOX, "1000");
    }
    public boolean leaseTermColumn() {
        return confirmElementIsVisible(LEASE_TERM_COLUMN);
    }
    public boolean leaseEndMonthColumn() {
        return confirmElementIsVisible(LEASE_END_MONTH_COLUMN);
    }
    public boolean leasesExpiringColumn() {
        return confirmElementIsVisible(LEASE_EXPIRING_COLUMN);
    }
    public boolean currentRentColumn() {
        return confirmElementIsVisible(CURRENT_RENT_COLUMN);
    }
    public boolean calculatedRenewalRentColumn() {
        return confirmElementIsVisible(CALCULATED_RENEWAL_RENT_COLUMN);
    }
    public boolean baseRentColumn() {
        return confirmElementIsVisible(BASE_RENT_COLUMN);
    }
    public boolean totalRenewalRentColumn() {
        return confirmElementIsVisible(TOTAL_RENEWAL_RENT_COLUMN);
    }
    public boolean includeInOfferRentColumn() {
        return confirmElementIsVisible(INCLUDE_IN_OFFER_RENT_COLUMN);
    }
    //Renewal Specials
    public boolean renewalSpecialsHeading() {
        return confirmElementIsVisible(RENEWAL_SPECIALS_HEADING);
    }
    public boolean renewalSpecialsTimingColumn() {
        return confirmElementIsVisible(RENEWAL_SPECIALS_TIMING_COLUMN);
    }
    public boolean renewalSpecialsNameColumn() {
        return confirmElementIsVisible(RENEWAL_SPECIALS_NAME_COLUMN);
    }
    public boolean renewalSpecialsTypeColumn() {
        return confirmElementIsVisible(RENEWAL_SPECIALS_TYPE_COLUMN);
    }
    public boolean renewalSpecialsNewAmountColumn() {
        return confirmElementIsVisible(RENEWAL_SPECIALS_NEW_AMOUNT_COLUMN);
    }
    //Add-ons
    public boolean addOnsHeading() {
        return confirmElementIsVisible(ADD_ONS_HEADING);
    }
    public boolean add0nNameColumn() {
        return confirmElementIsVisible(ADD_ONS_NAME_COLUMN);
    }
    public boolean addOnTypeColumn() {
        return confirmElementIsVisible(ADD_ONS_TYPE_COLUMN);
    }
    public boolean addOnCategoryColumn() {
        return confirmElementIsVisible(ADD_ONS_CATEGORY_COLUMN);
    }
    public boolean addOnCurrentIncomeColumn() {
        return confirmElementIsVisible(ADD_ONS_CURRENT_INCOME_COLUMN);
    }
    public boolean addOnNewIncomeColumn() {
        return confirmElementIsVisible(ADD_ONS_NEW_INCOME_COLUMN);
    }
    public boolean addOnCurrentRentColumn() {
        return confirmElementIsVisible(ADD_ONS_CURRENT_RENT_COLUMN);
    }
    public boolean addOnNewRentColumn() {
        return confirmElementIsVisible(ADD_ONS_NEW_RENT_COLUMN);
    }
    //Amenities
    public boolean amenitiesHeading() {
        return confirmElementIsVisible(AMENITIES_HEADING);
    }
    public boolean amenitiesNameColumn() {
        return confirmElementIsVisible(AMENITIES_NAME_COLUMN);
    }
    public boolean amenitiesChargeCodeColumn() {
        return confirmElementIsVisible(AMENITIES_CHARGE_CODE_COLUMN);
    }
    public boolean amenitiesTimingColumn() {
        return confirmElementIsVisible(AMENITIES_TIMING_COLUMN);
    }
    public boolean amenitiesCurrentRentColumn() {
        return confirmElementIsVisible(AMENITIES_CURRENT_RENT_COLUMN);
    }
    public boolean amenitiesNewRentColumn() {
        return confirmElementIsVisible(AMENITIES_NEW_RENT_COLUMN);
    }
    //Pets
    public boolean petsHeading() {
        return confirmElementIsVisible(PETS_HEADING);
    }
    public boolean petsTypeColumn() {
        return confirmElementIsVisible(PETS_TYPE_COLUMN);
    }
    public boolean petsCountColumn() {
        return confirmElementIsVisible(PETS_COUNT_COLUMN);
    }
    public boolean petsChargeCodeColumn() {
        return confirmElementIsVisible(PETS_CHARGE_CODE_COLUMN);
    }
    public boolean petsCurrentRentColumn() {
        return confirmElementIsVisible(PETS_CURRENT_RENT_COLUMN);
    }
    public boolean petsNewAmountColumn() {
        return confirmElementIsVisible(PETS_NEW_AMOUNT_COLUMN);
    }
    //Other Charges
    public boolean otherChargesHeading() {
        return confirmElementIsVisible(OTHER_CHARGES_HEADING);
    }
    public boolean otherChargesTimingColumn() {
        return confirmElementIsVisible(OTHER_CHARGES_TIMING_COLUMN);
    }
    public boolean otherChargesNameColumn() {
        return confirmElementIsVisible(OTHER_CHARGES_NAME_COLUMN);
    }
    public boolean otherChargesCurrentAmountColumn() {
        return confirmElementIsVisible(OTHER_CHARGES_CURRENT_AMOUNT_COLUMN);
    }
    public boolean otherChargesNewAmountColumn() {
        return confirmElementIsVisible(OTHER_CHARGES_NEW_AMOUNT_COLUMN);
    }
    //Concessions
    public boolean concessionsHeading() {
        return confirmElementIsVisible(CONCESSIONS_HEADING);
    }
    public boolean concessionsTimingColumn() {
        return confirmElementIsVisible(CONCESSIONS_TIMING_COLUMN);
    }
    public boolean concessionsNameColumn() {
        return confirmElementIsVisible(CONCESSIONS_NAME_COLUMN);
    }
    public boolean concessionsCurrentAmountColumn() {
        return confirmElementIsVisible(CONCESSIONS_CURRENT_AMOUNT_COLUMN);
    }
    public boolean concessionsNewAmountColumn() {
        return confirmElementIsVisible(CONCESSIONS_NEW_AMOUNT_COLUMN);
    }
    //Lease Utilities
    public boolean leaseUtilitiesHeading() {
        return confirmElementIsVisible(LEASE_UTILITIES_HEADING);
    }
    public boolean leaseUtilitiesUtilitiesColumn() {
        return confirmElementIsVisible(LEASE_UTILITIES_UTILITIES_COLUMN);
    }
    public boolean leaseUtilitiesResponsibleColumn() {
        return confirmElementIsVisible(LEASE_UTILITIES_RESPONSIBLE_COLUMN);
    }
}
