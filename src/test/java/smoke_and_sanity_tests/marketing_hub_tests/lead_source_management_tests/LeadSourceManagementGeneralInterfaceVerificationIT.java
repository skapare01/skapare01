package smoke_and_sanity_tests.marketing_hub_tests.lead_source_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab.CompanyLeadSourcesSubtab;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab.LeadsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.marketing_tab.PropertyLeadSourcesSubtab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.marketing_tab.MarketingNav;

import static org.junit.Assert.assertTrue;

public class LeadSourceManagementGeneralInterfaceVerificationIT extends BaseBrowserTest {

    public LeadSourceManagementGeneralInterfaceVerificationIT() {
        super("demoold");
    }

    //Manual Test ID 3175834

    @Test
    public void shouldDisplayLeadSourceManagementCompanyLevelUI_whenContractEnabled() {
        EntrataNavBar setupTab = new EntrataNavBar(driver);
        //Navigate to Lead Sources Tab in Company Settings
        assertTrue("Failed to navigate to 'Setup' Tab in Entrata.",
                setupTab.clickSetupButton());

        CompanyFirstLevelNavigation leadsTab = new CompanyFirstLevelNavigation(driver);
        //Navigate to Leads Tab in Company Settings
        assertTrue("Failed to navigate to 'Leads' Tab in Company Settings.",
                leadsTab.clickLeadsTab());

        LeadsNav leadSourcesTab = new LeadsNav(driver);
        //Navigate to Lead Sources Sub-tab in Company Settings
        assertTrue("Failed to navigate to 'Lead Sources' sub tab in Company Settings.",
                leadSourcesTab.navigateToLeadSourcesSubTab_CompanySettings());

        CompanyLeadSourcesSubtab sourcesSubtab = new CompanyLeadSourcesSubtab(driver);
        //Verification of Company Level Lead Sources tab elements and filters
        assertTrue("Failed to locate 'Search Property' filter box in Company Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesSearchPropertyFilterInCompanyLevel());
        assertTrue("Failed to locate 'Select Property' dropdown filter in Company Level Lead Sources tab.",
                sourcesSubtab.findSelectPropertyDropdownFilter_CompanyLevel());
        assertTrue("Failed to locate 'Lead Source' filter button in Company Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesFilterButton_CompanyLevel());
        assertTrue("Failed to locate 'Lead Sources' 'Reset' link button in Company Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesResetFilterLink_CompanyLevel());
        assertTrue("Failed to locate 'Hide Inactive Lead Sources' toggle in Company Level Lead Sources tab.",
                sourcesSubtab.findHideInactiveLeadSourcesToggle_CompanyLevel());
        assertTrue("Failed to locate 'Add Lead Source' button in Company Level Lead Sources tab.",
                sourcesSubtab.findAddLeadSourceButton_CompanyLevel());
        //Verification of Company Level Lead Sources List elements and Column Headers
        assertTrue("Failed to locate 'Lead Sources' list in Company Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesList_CompanyLevel());
        assertTrue("Failed to locate 'Active' column header in Company Level Lead Sources tab.",
                sourcesSubtab.findActiveColumnHeader_CompanyLevel());
        assertTrue("Failed to locate 'Source' column header in Company Level Lead Sources tab.",
                sourcesSubtab.findSourceColumnHeader_CompanyLevel());
        assertTrue("Failed to locate 'Associated ILS' column header in Company Level Lead Sources tab.",
                sourcesSubtab.findAssociatedILSColumnHeader_CompanyLevel());
        assertTrue("Failed to locate 'Pages' in Company Level Lead Sources tab.",
                sourcesSubtab.confirmPagesVisibleOnLeadSourceListPage_CompanyLevel());
    }

    @Test
    public void shouldDisplayLeadSourceManagementPropertyLevelUI_whenContractEnabled() {
        EntrataNavBar setupTab = new EntrataNavBar(driver);
        //Navigate to Lead Sources Tab in Property Settings
        assertTrue("Failed to navigate to 'Setup' Tab in Entrata.",
                setupTab.clickSetupButton());
        assertTrue("Failed to navigate to 'Properties' sub tab under Setup tab.",
                setupTab.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        //Select Property in Property List
        assertTrue("Failed to locate and select '13th North Parkways' property from Property List.",
                propList.selectThirteenthNorthParkwaysPropertyInList());

        PropertyFirstLevelNavigation propSettingsNav = new PropertyFirstLevelNavigation(driver);
        //Navigate to Marketing Tab in Property Settings
        assertTrue("Failed to navigate to 'Marketing' tab in Property settings.",
                propSettingsNav.clickMarketingTab());

        MarketingNav mNav = new MarketingNav(driver);
        //Navigate to Lead Sources Sub-tab in Property Settings
        assertTrue("Failed to navigate to 'Lead Sources' sub tab in Property settings.",
                mNav.clickLeadSourcesTab());

        PropertyLeadSourcesSubtab sourcesSubtab = new PropertyLeadSourcesSubtab(driver);
        //Verification of Property Level Lead Sources tab elements and filters
        assertTrue("Failed to locate 'Search Property' filter box in Property Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesSearchFilterInPropertyLevel());
         assertTrue("Failed to locate 'Lead Source' filter button in Property Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesFilterButton_PropertyLevel());
        assertTrue("Failed to locate 'Lead Sources' 'Reset' link button in Property Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesResetFilterLink_PropertyLevel());
         assertTrue("Failed to locate 'Add Lead Source' button in Property Level Lead Sources tab.",
                sourcesSubtab.findAddLeadSourceButton_PropertyLevel());
        //Verification of Property Level Lead Sources List elements and Column Headers
        assertTrue("Failed to locate 'Lead Sources' list in Property Level Lead Sources tab.",
                sourcesSubtab.findLeadSourcesList_PropertyLevel());
        assertTrue("Failed to locate 'Lead Source ID' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findIDColumnHeader_PropertyLevel());
        assertTrue("Failed to locate 'Name' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findNameColumnHeader_PropertyLevel());
        assertTrue("Failed to locate 'ILS' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findILSColumnHeader_PropertyLevel());
        assertTrue("Failed to locate 'Vanity Number' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findVanityNumberColumnHeader_PropertyLevel());
        assertTrue("Failed to locate 'SMS Keyword' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findSMSKeywordColumnHeader_PropertyLevel());
        assertTrue("Failed to locate 'Visible' column header in Property Level Lead Sources tab.",
                sourcesSubtab.findVisibleColumnHeader_PropertyLevel());
        //Verification of Property Level Lead Sources action buttons
        assertTrue("Failed to locate 'Metrics' button on Lead Source in Property Level Lead Sources tab.",
                sourcesSubtab.findLeadSourceMetricsButton_PropertyLevel());
        assertTrue("Failed to locate 'Edit' button on Lead Source in Property Level Lead Sources tab.",
                sourcesSubtab.findEditLeadSourceButton_PropertyLevel());
        assertTrue("Failed to locate 'Delete' button on Lead Source in Property Level Lead Sources tab.",
                sourcesSubtab.findDeleteLeadSourceButton_PropertyLevel());
    }

}
