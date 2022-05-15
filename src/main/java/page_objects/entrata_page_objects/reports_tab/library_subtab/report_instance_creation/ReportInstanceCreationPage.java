package page_objects.entrata_page_objects.reports_tab.library_subtab.report_instance_creation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;
import utils.RandomGenerator;

public class ReportInstanceCreationPage extends ReportsBasePage {
    RandomGenerator randomGenerator = new RandomGenerator();

    //Locators:
    private final By INSTANCE_NAME_FIELD_LOCATOR = By.cssSelector("input[class='form-field']");
    private final String RANDOM_REPORT_INSTANCE_NAME = randomGenerator.randomName();
    private final String RANDOM_GROUP_NAME = randomGenerator.randomName();
    private final By ADD_GROUP_LINK_LOCATOR = By.xpath("//a[text()='Add Group']");
    private final By GROUP_NAME_FIELD_LOCATOR = By.cssSelector("input[name='report_group[name]']");
    private final By GREEN_SAVE_GROUP_BUTTON_LOCATOR = By.cssSelector("input[class='form-submit js-submit-group']");
    private final By COMPANY_GROUP_CHECKBOX_LOCATOR = By.id("js-company-group-header");
    private final By COMPANY_USER_CHECKBOX_LOCATOR = By.id("js-company-user-header");
    private final By GREEN_SAVE_INSTANCE_BUTTON_LOCATOR = By.cssSelector("a[class='button small green right js-insert-update-instance clearfix']");
    private final By SUCCESS_MESSAGE_LOCATOR = By.cssSelector("p[class='alert success slim']");
    private final By CREATE_INSTANCE_OVERLAY = By.cssSelector("div.loading-overlay.bg-img-medium[data-content-selector='#view-data-filters']");
    private final By ADD_REPORT_GROUP_OVERLAY = By.cssSelector("div.loading-overlay.bg-img-medium[data-content-selector='#mod']");

    //Constructor method:
    public ReportInstanceCreationPage (WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean clearInstanceNameField() {
        waitForCreateInstanceOverlay();
        return elementClearTextField(INSTANCE_NAME_FIELD_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean addRandomNameToReportInstanceField() {
        return sendKeysToElement(INSTANCE_NAME_FIELD_LOCATOR, RANDOM_REPORT_INSTANCE_NAME, waitTimes.LONG_WAIT);
    }

    public boolean clickBlueAddGroupLink() {
        return clickElement(ADD_GROUP_LINK_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean addRandomNameToGroupNameField() {
        waitForAddReportGroupOverlay();
        return sendKeysToElement(GROUP_NAME_FIELD_LOCATOR, RANDOM_GROUP_NAME, waitTimes.LONG_WAIT);
    }

    public boolean clickGreenSaveGroupButton() {
        return clickElement(GREEN_SAVE_GROUP_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickCheckBoxForCompanyGroups() {
        return clickElement(COMPANY_GROUP_CHECKBOX_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickCheckBoxForCompanyUsers() {
        return clickElement(COMPANY_USER_CHECKBOX_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickGreenSaveInstanceButton() {
        return clickElement(GREEN_SAVE_INSTANCE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmGreenBannerSuccessMessageAppearsAfterInstanceIsCreated() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_LOCATOR, waitTimes.LONG_WAIT);
    }

    //Overlay methods:
    private void waitForCreateInstanceOverlay() {
        waitForOverlay(CREATE_INSTANCE_OVERLAY, waitTimes.SHORT_WAIT);
    }
    private void waitForAddReportGroupOverlay() {
        waitForOverlay(ADD_REPORT_GROUP_OVERLAY, waitTimes.SHORT_WAIT);
    }
}
