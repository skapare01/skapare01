package page_objects.deploy_admin_page_objects.it_tab.maintenance_subtab.add_maintenace_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddMaintenanceCurtainPage extends BasePage {
    public AddMaintenanceCurtainPage(WebDriver driver) {
        super(driver);
    }

    //Add Maintenance Curtain Page Locators:
    private final By CANCEL_LINK_FOR_ADD_MAINTENANCE_CURTAIN_PAGE = By.cssSelector("a[onclick='javascript:psi.patterns.closeLargeDialog();return false;']");

    //Add Maintenance Curtain Page Methods:
    public boolean clickCancelLinkForAddMaintenanceCurtainPage() { return clickElement(CANCEL_LINK_FOR_ADD_MAINTENANCE_CURTAIN_PAGE); }
}
