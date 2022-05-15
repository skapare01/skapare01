package page_objects.client_admin_page_objects.hr_tab.employee_policies_subtab;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import page_objects.BasePage;

import java.io.File;

public class AddPolicyPage extends BasePage {

    public AddPolicyPage(WebDriver driver) {
        super(driver);
    }

    private final By POLICY_NAME = By.name("policy[name]");
    private final By POLICY_DESCRIPTION = By.name("policy[description]");
    private final By POLICY_DESIGNATIONS_DROPDOWN = By.id("Designations_multiselect");
    private final By POLICY_DESIGNATIONS_ALL_OPTION = By.id("Designations_option_0");
    private final By POLICY_EMPLOYEE_DROPDOWN = By.id("Employees_multiselect");
    private final By POLICY_EMPLOYEE_ALL_OPTION = By.id("Employees_option_0");
    private final By POLICY_STATES_DROPDOWN = By.id("States_multiselect");
    private final By POLICY_STATES_ALL_OPTION = By.id("States_option_0");
    private final By POLICY_PDF_UPLOAD = By.id("policy_pdf");
    private final By POLICY_PUBLISH_CHECKBOX = By.name("policy[is_published]");
    private final By PUBLISH_DIV = By.cssSelector("div[class='div-policy-type-default aRow']");
    private final By SAVE_POLICY = By.id("submit_policy");
    private final By POLICY_SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");
    private final By DROPDOWN_BAR_OPEN = By.cssSelector("div[class='form-multiselect margin0-bottom designation binded binded-hover-intent open']");
    private final By MODAL_TITLE_SPAN = By.id("ui-id-1");


    public boolean policyNameInput(String name) {
        return sendKeysToElement(POLICY_NAME, name);
    }

    public boolean policyDescriptionInput(String input) {
        return sendKeysToElement(POLICY_DESCRIPTION, input);
    }

    public boolean policyDesignationDropdownClick() {
        return clickElement(POLICY_DESIGNATIONS_DROPDOWN);
    }

    public boolean policyDesignationAllOptionClick() {
        return clickElement(POLICY_DESIGNATIONS_ALL_OPTION);
    }

    public boolean policyEmployeeDropdownClick() {
        return clickElement(POLICY_EMPLOYEE_DROPDOWN);
    }

    public boolean policyEmployeeAllOptionClick() {
        return clickElement(POLICY_EMPLOYEE_ALL_OPTION);
    }

    public boolean policyStatesDropdownClick() {
        return clickElement(POLICY_STATES_DROPDOWN);
    }

    public boolean policyStatesAllOptionClick() {
        return clickElement(POLICY_STATES_ALL_OPTION);
    }

    public boolean moveToPolicyFileUpload() {
        return moveToAnElementWithActions(POLICY_PDF_UPLOAD);
    }

    public boolean policyFileUpload() {
        File myFile = new File("src/main/java/resources/test.pdf");
        String path = myFile.getAbsolutePath();

        waitForDropdownsToDisappear();
        return sendKeysToElement(POLICY_PDF_UPLOAD, path);
    }

    public boolean moveToPublishCheckbox() {
        return moveToAnElementWithActions(PUBLISH_DIV);
    }

    public boolean policyPublishCheckboxClick() {
        return clickElement(POLICY_PUBLISH_CHECKBOX);
    }

    public boolean savePolicyButtonCLick() {
        return clickElement(SAVE_POLICY);
    }

    public boolean policySuccessBannerVisible() {
        return confirmElementIsVisible(POLICY_SUCCESS_BANNER, waitTimes.LONG_WAIT);
    }

    public boolean policyFormClick() {
        return moveToAnElementWithActions(MODAL_TITLE_SPAN, waitTimes.LONG_WAIT);
    }

    //This method waits for the dropdowns to vanish. Otherwise, it can't find the checkbox at the end and fail the test.
    private void waitForDropdownsToDisappear() {
        waitForOverlay(DROPDOWN_BAR_OPEN, waitTimes.SHORT_WAIT);
    }
}
