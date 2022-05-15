package page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddDatabaseMaintenanceCurtainPage extends BasePage {
    public AddDatabaseMaintenanceCurtainPage(WebDriver driver) {
        super(driver);
    }

    //Locators In Add Database Maintenance Curtain Page:
    private final By CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER = By.cssSelector("i.close-button.close[onclick='psi.patterns.closeLargeDialog();']");
    private final By ADD_DATABASE_MAINTENANCE_TEXT_IN_HEADER = By.xpath("//*[text()='Add Database Maintenance']");
    private final By DEPLOYMENT_INFORMATION_TEXT_IN_SUBHEADER = By.xpath("//*[text()='Deployment Information']");
    private final By DATABASE_MAINTENANCE_TEXT_FOR_DEPLOYMENT_TYPE_FIELD = By.cssSelector("dd.pad5-top[style='margin-top: 4px;']");
    private final By SCHEDULED_DATE_FIELD = By.id("scheduled_date");
    private final By SCOPE_PRIVATE_RADIO_BUTTON_OPTION = By.cssSelector("input#scope[value='private']");
    private final By SCOPE_PUBLIC_RADIO_BUTTON_OPTION = By.cssSelector("input#scope[value='public']");
    private final By SCOPE_ALL_RADIO_BUTTON_OPTION = By.cssSelector("input#scope[value='all']");
    private final By STATUS_ON_RADIO_BUTTON_OPTION = By.cssSelector("input#status[value='on']");
    private final By STATUS_OFF_RADIO_BUTTON_OPTION = By.cssSelector("input#status[value='off']");
    private final By DATABASE_TYPE_MASTER_RADIO_BUTTON_OPTION = By.cssSelector("input.form-radio.databaseType[value='1']");
    private final By DATABASE_TYPE_SLAVE_RADIO_BUTTON_OPTION = By.cssSelector("input.form-radio.databaseType[value='0']");
    private final By DATABASES_SELECT_ALL_CHECKBOX = By.id("check_all_databases");
    private final By DESCRIPTION_TEXT_FIELD = By.id("description");
    private final By GREEN_SUBMIT_BUTTON = By.cssSelector("input.form-submit[onclick='MaintenanceModule.submitDatabaseMaintance();']");
    private final By BLUE_CANCEL_LINK = By.linkText("Cancel");


    //Methods For Locators In Add Database Maintenance Curtain Page:
    public boolean confirmCloseXButtonInTopRightCornerIsPresent() {
        return confirmElementIsVisible(CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER);
    }

    public boolean confirmAddDatabaseMaintenanceTextIsPresentInHeader() {
        return confirmElementIsVisible(ADD_DATABASE_MAINTENANCE_TEXT_IN_HEADER);
    }

    public boolean confirmDeploymentInformationTextIsPresentInSubheader() {
        return confirmElementIsVisible(DEPLOYMENT_INFORMATION_TEXT_IN_SUBHEADER);
    }

    public boolean confirmDatabaseMaintenanceTextIsPresentForDeploymentTypeField() {
        return confirmElementIsVisible(DATABASE_MAINTENANCE_TEXT_FOR_DEPLOYMENT_TYPE_FIELD);
    }

    public boolean confirmScheduledDateFieldIsPresent() {
        return confirmElementIsVisible(SCHEDULED_DATE_FIELD);
    }

    public boolean confirmPrivateRadioButtonOptionIsPresentForScopeField() {
        return confirmElementIsVisible(SCOPE_PRIVATE_RADIO_BUTTON_OPTION);
    }

    public boolean confirmPublicRadioButtonOptionIsPresentForScopeField() {
        return confirmElementIsVisible(SCOPE_PUBLIC_RADIO_BUTTON_OPTION);
    }

    public boolean confirmAllRadioButtonOptionIsPresentForScopeField() {
        return confirmElementIsVisible(SCOPE_ALL_RADIO_BUTTON_OPTION);
    }

    public boolean confirmOnRadioButtonOptionIsPresentForStatusField() {
        return confirmElementIsVisible(STATUS_ON_RADIO_BUTTON_OPTION);
    }

    public boolean confirmOffRadioButtonOptionIsPresentForStatusField() {
        return confirmElementIsVisible(STATUS_OFF_RADIO_BUTTON_OPTION);
    }

    public boolean confirmMasterRadioButtonOptionIsPresentForDatabaseTypeField() {
        return confirmElementIsVisible(DATABASE_TYPE_MASTER_RADIO_BUTTON_OPTION);
    }

    public boolean confirmSlaveRadioButtonOptionIsPresentForDatabaseTypeField() {
        return confirmElementIsVisible(DATABASE_TYPE_SLAVE_RADIO_BUTTON_OPTION);
    }

    public boolean confirmSelectAllCheckboxIsPresentForDatabasesField() {
        return confirmElementIsVisible(DATABASES_SELECT_ALL_CHECKBOX);
    }

    public boolean confirmDescriptionTextFieldIsPresent() {
        return confirmElementIsVisible(DESCRIPTION_TEXT_FIELD);
    }

    public boolean confirmGreenSubmitButtonIsPresent() {
        return confirmElementIsVisible(GREEN_SUBMIT_BUTTON);
    }

    public boolean clickBlueCancelLinkAtBottomOfCurtainPage() {
        return clickElement(BLUE_CANCEL_LINK);
    }
}
