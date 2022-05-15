package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InsuranceSubTab extends BasePage {

    //Add/Update Tab
    private final By ADD_UPDATE_TAB = By.cssSelector("#esign_doc_sidetabs li:nth-child(1)");
    private final By ADD_UPDATE_PAGE = By.id("b_update_insurance_policies");
    //Verify Tab
    private final By VERIFY_TAB = By.cssSelector("#esign_doc_sidetabs li:nth-child(2)");
    private final By VERIFY_PAGE = By.id("b_unverified_insurance_policies");
    //Match Tab
    private final By MATCH_TAB = By.cssSelector("#esign_doc_sidetabs li:nth-child(3)");
    private final By MATCH_PAGE = By.id("b_unmatched_insurance_policies");
    //Expiring Soon Tab
    private final By EXPIRING_SOON_TAB = By.cssSelector("#esign_doc_sidetabs li:nth-child(4)");
    private final By EXPIRING_SOON_PAGE = By.id("b_about_to_expire_insurance_policies");

    //Constructor
    public InsuranceSubTab(WebDriver driver) {
        super(driver);
    }

    //Add/Update Tab Methods
    public boolean clickAddUpdate() { return clickElement(ADD_UPDATE_TAB); }

    public boolean findAddUpdatePage() { return confirmElementIsVisible(ADD_UPDATE_PAGE); }

    //Verify Tab Methods
    public boolean clickVerify() { return clickElement(VERIFY_TAB); }

    public boolean findVerifyPage() { return confirmElementIsVisible(VERIFY_PAGE); }

    //Match Tab Methods
    public boolean clickMatch() { return clickElement(MATCH_TAB); }

    public boolean findMatchPage() { return confirmElementIsVisible(MATCH_PAGE); }

    //Expiring Soon Tab Methods
    public boolean clickExpiringSoon() { return clickElement(EXPIRING_SOON_TAB); }

    public boolean findExpiringSoonPage() { return confirmElementIsVisible(EXPIRING_SOON_PAGE); }




}
