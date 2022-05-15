package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.new_email_screens.MessageCenterEmailNewEmailDraft;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifyCreateAndDiscardEmailFunctionalityInMessageCenterIT extends BaseBrowserTest {

    public ShouldVerifyCreateAndDiscardEmailFunctionalityInMessageCenterIT(){ super("dittmarcompany"); }

    @Test
    public void shouldVerifyCreateAndDiscardEmailFunctionality_whenInMessageCenterAndEnteringEmailDetails() {
        // Message Center Test Case - 2226991
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        //Navigating to Tools>"Message Center" subtab
        assertTrue("Unable to navigate to the Tools tab in Dashboard -> Tools!", useEntrataNavBar.clickToolsTab());
        MessageCenterNav messageCenterSmokeNavigation = new MessageCenterNav(driver);
        assertTrue("Couldn't navigate to the Message Center area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
        //Using the "Create New" button to start an Email draft
        assertTrue("Unable to open the \"Create New\" Message Center item box!", messageCenterSmokeNavigation.createNewMessageCenterItem());
        MessageCenterEmailNewEmailDraft messageCenterEmailDraftItems = new MessageCenterEmailNewEmailDraft(driver);
        //Starting the Email Draft and adding the required data (List)
        assertTrue("Unable to use the Create New Message Center Email option!", messageCenterSmokeNavigation.selectCreateMessageCenterEmail());
        assertTrue("Unable to locate the Search Recipients field in new Message Center Email list selection!", messageCenterEmailDraftItems.messageCenterEmailRecipientsSearchFieldLocate());
        assertTrue("Unable to use the Search Recipients field to find the \"Amazon Deliveries\" list!", messageCenterEmailDraftItems.messageCenterEmailRecipientsSearchFieldSendKeysAmazonDeliveries());
        assertTrue("Unable to select the searched result for selecting the \"Amazon Deliveries\" list!", messageCenterEmailDraftItems.messageCenterEmailRecipientsSearchAndClickSearchedResult());
        //"Save & Continue" after selecting the List
        assertTrue("Unable to select the \"Save & Continue\" button after selecting the \"Amazon Deliveries\" list!", messageCenterEmailDraftItems.messageCenterEmailSaveAndContinueFromRecipients());
        assertTrue("Unable to find the \"Basic\" Message Center design layout!", messageCenterEmailDraftItems.messageCenterEmailSelectMessageDesignLayoutBasic());
        assertTrue("Unable to find the Compose Message Subject Line Object!", messageCenterEmailDraftItems.findMessageCenterEmailComposeMessageSubjectLine());
        //Locating and entering data into the Email Content sections (Subject Line, Main Body Content)
        assertTrue("Unable to find the Compose Message Subject Line Object!", messageCenterEmailDraftItems.messageCenterEmailComposeMessageSubjectLineSendKeys());
        assertTrue("Unable to find and click into the Main Body Content for the \"Basic\" Message Center Layout!", messageCenterEmailDraftItems.messageCenterEmailClickMainBodyContentBasicLayout());
        assertTrue("Unable to input the Main Body Content keys into the \"Basic\" Message Center Layout!", messageCenterEmailDraftItems.messageCenterEmailSendKeysMainBodyContentBasicLayout());
        //Jumping to the "Send Options" section after entering the Email Content Details
        assertTrue("Unable to jump to the Message Center Email Send Options!", messageCenterEmailDraftItems.messageCenterEmailJumpToSendOptionsFromComposeMessage());
        //Using the "Discard" and "Confirm" buttons after confirming all other sections of the email draft are available
        assertTrue("Unable to use the \"Discard\" button from the Message Center Email Send Options!", messageCenterEmailDraftItems.clickDiscardOptionFromSendOptions());
        assertTrue("Unable to use the \"Confirm\" on the \"Discard\" button from the Message Center Email Send Options!", messageCenterEmailDraftItems.clickConfirmDiscardButtonFromSendOptions());

    }
}
