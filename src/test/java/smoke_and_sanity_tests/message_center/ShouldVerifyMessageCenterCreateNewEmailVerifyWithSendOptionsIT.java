package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.new_email_screens.MessageCenterEmailNewEmailDraft;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import static junit.framework.Assert.assertTrue;

public class ShouldVerifyMessageCenterCreateNewEmailVerifyWithSendOptionsIT extends BaseBrowserTest {
    public ShouldVerifyMessageCenterCreateNewEmailVerifyWithSendOptionsIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifyCreateNewEmailWorkflowWithBasicLayoutAndVerifySendOptions_whenUsingMessageCenter() {
        //Entrata Test Message Center  ID: --> 2223846

        //Navigating to Tools>"Message Center" subtab
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Couldn't navigate to the Tools Tab!", useNavBar.clickToolsTab());
        assertTrue("Couldn't navigate to the Message Center area under Tools!", useNavBar.clickMessageCenterSubTab());
        //Use the "Create New" option in the Message Center tab to create a new item/event
        MessageCenterNav messageCenterSmokeNavigation = new MessageCenterNav(driver);
        assertTrue("Unable to open the \"Create New\" Message Center item box!", messageCenterSmokeNavigation.openCreateNewMessageCenterItem());
        //"Create New" using the "Email" option
        MessageCenterEmailNewEmailDraft draftingNewMessageCenterEmail = new MessageCenterEmailNewEmailDraft(driver);
        assertTrue("Unable to select the \"Create New\" Message Center \"Email\" button!", draftingNewMessageCenterEmail.selectCreateMessageCenterEmail());
        //Locate and use the Recipients Search field to select a recipient list
        assertTrue("Unable to find the Message Center Email Recipients field!"
                , draftingNewMessageCenterEmail.messageCenterEmailRecipientsSearchFieldLocate());
        assertTrue("Unable to find the Message Center Email Recipients field and Send Keys to it!"
                , draftingNewMessageCenterEmail.messageCenterEmailRecipientsSearchFieldSendKeys());
        //Selecting the searched list, and using the Save & Continue to get to the next page (Compose Message)
        assertTrue("Unable to click the recipient list found!", draftingNewMessageCenterEmail.messageCenterEmailRecipientsSearchAndClickSearchedResult());
        assertTrue("Unable to Save and Continue from the Recipients Message Center Page!"
                , draftingNewMessageCenterEmail.messageCenterEmailSaveAndContinueFromRecipients());
        //Locating and Sending Keys to the Subject, Selecting the Layout, and entering information into the Main Body Content
        assertTrue("Unable to find the Compose Message Subject Line Object!"
                , draftingNewMessageCenterEmail.findMessageCenterEmailComposeMessageSubjectLine());
        assertTrue("Unable to locate and send keys to the the Compose Message Subject Line Object!"
                , draftingNewMessageCenterEmail.messageCenterEmailComposeMessageSubjectLineSendKeys());
        assertTrue("Unable to find the \"Basic\" Message Center design layout!"
                , draftingNewMessageCenterEmail.messageCenterEmailSelectMessageDesignLayoutBasic());
        assertTrue("Unable to find and input the Main Body Content keys into the Basic Message Center Layout!"
                , draftingNewMessageCenterEmail.messageCenterEmailClickMainBodyContentBasicLayout());
        assertTrue("Unable to find and input the Main Body Content keys into the Basic Message Center Layout!"
                , draftingNewMessageCenterEmail.messageCenterEmailSendKeysMainBodyContentBasicLayout());
        //Jumping to the Send Options from the Compose screen
        assertTrue("Unable to jump to the Message Center Email Send Options!"
                , draftingNewMessageCenterEmail.messageCenterEmailJumpToSendOptionsFromComposeMessage());
        //Identifying all of the Send options that are available and selecting them to ensure that they're selectable
        assertTrue("Unable to identify one or more of the Send Options!"
                , draftingNewMessageCenterEmail.identifyMessageCenterEmailSendOptionsSendOnceOption());
        assertTrue("Unable to identify one or more of the Send Options!"
                , draftingNewMessageCenterEmail.identifyMessageCenterEmailSendOptionsSendLaterOption());
        assertTrue("Unable to identify one or more of the Send Options!"
                , draftingNewMessageCenterEmail.identifyMessageCenterEmailSendOptionsRecurringEventOption());
        assertTrue("Unable to identify one or more of the Send Options!"
                , draftingNewMessageCenterEmail.identifyMessageCenterEmailSendOptionsAutomatedEventOption());
    }
}
