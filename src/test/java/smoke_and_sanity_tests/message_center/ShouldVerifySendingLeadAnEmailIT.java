package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.LeadsAllLeadsFilters;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadActivityLog;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.new_email_screens.MessageCenterEmailNewEmailDraft;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifySendingLeadAnEmailIT extends BaseBrowserTest {


    public ShouldVerifySendingLeadAnEmailIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifySendingLeadAnEmail_whenInTheLeadProfile() {
    //  MC 2240480 - Verify by sending emails to Leads from their profile.
    //Navigating to the Leads tab, opening the Filters, and clearing the default selections
    EntrataNavBar useNavBar = new EntrataNavBar(driver);
    assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
    LeadsAllLeadsFilters useLeadsFilters = new LeadsAllLeadsFilters(driver);
    assertTrue("Unable to click the Leads-> \"Filter\" button!", useLeadsFilters.clickExpandFilterButton());
    assertTrue("Unable to click the Filter-> \"Clear All\" button!", useLeadsFilters.clickClearALlPropertiesButtonInFilters());
    //Adding a property to the search Filter
    assertTrue("Unable to click the Filter-> \"Add Property\" Green button!", useLeadsFilters.clickAddPropertyFilterButton());
    assertTrue("Unable to click the Property Search field and search for the \"Boulder Hollow\" property in the Leads->Filter section!", useLeadsFilters.clickAndSendKeysToPropertyNameSearchFieldCavalierCourt());
    assertTrue("Unable click the \"Boulder Hollow\" property result in the Leads->Filter section!", useLeadsFilters.clickCavalierCourtSearchedFilterResult());
    //Sending the name keys to the Name search field and confirming the search
    assertTrue("Unable click the Black Filter Box area in the Leads->Filter section!", useLeadsFilters.clickLeadsFilterBlackTextArea());
    assertTrue("Unable click and send the keys \"Sanali Payne\" to the \"Name\" search field in the Leads->Filter section!", useLeadsFilters.clickAndSendKeysToAddNameEmailOrIDFilterSearchFieldSanaliPayne());
    assertTrue("Unable click the \"Filter Leads\" button in the Leads->Filter section!", useLeadsFilters.clickFilterSearch());
    AllLeadsPage leadsTab = new AllLeadsPage(driver);
    //Clicking the searched lead
    assertTrue("Unable click the searched Lead \"(Sanali Payne)\" in the Leads->\"All Leads\" subtab!", leadsTab.clickSearchedLeadSanaliPayne());
    LeadSummary useLeadSummary = new LeadSummary(driver);
    //Use the "Email" button in the profile to start an email draft
    assertTrue("Unable to click the \"Email\" button in the Lead Profile!", useLeadSummary.clickEmailButton());
    //Adding email details (Subject + Body Content) and Sending the Email
    MessageCenterEmailNewEmailDraft useMCEmailNewEmailDraft = new MessageCenterEmailNewEmailDraft(driver);
    assertTrue("Unable to click and send keys to the \"Subject\" line button in the Lead Profile Email Draft!", useMCEmailNewEmailDraft.messageCenterLeadEmailComposeMessageSubjectLineSendKeys());
    assertTrue("Unable to click and send keys to the \"Main Body Content\" line in the Lead Profile Email Draft!", useMCEmailNewEmailDraft.messageCenterEmailSendKeysMainBodyContentBasicLayout());
    assertTrue("Unable to click the \"Send\" button in the Lead Profile Email Draft!", useMCEmailNewEmailDraft.clickSendEmailButton());
    //Navigating to the Activity Log and confirming the sent email event appears
    LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
    assertTrue("Unable to navigate to the Lead \"Activity Log\" tab!", useLeadActivityLog.clickActivityLogPage());
    assertTrue("Unable to locate the sent email to the Lead in the \"Activity Log\" tab!", useLeadActivityLog.locateSentEmail());
    }
}
