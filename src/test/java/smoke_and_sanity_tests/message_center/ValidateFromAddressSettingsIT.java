package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.from_addresses.FromAddresses;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class ValidateFromAddressSettingsIT extends BaseBrowserTest {
//Constructor
    public ValidateFromAddressSettingsIT(){ super("dittmarcompany"); }

    @Test
    public void Should_Validate_The_From_Addresses_Tab_Under_Property_Communication_IT() {
// Validate the From Address Tab under communication tab - 2231513 / 2228142 Sanity test

//Navigating to Setup>Company>Properties and selecting a property (Cavalier Court)
EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
assertTrue("Unable to navigate to the Company Level Settings!", useEntrataNavBar.clickSetupButton());
PropertySetup navigating_To_Property_Settings = new PropertySetup(driver);
assertTrue("Unable to navigate to the \"Properties\" settings page under Setup!", navigating_To_Property_Settings.navigateToPropertySettings());
PropertySetup use_Property_Settings = new PropertySetup(driver);
assertTrue("Unable to select the \"Cavalier Court\" Property!", use_Property_Settings.selectCavalierCourtProperty());
PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
//Navigating to Property>Communication>"From Addresses" settings
assertTrue("Unable to navigate to the Property -> \"Communication\" Settings!", propertyFirstLevelNavigation.clickCommunicationTab());
FromAddresses fromAddressesSubTab = new FromAddresses(driver);
assertTrue("Unable to navigate to the Property \"From Addresses\" Settings!", fromAddressesSubTab.selectFromAddressesSubTab());
//Locating the "From Addresses" settings headers to ensure all expected categories have loaded and are present
assertTrue("Unable to locate the Property \"From Addresses\" \"Leasing\" Header!", fromAddressesSubTab.locateLeasingFromEmailAddressesSectionHeader());
assertTrue("Unable to locate the Property \"From Addresses\" \"Residents\" Header!", fromAddressesSubTab.locateResidentsFromEmailAddressesSectionHeader());
assertTrue("Unable to locate the Property \"From Addresses\" \"Other\" Header!", fromAddressesSubTab.locateOtherFromEmailAddressesSectionHeader());
assertTrue("Unable to locate the Property \"From Addresses\" \"EmailRelay\" Header!", fromAddressesSubTab.locateEmailRelayFromEmailAddressesSectionHeader());
//Using the "Edit Addresses" button to edit settings
assertTrue("Unable to open the edit via \"Edit Addresses\" for the \"From Addresses\" page!", fromAddressesSubTab.editFromAddressAddresses());
//Locating the "Message Center Emails being sent from" setting and confirming options exist per expectations
assertTrue("Unable to locate and click the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.clickMessageCenterEmailsBeingSentFrom());
assertTrue("Unable to locate the option for \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectEmailRelayOption());
assertTrue("Unable to locate the option for \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectMessageCenterFromAddressOption());
assertTrue("Unable to select the option for \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.messageCenterEmailsBeingSentFromSelectEmailRelayOption());
assertTrue("Unable to verify the selected option of \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectEmailRelayOption());
assertTrue("Unable to re-locate and re-click the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.clickMessageCenterEmailsBeingSentFrom());
assertTrue("Unable to select the option for \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.messageCenterEmailsBeingSentFromSelectMessageCenterFromAddressOption());
assertTrue("Unable to verify the selected option of \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectEmailRelayOption());
//Locating and clicking the "Contact Points emails as being sent from" setting options and clicking through them
assertTrue("Unable to locate and click the \"Contact Points emails as being sent from\" setting!", fromAddressesSubTab.clickContactPointsEmailsBeingSentFrom());
assertTrue("Unable to locate the option for \"Contact Points Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateContactPointsEmailsBeingSentFromFromAddressOption());
assertTrue("Unable to locate the option for \"EmailRelay\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.locateContactPointsEmailsBeingSentFromEmailRelayOption());
assertTrue("Unable to select the option for \"EmailRelay\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.contactPointsEmailsBeingSentFromEmailRelayOption());
assertTrue("Unable to verify the selected option of \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateContactPointsEmailsBeingSentFromEmailRelayOption());
//Clicking the "Contact Points emails as being sent from" setting options
assertTrue("Unable to re-locate and re-click the \"Contact Points emails as being sent from\" setting!", fromAddressesSubTab.clickContactPointsEmailsBeingSentFrom());
assertTrue("Unable to select the option for \"Contact Points Email \"From\" Address\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.contactPointsEmailsBeingSentFromFromAddressOption());
assertTrue("Unable to verify the selected option of \"Contact Points Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectEmailRelayOption());
//Locating and clicking the options for the "Default EmailRelay Reply Forwarding Address" setting
assertTrue("Unable to locate and click the \"Default EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.clickDefaultEmailRelayReplyForwardingAddress());
assertTrue("Unable to locate the option for \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddressEmailCreatorDefault());
assertTrue("Unable to locate the option for \"Property Email\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddressPropertyEmail());
assertTrue("Unable to locate the option for \"Entrata User Email\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddressEntrataUserEmail());
assertTrue("Unable to locate the option for \"Custom\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddressCustom());
assertTrue("Unable to select the option for \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.defaultEmailRelayReplyForwardingAddressSelectEmailCreatorDefault());
assertTrue("Unable to verify the selected option of \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateMessageCenterEmailsBeingSentFromSelectEmailRelayOption());
//Verifying the "Other" section of From Addresses
assertTrue("Unable to select into and verify the text field for \"Message Center:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.clickMessageCenterEmailField());
assertTrue("Unable to select into and verify the text field for \"Property Staff:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.clickPropertyStaffEmailField());
assertTrue("Unable to select into and verify the text field for \"Contact Points:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.clickContactPointsEmailField());
    }
}
