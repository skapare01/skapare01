package page_objects.entrata_page_objects.accounting_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AccountingNav extends BasePage {

    public AccountingNav(WebDriver driver) {
        super(driver);
    }

    //Top Accounting Tabs
    private final By MANAGEMENT_FEES_SUBTAB_BUTTON = By.cssSelector(".sub-nav li:nth-child(10)");
    private final By GL_EXPORT_BATCHES_TAB = By.linkText("GL Export Batches");
    private final By AP_EXPORT_BATCHES_TAB = By.linkText("AP Export Batches");

    //Accounting Navigation Methods
    public boolean clickManagementFeesSubtab() {
        return clickElement(MANAGEMENT_FEES_SUBTAB_BUTTON);
    }

    public boolean verifyManagementFeesSubtabVisibility() {return confirmElementIsVisible(MANAGEMENT_FEES_SUBTAB_BUTTON);}

    public boolean ConfirmVisibilityOfGLExportBatchesTab() {return confirmElementIsVisible(GL_EXPORT_BATCHES_TAB);}

    public boolean ClickGLExportBatchesTab() {return clickElement(GL_EXPORT_BATCHES_TAB);}

    public boolean confirmVisibilityOfAPExportBatchesTab() {return confirmElementIsVisible(AP_EXPORT_BATCHES_TAB);}

    public boolean clickAPExportsBatchesTab() {return clickElement(AP_EXPORT_BATCHES_TAB);}
}
