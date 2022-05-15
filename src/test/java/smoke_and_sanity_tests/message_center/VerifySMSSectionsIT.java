package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.general.TextMessagingSubTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class VerifySMSSectionsIT extends BaseBrowserTest {


    public VerifySMSSectionsIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifySMSSectionAvailable_whenInPropertySettingsAndResidentProfile() {
    // Message Center Test Case - "2255514 - Verify SMS section."

        //Navigating to Setup>Company then Properties, and selecting the "Cavalier Court" property
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Company Level Settings!", useEntrataNavBar.clickSetupButton());
        PropertySetup usePropertySettings = new PropertySetup(driver);
        assertTrue("Unable to navigate to the property settings page!", usePropertySettings.navigateToPropertySettings());
        assertTrue("Unable to select the \"Cavalier Court\" Property!", usePropertySettings.selectCavalierCourtProperty());
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        //Navigating to Property>Communication>Text Messaging sub-tab
        assertTrue("Unable to navigate to the Property Communication Settings!", propertyFirstLevelNavigation.clickCommunicationTab());
        TextMessagingSubTab useTextMessagingSubTab = new TextMessagingSubTab(driver);
        assertTrue("Unable to navigate to the \"Text Messaging\" sub-tab in Property Settings!", useTextMessagingSubTab.clickTextMessagingSubTab());
        //Locating the headers for the Text Messaging sub-tab page
        assertTrue("Unable to locate the \"Text Keywords\" Header in Property Settings>Communication>Text Messaging!", useTextMessagingSubTab.findTextKeywordsHeader());
        assertTrue("Unable to locate the \"Opt-in Preference\" Header in Property Settings>Communication>Text Messaging!", useTextMessagingSubTab.findOptInPreferenceHeader());
        //Closing the Property settings and navigating to the Residents>All Residents tab
        assertTrue("Unable to use the Close Option from the property Settings!", usePropertySettings.selectCloseButtonFromPropertySettings());
        assertTrue("Unable to navigate to the Residents tab!", useEntrataNavBar.clickResidentsTab());
        AllResidentFilterPage useResidentsFiltersNav = new AllResidentFilterPage(driver);
        //Using the Residents filters to search for a Resident who is opted in to Text Messaging
        assertTrue("Unable to use the Residents tab filter!", useResidentsFiltersNav.selectResidentsFilters());
        assertTrue("Unable to Remove the Selected Property from the Property Filter!", useResidentsFiltersNav.removePropertyFromPropertyFilter());
        assertTrue("Unable to use the 'Add' button for the 'Selected Properties' section of the Property Filter!", useResidentsFiltersNav.useAddPropertyButton());
        assertTrue("Unable to send keys to the Selected Properties filter textbox!", useResidentsFiltersNav.selectAndSendKeysToPropertyNameFilterCavalierCourt());
        assertTrue("Unable to use the \"Add\" Green Plus button for the Selected Property(s) in the Property Filter!", useResidentsFiltersNav.useAddPropertyButtonFromPropertyFilterCavalierCourt());
        assertTrue("Unable to select the \"Name, Email, or ID\" Residents>Filters textbox!", useResidentsFiltersNav.selectResidentsFilterBoxArea());
        assertTrue("Unable to select and send keys to the Residents>Filters>Resident Name textbox!", useResidentsFiltersNav.selectAndSendKeysToResidentNameFilterTextBoxQuintonTucker());
        assertTrue("Unable to filter for the Resident(s) in Residents>Filters>Resident>Filter Residents", useResidentsFiltersNav.selectFilterResidentsFilterOption());
        AllResidentsPage useAllResidentsPage = new AllResidentsPage(driver);
        //Selecting the Filtered resident, and locating and clicking the "Text Message" option in their profile
        assertTrue("Unable to select the filtered Resident in Residents>All Residents", useAllResidentsPage.selectSingleFilteredResidentTuckerQuinton());
        ResidentProfileCurtainPage useResidentProfileCurtainPage = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to find the \"Text Message\" option in the Resident's Profile in Residents>All Residents>Profile", useResidentProfileCurtainPage.clickSMSProfileOption());
    }
}