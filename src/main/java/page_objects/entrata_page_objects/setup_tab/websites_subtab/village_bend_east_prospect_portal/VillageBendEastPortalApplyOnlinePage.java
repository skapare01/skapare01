package page_objects.entrata_page_objects.setup_tab.websites_subtab.village_bend_east_prospect_portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class VillageBendEastPortalApplyOnlinePage extends BasePage {
    private final By APPLY_ONLINE_APPLICATION_TYPE_DROPDOWN = By.cssSelector("#create_applicant > ul > li.vertform-item.select.company_application > div");
    private final By APPLY_ONLINE_APPLICATION_TYPE_SELECT_TEST_APPLICATION = By.xpath("//option[normalize-space()='ConventionalTestApplication']");
    private final By APPLY_ONLINE_FIRST_NAME_TEXT_BOX = By.id("applicant_first_name");
    private final By APPLY_ONLINE_LAST_NAME_TEXT_BOX = By.id("applicant_last_name");
    private final By APPLY_ONLINE_PHONE_NUMBER_TEXT_BOX = By.className("phone-number");
    private final By APPLY_ONLINE_ADD_PHONE_OPTION = By.id("add_phone");
    private final By APPLY_ONLINE_EMAIL_TEXT_BOX = By.id("applicant_username");
    private final By APPLY_ONLINE_PASSWORD_TEXT_BOX = By.id("applicant_password");
    private final By APPLY_ONLINE_CONFIRM_PASSWORD_TEXT_BOX = By.id("applicant_password_confirm");
    private final By APPLY_ONLINE_HOW_DID_YOU_HEAR_ABOUT_US_DROPDOWN = By.id("lead_source_field");
    private final By APPLY_ONLINE_HOW_DID_YOU_HEAR_ABOUT_US_DROPDOWN_SELECT_OTHER = By.xpath("//option[normalize-space()='other']");
    private final By APPLY_ONLINE_CREATE_ACCOUNT_BUTTON = By.id("create-app-btn");
    private final By APPLY_ONLINE_VERIFY_APPLICATION_CREATION = By.id("applicationSteps");

    public VillageBendEastPortalApplyOnlinePage(WebDriver driver) {
        super(driver);
    }

    public boolean applicationTypeDropdown() {
        return clickElement(APPLY_ONLINE_APPLICATION_TYPE_DROPDOWN);
    }
    public boolean applicationTypeDropdownSelectTestApplication() {
        return clickElement(APPLY_ONLINE_APPLICATION_TYPE_SELECT_TEST_APPLICATION);
    }
    public boolean firstNameTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_FIRST_NAME_TEXT_BOX, RandomGenerator.randomName());
    }
    public boolean lastNameTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_LAST_NAME_TEXT_BOX, RandomGenerator.randomName());
    }
    public boolean primaryPhoneNumberTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_PHONE_NUMBER_TEXT_BOX, RandomGenerator.randomPhoneNumber());
    }
    public boolean addPhoneNumberButtonIsVisible() {
        return confirmElementIsVisible(APPLY_ONLINE_ADD_PHONE_OPTION);
    }
    public boolean emailTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_EMAIL_TEXT_BOX, RandomGenerator.randomEmail());
    }
    public boolean passwordTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_PASSWORD_TEXT_BOX,"Password123");
    }
    public boolean confirmPasswordTextBoxSendKeys() {
        return sendKeysToElement(APPLY_ONLINE_CONFIRM_PASSWORD_TEXT_BOX,"Password123");
    }
    public boolean howDidYouHearAboutUsDropdown() {
        return clickElement(APPLY_ONLINE_HOW_DID_YOU_HEAR_ABOUT_US_DROPDOWN);
    }
    public boolean howDidYouHearAboutUsDropdownSelectOther() {
        return clickElement(APPLY_ONLINE_HOW_DID_YOU_HEAR_ABOUT_US_DROPDOWN_SELECT_OTHER);
    }
    public boolean createAccountBtn() {
        return clickElement(APPLY_ONLINE_CREATE_ACCOUNT_BUTTON);
    }
    public boolean applicationPageVerifyStepsBar() {
        return confirmElementIsVisible(APPLY_ONLINE_VERIFY_APPLICATION_CREATION, waitTimes.LONG_WAIT);
    }
}
