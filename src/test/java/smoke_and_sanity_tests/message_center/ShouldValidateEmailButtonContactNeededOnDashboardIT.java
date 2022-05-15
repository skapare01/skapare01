package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.DashboardFilters;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.ContactNeededResidentsSubtab;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.NotProgressingResidentsSubtab;

import static junit.framework.Assert.assertTrue;

public class ShouldValidateEmailButtonContactNeededOnDashboardIT extends BaseBrowserTest {


    public ShouldValidateEmailButtonContactNeededOnDashboardIT() { super("dittmarcompany"); }


    @Test
    public void shouldValidateEmailButtonAndContactNeededSelections_whenOnTheResidentDashboard() {
        // 2223789 - To validate email button on resident tab in dashboard section.

        //Using the Dashboard Filters to Remove "All Properties"
        DashboardFilters useDashboardFilters = new DashboardFilters(driver);
        assertTrue("Unable to click the \"Filter\" sidebar button", useDashboardFilters.clickOpenFilterButton());
        assertTrue("Unable to click the Red \"X\" button to remove the \"All Properties\" selection!", useDashboardFilters.clickRemovePropertyAllProperties());
        //Using the Add Button and locating + selecting the Cherry Hill Property, then filtering Results
        assertTrue("Unable to click the \"Add\" button for the property search", useDashboardFilters.clickAddPropertiesButton());
        assertTrue("Unable to click and send keys for the \"Cherry Hill\" property in the property search text bar!", useDashboardFilters.clickAndSendKeysToPropertyListSearchTextBarCherryHill());
        assertTrue("Unable to click the \"Cherry Hill\" searched property result in the property search popup box!", useDashboardFilters.clickAddPropertyCherryHill());
        assertTrue("Unable to click the \"Filter\" button to search the selected property result(s) in the Property filters!", useDashboardFilters.clickFilterResultsButton());
        MyDashboardNav useMyDashboardNav = new MyDashboardNav(driver);
        assertTrue("Unable to navigate to the Dashboard -> \"Residents\" -> \"Contact Needed\" sub tab!", useMyDashboardNav.clickResidentsTab());
        //Moving to Contact Needed, locating the first result, and using the send email + close buttons to verify option is available for use
        ContactNeededResidentsSubtab useContactNeededResidentsSubtab = new ContactNeededResidentsSubtab(driver);
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Send an Email\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickSendAnEmailWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromCurtain());
        //Using the "Contact" button for the "Enter an Outgoing Call" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Enter an Outgoing Call\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickEnterAnOutgoingCallWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Using the "Contact" button for the "Resident Visit" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Resident Visit\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickResidentVisitWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Using the "Contact" button for the "Incoming Call" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Incoming Call\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickEnterAnIncomingCallWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Using the "Contact" button for the "Incoming Email" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Incoming Email\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickEnterAnIncomingEmailWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Using the "Contact" button for the "Incoming Text" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Incoming Text\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickEnterAnIncomingTextWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Using the "Contact" button for the "Outgoing Text" Option then closing
        assertTrue("Unable to click the \"Contact\" Dropdown for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickContactDropdownFirstEntry());
        assertTrue("Unable to click the \"Outgoing Text\" Dropdown option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickEnterAnOutgoingTextWhatsNextOption());
        assertTrue("Unable to click the \"Close\" option for the first Contact Needed Entry!", useContactNeededResidentsSubtab.clickCloseButtonFromPopup());
        //Moving to Residents "Not Progressing" subtab, and verifying we can use the "Send an Email" button for the first result
        assertTrue("Unable to click the Residents -> \"Not Progressing\" subtab option in the My Dashboard section!", useMyDashboardNav.clickResidentsNotProgressingSubTab());
        NotProgressingResidentsSubtab useNotProgressingResidentsSubtab = new NotProgressingResidentsSubtab(driver);
        assertTrue("Unable to click the \"Contact\" dropdown in the Residents -> Not Progressing subtab of the \"My Dashboard\" section!", useNotProgressingResidentsSubtab.clickNotProgressingDropdownFirstEntry());
        assertTrue("Unable to click the \"Send an Email\" Dropdown option for the first Contact Needed Entry!", useNotProgressingResidentsSubtab.clickNotProgressingSendAnEmailWhatsNextOption());
    }
}
