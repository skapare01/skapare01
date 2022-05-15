package page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddDatabaseDRFailoverCurtainPage extends BasePage {
    public AddDatabaseDRFailoverCurtainPage(WebDriver driver) {
        super(driver);
    }

    //Locators In Add Database DR Failover Curtain Page:
    private final By CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER = By.cssSelector("i.close-button.close[onclick='psi.patterns.closeLargeDialog();']");
    private final By ADD_DATABASE_DR_FAILOVER_TEXT_IN_HEADER = By.xpath("//h1[text()='Add Database DR Failover']");
    private final By DEPLOYMENT_INFORMATION_TEXT_IN_SUBHEADER = By.xpath("//h6[text()='Deployment Information']");
    private final By FAILOVER_TYPE_FAILOVER_TO_MASTER_OPTION = By.cssSelector("input#failover_type[value='failover_to_master']");
    private final By FAILOVER_TYPE_FAILOVER_TO_DR_OPTION = By.cssSelector("input#failover_type[value='failover_to_dr']");
    private final By SELECT_ALL_DATABASES_CHECKBOX = By.id("check_all_databases");
    private final By MASTER_DATABASES_TEXT_LOCATOR = By.xpath("//b[text()='Master Database(s)']");
    private final By SLAVE_DATABASES_TEXT_LOCATOR = By.xpath("//b[text()='Slave Database(s)']");
    private final By GREEN_SUBMIT_BUTTON = By.cssSelector("input.form-submit[value='Submit']");
    private final By BLUE_CANCEL_LINK = By.linkText("Cancel");


    //Methods For Locators In Add Database DR Failover Curtain Page:
    public boolean confirmCloseXButtonIsPresent() {
        return confirmElementIsVisible(CLOSE_X_BUTTON_IN_TOP_RIGHT_CORNER);
    }

    public boolean confirmAddDatabaseDR_FailoverTextIsPresent() {
        return confirmElementIsVisible(ADD_DATABASE_DR_FAILOVER_TEXT_IN_HEADER);
    }

    public boolean confirmDeploymentInformationTextIsPresent() {
        return confirmElementIsVisible(DEPLOYMENT_INFORMATION_TEXT_IN_SUBHEADER);
    }

    public boolean confirmFailoverToMasterOptionIsPresent() {
        return confirmElementIsVisible(FAILOVER_TYPE_FAILOVER_TO_MASTER_OPTION);
    }

    public boolean confirmFailoverToDR_OptionIsPresent() {
        return confirmElementIsVisible(FAILOVER_TYPE_FAILOVER_TO_DR_OPTION);
    }

    public boolean confirmSelectAllDatabasesCheckboxIsPresent() {
        return confirmElementIsVisible(SELECT_ALL_DATABASES_CHECKBOX);
    }

    public boolean confirmMasterDatabasesTextIsPresent() {
        return confirmElementIsVisible(MASTER_DATABASES_TEXT_LOCATOR);
    }

    public boolean confirmSlaveDatabasesTextIsPresent() {
        return confirmElementIsVisible(SLAVE_DATABASES_TEXT_LOCATOR);
    }

    public boolean confirmGreenSubmitButtonIsPresent() {
        return confirmElementIsVisible(GREEN_SUBMIT_BUTTON);
    }

    public boolean clickBlueCancelLink() {
        return clickElement(BLUE_CANCEL_LINK);
    }
}
