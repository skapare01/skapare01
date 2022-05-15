package page_objects.entrata_page_objects.accounting_tab.management_fees_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GenerateManagementFeesPage extends BasePage {

    private final By MANAGEMENT_FEES_TABLE = By.id("tbl_generated_management_fees");
    private final By GENERATE_MANAGEMENT_FEES_BUTTON = By.id("navigation_item_view_management_fees");
    private final By GENERATE_MANAGEMENT_TOOLS = By.id("navigation_item_generate_fees");
    private final By CANCEL_BUTTON_ON_GENERATE_MANAGEMENT_FEES_POPUP = By.id("cancel_popup");
    private final By GENERATE_MANAGEMENT_FEES_POPUP_SELECTED_PROPERTIES_LIST = By.id("management_fees_filterproperty_group_ids");
    private final By CONTINUE_BUTTON = By.id("filter_pending_management_fees");
    private final By MANAGEMENT_FEES_CONTAINER = By.id("view_management_fees_container");
    private final By SELECT_ALL_PROPERTIES_CHECKBOX = By.id("checkAll");
    private final By GENERATE_ALL_MANAGEMENT_FEES_BUTTON = By.cssSelector("a[class='button action generate rights-edit']");

    public GenerateManagementFeesPage(WebDriver driver) {
        super (driver);
    }

    public boolean verifyManagementFeesTableIsVisible() {
        return confirmElementIsVisible(MANAGEMENT_FEES_TABLE);
    }

    public boolean clickGenerateManagementFeesButton() {
        return clickElement(GENERATE_MANAGEMENT_FEES_BUTTON);
    }

    public boolean hoverGenerateManagementFeesButton() {
        return moveToAnElementWithActions(GENERATE_MANAGEMENT_TOOLS);
    }

    public boolean clickCancelGenerateManagementFee() {
        return clickElement(CANCEL_BUTTON_ON_GENERATE_MANAGEMENT_FEES_POPUP);
    }

    public boolean verifyGenerateManagementFeesPopup() {
        return clickElement(GENERATE_MANAGEMENT_FEES_POPUP_SELECTED_PROPERTIES_LIST);
    }

    public boolean clickContinueGeneratingManagementFees() {
        return clickElement(CONTINUE_BUTTON);
    }

    public boolean verifyManagementFeesContainer() {
        return confirmElementIsVisible(MANAGEMENT_FEES_CONTAINER);
    }

    public boolean clickSelectAllPropertiesCheckBox() {
        return clickElement(SELECT_ALL_PROPERTIES_CHECKBOX);
    }

    public boolean clickGenerateAllManagementFeesButton() {
        return clickElement(GENERATE_ALL_MANAGEMENT_FEES_BUTTON);
    }

}
