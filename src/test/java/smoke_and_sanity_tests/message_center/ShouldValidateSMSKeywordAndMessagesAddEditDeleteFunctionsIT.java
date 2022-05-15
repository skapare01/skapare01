package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.general.TextMessagingSubTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class ShouldValidateSMSKeywordAndMessagesAddEditDeleteFunctionsIT extends BaseBrowserTest {
//Constructor
    public ShouldValidateSMSKeywordAndMessagesAddEditDeleteFunctionsIT() { super("dittmarcompany"); }

    @Test
    public void shouldValidateSMSKeywordsAndMessages_whenUsingAddEditAndDeleteFunctions() {
        //Validate SMS Keywords - MC Test 2223791
        //To validate Property SMS Messages - MC Test 2223792

        //Navigate to Setup>Company. Then to Properties, and selecting the property
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Couldn't navigate to the \"Setup\" -> \"Company\" section of the Navigation Bar!", useEntrataNavBar.clickSetupButton());
        PropertySetup usePropertySettings = new PropertySetup(driver);
        assertTrue("Unable to navigate to the property settings page!", usePropertySettings.navigateToPropertySettings());
        assertTrue("Unable to select the \"Cavalier Court\" Property!", usePropertySettings.selectCavalierCourtProperty());
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Property Communication Settings!", propertyFirstLevelNavigation.clickCommunicationTab());
        //Navigate to Communication>Text Messaging Property setup tab
        TextMessagingSubTab useTextMessagingPropertySubTab = new TextMessagingSubTab(driver);
        assertTrue("Unable to navigate to the \"Text Messaging\" sub-tab in Property Settings!", useTextMessagingPropertySubTab.clickTextMessagingSubTab());
        assertTrue("Unable to locate the \"Text Keywords\" Header in Property Settings>Communication>Text Messaging!", useTextMessagingPropertySubTab.findTextKeywordsHeader());
        //"Edit Keywords" to create a new keyword
        assertTrue("Unable to use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButton());
        //Adding the new Keyword + Matched / Unmatched response data
        assertTrue("Unable to use the \"Add a New Keyword\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useAddAKeywordPropertySettingsButton());
        assertTrue("Unable to send the Keyword data to the \"Add a New Keyword\" Keyword text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.addOrEditKeywordTextFieldBoxAndSendKeys());
        assertTrue("Unable to send the text data to the \"Add a New Keyword\" -> \"Matched Response\" text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickAndSendKeysToMatchedResponseMessageTextBox());
        assertTrue("Unable to send the text data to the \"Add a New Keyword\" -> \"Unmatched Response\" text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickAndSendKeysToUnmatchedResponseMessageTextBox());
        //Saving the newly created Keyword with all required fields
        assertTrue("Unable to click the save button in the \"Add a New Keyword\" -> pop-up in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickSaveButtonFromAddOrEditAKeywordScreen());
        //Using the "Edit Keywords" button to open up the options to edit the newly created keyword
        assertTrue("Unable to use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButtonWithWaitForOverlayMethod());
        //Edit the newly created/existing keyword
        assertTrue("Unable to use the Edit for the existing keyword under \"Edit Keywords\" in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditExistingKeyword());
        //Send updated data to the newly created Keyword to confirm we can edit existing keywords
        assertTrue("Unable to send the Keyword data to the \"Add a New Keyword\" in an EXISTING Keyword's text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.addOrEditKeywordTextFieldBoxAndSendKeysFollowUp());
        //Saving the changes on the newly created Keyword
        assertTrue("Unable to re-click the save button in the \"Add a New Keyword\" -> pop-up for an existing Keyword in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickSaveButtonFromAddOrEditAKeywordScreen());
        assertTrue("Unable to re-use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging after a Keyword has been created!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButtonWithWaitForOverlayMethod());
        //Deleting the newly created / edited Keyword
        assertTrue("Unable to delete an existing Keyword in the \"Add a New Keyword\" -> section in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useDeleteExistingKeyword());
        assertTrue("Unable to re-save (use Save button) on an existing Keyword in the \"Add a New Keyword\" -> section in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useSaveButtonTextKeywordsPropertySettings());

    }
}
