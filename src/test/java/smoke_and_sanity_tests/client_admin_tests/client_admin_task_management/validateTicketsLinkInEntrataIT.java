package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.help_icon.ContactSupportPopup;
import page_objects.entrata_page_objects.help_icon.TicketsPage;

import static org.junit.Assert.assertTrue;

public class validateTicketsLinkInEntrataIT extends BaseBrowserTest {
    public validateTicketsLinkInEntrataIT(){
        super("avantic");
    }

    @Test
    public void shouldCheckTicketsLinkInEntrata_whenClickedOn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click help icon next to quick search.",nav.clickHelp());
        assertTrue("Unable to click 'tickets' link from dropdown.",nav.clickTicketsLink());
        TicketsPage ticketsPage = new TicketsPage(driver);
        assertTrue("Unable to click 'active' tab.", ticketsPage.clickActiveTab());
        assertTrue("Unable to click 'verification required' tab.", ticketsPage.clickVerificationRequiredTab());
        assertTrue("Unable to click 'resolved' tab.", ticketsPage.clickResolvedTab());
        assertTrue("Unable to click 'inbox' tab.", ticketsPage.clickInboxTab());
        assertTrue("Unable to click 'contact support' button.", ticketsPage.clickContactSupport());

    }
    @Test
    public void shouldCheckCreateTicketLink_whenClickedOn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click help icon next to quick search.",nav.clickHelp());
        assertTrue("Unable to click 'create a support ticket' link from dropdown.",nav.clickCreateASupportTicket());
        ContactSupportPopup contactSupportPopup = new ContactSupportPopup(driver);
        assertTrue("Unable to find subject line.", contactSupportPopup.findSubjectLine());

    }
}
