package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentsNav extends BasePage {

    public ResidentsNav(WebDriver driver) {
        super(driver);}

    private final By MOVE_IN_TAB = By.id("property_residents_movein_moveinxxx");
    private final By MOVE_OUT_TAB = By.id("property_residents_moveoutxxx");
    private final By TRANSFER_MODIFICATIONS_TAB = By.id("property_residents_transfersxxx");
    private final By RESIDENT_PORTAL_TAB = By.id("property_residents_rpxxx");


    public boolean clickMoveInTab(){return clickElement(MOVE_IN_TAB);}
    public boolean clickMoveOutTab(){return clickElement(MOVE_OUT_TAB);}
    public boolean clickTransferModificationsTab() {
        return clickElement(TRANSFER_MODIFICATIONS_TAB, waitTimes.LONG_WAIT);
    }
    public boolean clickResidentPortalTab() { return doubleClickElement(RESIDENT_PORTAL_TAB);}
}
