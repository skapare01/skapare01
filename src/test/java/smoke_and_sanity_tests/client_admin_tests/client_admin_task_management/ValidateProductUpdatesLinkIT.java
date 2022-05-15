package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.help_icon.ContactSupportPopup;
import page_objects.entrata_page_objects.help_icon.ProductUpdatesPage;

import static org.junit.Assert.assertTrue;

public class ValidateProductUpdatesLinkIT extends BaseBrowserTest {
    public ValidateProductUpdatesLinkIT(){
        super("avantic");
    }
    @Test
    public void shouldValidateProductUpdatesLink_whenLinkIsClicked(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click help icon in top right corner of Entrata.",nav.clickHelp());
        assertTrue("Unable to click product updates option.",nav.clickProductUpdates());
        ProductUpdatesPage productUpdatesPage = new ProductUpdatesPage(driver);
        assertTrue("Unable to click 'calendar' tab.", productUpdatesPage.clickCalendar());
        assertTrue("Unable to click 'coming soon' tab.", productUpdatesPage.clickComingSoon());
        assertTrue("Unable to find release dropdown on coming soon page.", productUpdatesPage.findUpcomingReleaseDropdown());
        assertTrue("Unable to click 'past updates' tab.", productUpdatesPage.clickPastUpdates());
        assertTrue("Unable to find 'all updates' tab.", productUpdatesPage.findAllUpdatesTab());
        assertTrue("Unable to find release note quick search field.", productUpdatesPage.findReleaseNotesSearch());
        assertTrue("Unable to click 'contact support' button.", productUpdatesPage.clickContactSupport());
        ContactSupportPopup contactSupportPopup = new ContactSupportPopup(driver);
        assertTrue("Unable to find subject line field on contact support popup.",contactSupportPopup.findSubjectLine());


    }
}
