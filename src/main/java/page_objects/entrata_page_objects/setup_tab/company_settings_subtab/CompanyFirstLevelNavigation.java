package page_objects.entrata_page_objects.setup_tab.company_settings_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyFirstLevelNavigation extends BasePage {

    public CompanyFirstLevelNavigation(WebDriver driver) {
        super(driver);
    }

    //Tab Names
    private final By GENERAL_TAB = By.id("li_nav_general_setupxxx");
    private final By WEBSITES_TAB = By.id("li_nav_websites_setupxxx");
    private final By LEADS_TAB = By.id("li_nav_leads_setupxxx");
    private final By LEASING_TAB = By.id("li_nav_leasingxxx");
    private final By RESIDENTS_TAB = By.id("li_nav_residents_setupxxx");
    private final By FINANCIAL_TAB = By.id("li_nav_financial_setupxxx");
    private final By COMPANY_TAB = By.id("li_nav_company_company_setupxxx");
    private final By COMMUNICATION_TAB = By.id("li_nav_communication_setupxxx");
    private final By DATA_MANAGEMENT_TAB = By.id("li_nav_data_managementxxx");
    private final By DOCUMENTS_TAB = By.id("li_nav_setup_system_documents_tab");
    private final By PRIVACY_MANAGEMENT_TAB = By.id("li_nav_privacy_toolsxxx");

    //Tab Navigation Methods
    public boolean clickGeneralTab() {
        return clickElement(GENERAL_TAB);
    }

    public boolean clickWebsitesTab() {
        return clickElement(WEBSITES_TAB);
    }

    public boolean clickLeadsTab() {
        return clickElement(LEADS_TAB);
    }

    public boolean clickLeasingTab() {
        return clickElement(LEASING_TAB);
    }

    public boolean clickResidentsTab() {
        return clickElement(RESIDENTS_TAB);
    }

    public boolean clickFinancialTab() {
        return clickElement(FINANCIAL_TAB);
    }

    public boolean clickCompanyTab() {
        return clickElement(COMPANY_TAB);
    }

    public boolean clickCommunicationTab() {
        return clickElement(COMMUNICATION_TAB);
    }

    public boolean clickDataManagementTab() {
        return clickElement(DATA_MANAGEMENT_TAB);
    }

    public boolean clickDocumentsTab() {
        return clickElement(DOCUMENTS_TAB);
    }

    public boolean clickPrivacyManagementTab() {
        return clickElement(PRIVACY_MANAGEMENT_TAB);
    }

    //Tab Verification Methods
    public boolean verifyFinancialTab() {
        return confirmElementIsVisible(FINANCIAL_TAB);
    }

}