package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentProfileCurtainPage extends BasePage {

    public ResidentProfileCurtainPage(WebDriver driver) {
        super(driver);
    }
    //Residents Page Header Variables
    private final By HEADER_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By PERFORM_FINANCIAL_MOVEOUT_BUTTON = By.linkText("Perform Financial Move-out");
    private final By TEXT_MESSAGE_PROFILE_OPTION = (By.cssSelector("a[class='button action last show-sms-modal sms-modal-text']"));

    //Household tab locator
    private final By RESIDENT_PROFILE_HOUSEHOLD_TAB = By.id("customer_household_tab");
    private final By RESIDENT_PROFILE_LEASE_TAB = By.id("customer_lease_tab");

    //Smart Devices
    private final By SMART_DEVICES_TAB = By.id("customer_smart_devices_tab");

    //QuickView Side
    private final By QUICK_VIEW_EDIT_BUTTON = By.cssSelector("div[class='button']");
    private final By QUICK_VIEW_PASSWORD_FIELD = By.id("qc_password");
    private final By RESIDENT_LOGIN_LINK = By.linkText("Resident Login ");
    private final By QUICK_VIEW_SAVE_BUTTON = By.cssSelector("input[value='Save']");

    //More Actions Variables
    private final By RESIDENT_MORE_ACTIONS_DROPDOWN = By.xpath("//div[contains(text(),'More Actions')]");
    private final By MORE_ACTIONS_DROPDOWN_CREATE_RENEWAL_OFFER = By.xpath("//li[contains(text(),'Create Renewal Offer')]");
    private final By VIEW_RENEWAL_PROGRESS_BUTTON = By.cssSelector("a[class='button action wizard left margin0-right pad10-right']");
    private final By MORE_ACTIONS_DROPDOWN_RENEW_RESIDENT = By.xpath("//li[contains(text(),'Renew Resident')]");
    private final By MORE_ACTIONS_SCHEDULE_TRANSFER_BUTTON = By.xpath("//li[text()='Schedule Transfer']");
    private final By MORE_ACTIONS_REVERSE_FINANCIAL_MOVE_OUT = By.xpath("//li[text()='Reverse Financial Move-out']");
    private final By SUBMIT_BUTTON = By.cssSelector(".form-submit");


    //Residents Page Header Methods
    public boolean clickMainHeaderCloseButton() {
        return clickElement(HEADER_CLOSE_BUTTON);
    }
    public boolean clickPerformFinancialMoveOut(){return clickElement(PERFORM_FINANCIAL_MOVEOUT_BUTTON);}
    public boolean confirmPerformFMOVisible(){return confirmElementIsVisible(PERFORM_FINANCIAL_MOVEOUT_BUTTON);}
    public boolean clickSMSProfileOption() { return clickElement(TEXT_MESSAGE_PROFILE_OPTION); }

    //Household tab method
    public boolean clickResidentProfileHouseholdTab() {
        return clickElement(RESIDENT_PROFILE_HOUSEHOLD_TAB);
    }
    public boolean clickResidentProfileLeaseTab(){return clickElement(RESIDENT_PROFILE_LEASE_TAB);}

    //Smart Devices
    public boolean smartDevicesTabClick() {
        return clickElement(SMART_DEVICES_TAB);
    }

    //QuickView Methods
    public boolean clickQuickViewEditButton() {
        return clickElement(QUICK_VIEW_EDIT_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean addPasswordToQuickView() {return sendKeysToElement(QUICK_VIEW_PASSWORD_FIELD, "Password1", waitTimes.DEFAULT_WAIT);}

    public boolean clickQuickViewSaveButton() {
        return clickElement(QUICK_VIEW_SAVE_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean clearPasswordField() {return elementClearTextField(QUICK_VIEW_PASSWORD_FIELD, waitTimes.DEFAULT_WAIT);}

    public boolean clickResidentLoginLink() { return clickElement(RESIDENT_LOGIN_LINK);}

    //More Actions Methods
    public boolean clickOnMoreActionsDropdown() {
        return clickElement(RESIDENT_MORE_ACTIONS_DROPDOWN);
    }
    public boolean moreActionsDropdownClickCreateRenewalOffer() {
        return clickElement(MORE_ACTIONS_DROPDOWN_CREATE_RENEWAL_OFFER);
    }
    public boolean clickViewRenewalProgress() {
        return clickElement(VIEW_RENEWAL_PROGRESS_BUTTON);
    }

    public boolean confirmViewRenewalProgressVisible(){return confirmElementIsVisible(VIEW_RENEWAL_PROGRESS_BUTTON);}

    public boolean moreActionsDropdownClickRenewResident() {
        return clickElement(MORE_ACTIONS_DROPDOWN_RENEW_RESIDENT);
    }
    public boolean moreActionsDropdownScheduleTransferClick() {
        return clickElement(MORE_ACTIONS_SCHEDULE_TRANSFER_BUTTON);
    }
    public boolean reverseFinancialMoveOut(){clickElement(MORE_ACTIONS_REVERSE_FINANCIAL_MOVE_OUT);
    return clickElement(SUBMIT_BUTTON);}

}
