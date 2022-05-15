package smoke_and_sanity_tests.doc_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.CommunicationNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab.DocumentsNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab.packets_tab.DocumentPacketsPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class ShouldCreateNewPacketWhenUsingAddPacketIT extends BaseBrowserTest {

    public ShouldCreateNewPacketWhenUsingAddPacketIT() { super("derapid");}

    @Test
    public void shouldCreateNewPacket_whenUsingAddPacket() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Setup' tab",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click 'Company' tab", entrataNavigation.clickCompanyButton());
        CompanyFirstLevelNavigation companySettings = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to click 'Communication' tab", companySettings.clickCommunicationTab());
        CommunicationNav communicationNavigation = new CommunicationNav(driver);
        assertTrue("Unable to click 'Documents' tab", communicationNavigation.clickDocumentsButton());
        DocumentsNav documentNavigation = new DocumentsNav(driver);
        assertTrue("Unable to click 'Packets' tab", documentNavigation.clickPacketsButton());
        DocumentPacketsPage addPacket = new DocumentPacketsPage(driver);
        assertTrue("Unable to click 'Add Packet' button", addPacket.clickAddPacketButton());
        assertTrue("Unable to add packet name on Add Packets page", addPacket.addPacketName(randomName()));
        assertTrue("Unable to click 'Packet Type' dropdown on Add Packets page", addPacket.clickPacketTypeDropdown());
        assertTrue("Unable to click 'Lease' option in the Packet Type dropdown on Add Packets page", addPacket.clickLeaseInPacketDropdown());
        assertTrue("Unable to click 'Transfer' checkbox in Lease Types on Add Packets page", addPacket.clickTransferCheckbox());
        assertTrue("Unable to click 'New Lease' checkbox in Lease Types on Add Packets page", addPacket.clickNewLeaseCheckbox());
        assertTrue("Unable to click 'Renewal' checkbox in Lease Types on Add Packets page", addPacket.clickRenewalCheckbox());
        assertTrue("Unable to find 'Active' slider on Add Packets page", addPacket.findActiveSliderYes());
        assertTrue("Unable to click 'Always Active' on Add Packets page", addPacket.clickAlwaysActive());
        assertTrue("Unable to click 'Add' properties button on Add Packets page", addPacket.clickAddProperties());
        assertTrue("Unable to click 'All Properties' in property list on Add Packets page", addPacket.clickAddAllProperties());
        assertTrue("Unable to click 'Save' packet button on Add Packets page", addPacket.clickPacketSaveButton());
        assertTrue("Unable to find 'Packet Saved' message", addPacket.findPacketSavedMessage());
    }
}
