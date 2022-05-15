package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsMiscSubtabNav extends BasePage {
    public LeadsMiscSubtabNav(WebDriver driver) {
        super(driver);
    }

    //Leads Misc Tab Selector
    private final By MISC_SUBTAB_BUTTON = By.id("li_nav_leads_misc_setupxxx");
    //Company Leads Selectors
    private final By SELECT_SETUP_COMPANY_LEADS_EDIT_LEAD_SETTINGS = (By.id("lead-button"));
    private final By SELECT_SEPARATE_LEADS_AND_APPLICANTS_YES_NO_CHECKBOX = (By.xpath("//*[@id=\"leadsSeperation\"]"));
    //"Lead become Applicants when:" button selectors
    private final By LEAD_BECOMES_APPLICANT_WHEN_PAYMENT_IS_RECEIVED_RADIO_BUTTON = By.cssSelector("input[name='leads_become_applicants_when'][class='form-radio js-payment-radio']");
    private final By LEAD_REACHES_THE_STATUS_OF_RADIO_BUTTON = By.cssSelector("input[name='leads_become_applicants_when'][class='form-radio js-status-radio']");
    //"Choose One" Dropdown options selectors
    private final By CHOOSE_ONE_DROPDOWN_LEAD_BECOME_APPLICANTS_SETTING = By.cssSelector("select[id='SEPERATE_LEADS_AND_APPLICANTS_BY_STATUS'][name='company_preferences[SEPERATE_LEADS_AND_APPLICANTS_BY_STATUS]']");
    //"Choose One" selection options
    private final By CHOOSE_ONE_OPTION_GC_COMPLETED = By.xpath("//option[text()='Guestcard: Completed']");
    private final By CHOOSE_ONE_OPTION_APPLICATION_STARTED = By.xpath("//option[text()='Application: Started']");
    private final By CHOOSE_ONE_OPTION_APP_PARTIALLY_COMPLETED = By.xpath("//option[text()='Application: Partially Completed']");
    private final By CHOOSE_ONE_OPTION_APP_COMPLETED = By.xpath("//option[text()='Application: Completed']");
    private final By CHOOSE_ONE_OPTION_APP_APPROVED = By.xpath("//option[text()='Application: Approved']");
    private final By CHOOSE_ONE_OPTION_LEASE_STARTED = By.xpath("//option[text()='Lease: Started']");
    private final By CHOOSE_ONE_OPTION_LEASE_PARTIAL_COMPLETED = By.xpath("//option[text()='Lease: Partially Completed']");
    private final By CHOOSE_ONE_OPTION_LEASE_COMPLETED = By.xpath("//option[text()='Lease: Completed']");
    private final By CHOOSE_ONE_OPTION_LEASE_APPROVED = By.xpath("//option[text()='Lease: Approved']");
    //Save / Cancel Company>Leads>Misc settings Selectors
    private final By MISC_SETTINGS_SAVE_BUTTON = By.cssSelector("input[class='form-submit'][value='Save']");
    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Leads Misc Tab Selector
    public boolean clickLeadsMiscSubtab() {return clickElement(MISC_SUBTAB_BUTTON);}
    //Company Leads
    public boolean setupCompanyLeadsEditMiscSettings(){scrollDownToBottomOfPage(); return clickElement(SELECT_SETUP_COMPANY_LEADS_EDIT_LEAD_SETTINGS);}
    public boolean clickSeparateLeadsAndApplicantsYesNoSetting(){return clickElement(SELECT_SEPARATE_LEADS_AND_APPLICANTS_YES_NO_CHECKBOX);}
    //"Lead become Applicants when:" button selectors
    public boolean clickLeadBecomesApplicantWhenPaymentReceivedRadioButton() {waitForPotentialOverlayCompanySettings(); return clickElement(LEAD_BECOMES_APPLICANT_WHEN_PAYMENT_IS_RECEIVED_RADIO_BUTTON);}
    public boolean clickLeadReachesTheStatusOfRadioButton() {waitForPotentialOverlayCompanySettings(); return clickElement(LEAD_REACHES_THE_STATUS_OF_RADIO_BUTTON);}
    //"Choose One" Dropdown options Methods
    public boolean clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting() {return clickElement(CHOOSE_ONE_DROPDOWN_LEAD_BECOME_APPLICANTS_SETTING);}
    //"Choose One" selection options
    public boolean selectGuestCardCompletedOption() {return clickElement(CHOOSE_ONE_OPTION_GC_COMPLETED);}
    public boolean selectAppStartedOption() {return clickElement(CHOOSE_ONE_OPTION_APPLICATION_STARTED);}
    public boolean selectApplicationPartiallyCompletedOption() {return clickElement(CHOOSE_ONE_OPTION_APP_PARTIALLY_COMPLETED);}
    public boolean selectApplicationCompletedOption() {return clickElement(CHOOSE_ONE_OPTION_APP_COMPLETED);}
    public boolean selectApplicationApprovedOption() {return clickElement(CHOOSE_ONE_OPTION_APP_APPROVED);}
    public boolean selectLeaseStartedOption() {return clickElement(CHOOSE_ONE_OPTION_LEASE_STARTED);}
    public boolean selectLeasePartiallyCompletedOption() {return clickElement(CHOOSE_ONE_OPTION_LEASE_PARTIAL_COMPLETED);}
    public boolean selectLeaseCompletedOption() {return clickElement(CHOOSE_ONE_OPTION_LEASE_COMPLETED);}
    public boolean selectLeaseApprovedOption() {return clickElement(CHOOSE_ONE_OPTION_LEASE_APPROVED);}
    //Save / Cancel Company>Leads>Misc settings Methods
    public boolean selectMiscLeadsSettingsSaveButton() {scrollDownToBottomOfPage(); return clickElement(MISC_SETTINGS_SAVE_BUTTON);}
    //Overlay Method
    private void waitForPotentialOverlayCompanySettings() { waitForOverlay(LOADING_OVERLAY);}

}

