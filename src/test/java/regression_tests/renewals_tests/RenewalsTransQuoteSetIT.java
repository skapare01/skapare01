package regression_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.ResidentsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.TransfersModifications;

import static junit.framework.Assert.assertTrue;

public class RenewalsTransQuoteSetIT extends BaseBrowserTest {
    public RenewalsTransQuoteSetIT() {
        super("village");
    }

    @Test
    public void shouldVerifyAllExisingSettingsArePresent_whenToggleEnableTransferQuotesSettingToYes() { //Renewals_TC_2248986, //NOTE: Setting must be set to NO before test is run or test will fail.
        //set up >> properties >> select property
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Set up Tab was not able to be clicked", nav.clickSetupButton());
        assertTrue("Setup>>Properties tab was not able to be clicked", nav.clickPropertiesButton());
        PropertyListPage property = new PropertyListPage(driver);
        assertTrue("Was not able to select specific property, The Village Bend East", property.clickRenewalsPropertyVillageBend());
        //Residents
        PropertyFirstLevelNavigation resTab = new PropertyFirstLevelNavigation(driver);
        assertTrue("Residents Tab not clickable", resTab.clickResidentsTab());
        //Transfer/Modifications
        ResidentsNav transModTab = new ResidentsNav(driver);
        assertTrue("Transfer/Mod Sub tab not clickable", transModTab.clickTransferModificationsTab());
        //verifying 4 sub tabs of transfers/modifications
        TransfersModifications transMod = new TransfersModifications(driver);
        assertTrue("Transfers Sub tab does not exist", transMod.TransferModificationTransferTabVisible());
        assertTrue("MidLease Mod tab does not exist", transMod.TransferModificationMidLeaseModTabVisible());
        assertTrue("Transfer Quotes sub tab does not exist", transMod.TransferModificationTransferQuotesTabVisible());
        assertTrue("Transfer Reasons sub tab does not exist", transMod.TransferModificationTransferReasonsTabVisible());
        //Transfer Quotes Tab
        assertTrue("Transfer Quotes Tab was not able to be clicked", transMod.TransferModificationTransferQuotesTabClick());
        assertTrue("Enable Quotes setting does not exist", transMod.EnableQuotesSettingExists());
        //Edit, Enable setting, Enable Transfer Quotes setting list
        assertTrue("Edit Quote button was not clickable", transMod.editEnableQuoteSetting());
        assertTrue("Unable to toggle quote setting to yes", transMod.toggleEnableQuoteSetting());
        assertTrue("Is valid for setting does not exist", transMod.quoteIsValidForHoursField());
        assertTrue("Quote Expires at setting does not exist", transMod.quoteExpiresAtField());
        assertTrue("Quote primary color field does not exist", transMod.quotePrimaryColorField());
        assertTrue("Quote From management title field does not exist", transMod.quoteFromTheManagementTitleField());
        assertTrue("Quote From management text field does not exist", transMod.quoteFromTheManagementTextField());
        assertTrue("Quote disclaimer text field does not exist", transMod.quoteDisclaimersTextField());
        assertTrue("Quote Monthly rent toggle does not exist",transMod.quoteHideMonthlyRentToggle());
        assertTrue("Quote customize rent does not exist", transMod.quoteCustomizedQuoteURL());
        assertTrue("Show ADA Icon setting does not exist", transMod.quoteShowADAIcon());
        assertTrue("Resident Portal disclaimer text does not exist", transMod.quoteResPortalDisclaimerText());
        assertTrue("Allow edit occupants toggle does not exist", transMod.quoteAllowResToEditOccupantsAtTimeOfTransferQuotes());
        //Enter required field, save and verify successful save banner
        assertTrue("Quote Is valid For setting not clickable", transMod.quoteIsValidForHoursFieldEnterRequired());
        assertTrue("could not clear required text field", transMod.quoteIsValidForHoursFieldEnterRequiredClearTextField());
        assertTrue("could not enter in required hours text", transMod.quoteIsValidForHoursFieldEnterRequiredSetHours());
        assertTrue("Save button was not able to be clicked", transMod.SaveEnableQuoteSettings());
        assertTrue("Success Banner did not display, settings may not have been saved", transMod.enableQuotesSaveBanner());
        //Edit, Toggle to No, save, success Banner
        assertTrue("Edit Quote setting does not exist", transMod.editEnableQuoteSetting());
        assertTrue("Unable to toggle quote setting to no", transMod.toggleEnableQuoteSetting());
        assertTrue("Save button was not able to be clicked", transMod.SaveEnableQuoteSettings());
        assertTrue("Success Banner did not display, settings may not have been saved", transMod.enableQuotesSaveBanner());
    }
}
