package smoke_and_sanity_tests.deploy_admin_tests.maintenances_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab.AddDatabaseDRFailoverCurtainPage;
import page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab.AddDatabaseMaintenanceCurtainPage;
import page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.ViewMaintenancePage;
import page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab.StopAndStartFreeswitchQueueConsumerRapidWindows;
import static org.junit.Assert.assertTrue;

public class ValidateReleaseAndUtilityCommandsForRapidMaintenanceTabIT extends BaseBrowserTest {
    public ValidateReleaseAndUtilityCommandsForRapidMaintenanceTabIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for Step 1 of EntrataTest ID #2225217
    public void shouldConfirmAllFieldsArePresent_whenInsideAddDatabaseMaintenanceCurtainPage() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Maintenances tab in DeployAdmin.", deployAdminNavBar.hoverOverMaintenancesTab());
        assertTrue("Could not click on the View Maintenance sub-tab under Maintenances tab.", deployAdminNavBar.clickViewMaintenanceSubtab());

        ViewMaintenancePage viewMaintenancePage = new ViewMaintenancePage(driver);
        assertTrue("Could not click on Add Database Maintenance button under the Utility Commands section.", viewMaintenancePage.clickAddDatabaseMaintenanceButton());

        AddDatabaseMaintenanceCurtainPage addDatabaseMaintenanceCurtainPage = new AddDatabaseMaintenanceCurtainPage(driver);
        assertTrue("Could not confirm that Close X button is present in top right corner of Add Database Maintenance curtain page.", addDatabaseMaintenanceCurtainPage.confirmCloseXButtonInTopRightCornerIsPresent());
        assertTrue("Could not confirm that Add Database Maintenance text is present in Header of Add Database Maintenance curtain page.", addDatabaseMaintenanceCurtainPage.confirmAddDatabaseMaintenanceTextIsPresentInHeader());
        assertTrue("Could not confirm that Deployment Information text is present in Subheader of Add Database Maintenance curtain page.", addDatabaseMaintenanceCurtainPage.confirmDeploymentInformationTextIsPresentInSubheader());
        assertTrue("Could not confirm that Database Maintenance Text is present for Deployment Type field.", addDatabaseMaintenanceCurtainPage.confirmDatabaseMaintenanceTextIsPresentForDeploymentTypeField());
        assertTrue("Could not confirm that Scheduled Date field is present.", addDatabaseMaintenanceCurtainPage.confirmScheduledDateFieldIsPresent());
        assertTrue("Could not confirm that Private radio button is present for Scope field.", addDatabaseMaintenanceCurtainPage.confirmPrivateRadioButtonOptionIsPresentForScopeField());
        assertTrue("Could not confirm that Public radio button is present for Scope field.", addDatabaseMaintenanceCurtainPage.confirmPublicRadioButtonOptionIsPresentForScopeField());
        assertTrue("Could not confirm that All radio button is present for Scope field.", addDatabaseMaintenanceCurtainPage.confirmAllRadioButtonOptionIsPresentForScopeField());
        assertTrue("Could not confirm that On radio button is present for Status field.", addDatabaseMaintenanceCurtainPage.confirmOnRadioButtonOptionIsPresentForStatusField());
        assertTrue("Could not confirm that Off radio button is present for Status field.", addDatabaseMaintenanceCurtainPage.confirmOffRadioButtonOptionIsPresentForStatusField());
        assertTrue("Could not confirm that Master radio button is present for Database Type field.", addDatabaseMaintenanceCurtainPage.confirmMasterRadioButtonOptionIsPresentForDatabaseTypeField());
        assertTrue("Could not confirm that Slave radio button is present for Database Type field.", addDatabaseMaintenanceCurtainPage.confirmSlaveRadioButtonOptionIsPresentForDatabaseTypeField());
        assertTrue("Could not confirm that the Select All checkbox is present for the Databases field.", addDatabaseMaintenanceCurtainPage.confirmSelectAllCheckboxIsPresentForDatabasesField());
        assertTrue("Could not confirm that the Description text field is present.", addDatabaseMaintenanceCurtainPage.confirmDescriptionTextFieldIsPresent());
        assertTrue("Could not confirm that the green Submit button is present.", addDatabaseMaintenanceCurtainPage.confirmGreenSubmitButtonIsPresent());
        assertTrue("Could not click on the blue Cancel link in Add Database Maintenance curtain page.", addDatabaseMaintenanceCurtainPage.clickBlueCancelLinkAtBottomOfCurtainPage());
    }

    @Test
    //Test for Step 2 of EntrataTest ID #2225217
    public void shouldConfirmPopUpWindowsInterface_whenSelectingDropDownOptionsForFreeswitchQueueConsumersMenu() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Maintenances tab in DeployAdmin.", deployAdminNavBar.hoverOverMaintenancesTab());
        assertTrue("Could not click on the View Maintenance sub-tab under Maintenances tab.", deployAdminNavBar.clickViewMaintenanceSubtab());

        //Verifying locators for the Stop option under the Freeswitch Queue Consumers drop-down menu.
        ViewMaintenancePage viewMaintenancePage = new ViewMaintenancePage(driver);
        assertTrue("Could not click on Freeswitch Queue Consumers drop-down menu.", viewMaintenancePage.clickFreeswitchQueueConsumersDropDownMenu());
        assertTrue("Could not click on the Stop option under the Freeswitch Queue Consumers drop-down menu.", viewMaintenancePage.clickStopOptionFromFreeswitchQueueConsumersDropDownMenu());

        StopAndStartFreeswitchQueueConsumerRapidWindows stopAndStartFreeswitchQueueConsumerRapidWindows = new StopAndStartFreeswitchQueueConsumerRapidWindows(driver);
        assertTrue("Could not confirm the message is present in Stop Freeswitch Queue Consumer pop-up window.", stopAndStartFreeswitchQueueConsumerRapidWindows.confirmStopFreeswitchQueueConsumerTextIsPresent());
        assertTrue("Could not confirm that the green Yes button is present in the pop-up window.", stopAndStartFreeswitchQueueConsumerRapidWindows.confirmGreenYesButtonIsPresent());
        assertTrue("Could not click on the blue Cancel link in the pop-up window.", stopAndStartFreeswitchQueueConsumerRapidWindows.clickBlueCancelLink());

        //Verifying locators for the Start option under the Freeswitch Queue Consumers drop-down menu.
        assertTrue("Could not click on Freeswitch Queue Consumers drop-down menu for the second time.", viewMaintenancePage.clickFreeswitchQueueConsumersDropDownMenu());
        assertTrue("Could not click on the Start option under the Freeswitch Queue Consumers drop-down menu.", viewMaintenancePage.clickStartOptionFromFreeswitchQueueConsumersDropDownMenu());

        assertTrue("Could not confirm the message is present in Start Freeswitch Queue Consumer pop-up window.", stopAndStartFreeswitchQueueConsumerRapidWindows.confirmStartFreeswitchQueueConsumerTextIsPresent());
        assertTrue("Could not click on the Close X button in the top right corner of the pop-up window.", stopAndStartFreeswitchQueueConsumerRapidWindows.clickCloseXButton());
    }

    @Test
    //Test for Step 3 of EntrataTest ID #2225217
    public void shouldConfirmAllFieldsArePresent_whenInsideAddDatabaseDR_FailoverCurtainPage() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Maintenances tab in DeployAdmin.", deployAdminNavBar.hoverOverMaintenancesTab());
        assertTrue("Could not click on the View Maintenance sub-tab under Maintenances tab.", deployAdminNavBar.clickViewMaintenanceSubtab());

        ViewMaintenancePage viewMaintenancePage = new ViewMaintenancePage(driver);
        assertTrue("Could not click on Add Database DR Failover button under the Utility Commands section.", viewMaintenancePage.clickAddDatabaseDR_FailoverButton());

        AddDatabaseDRFailoverCurtainPage addDatabaseDRFailoverCurtainPage = new AddDatabaseDRFailoverCurtainPage(driver);
        assertTrue("Could not confirm that Close X button is present in top right corner of Add Database DR Failover curtain page.", addDatabaseDRFailoverCurtainPage.confirmCloseXButtonIsPresent());
        assertTrue("Could not confirm that Add Database DR Failover text is present in Header of Add Database DR Failover curtain page.", addDatabaseDRFailoverCurtainPage.confirmAddDatabaseDR_FailoverTextIsPresent());
        assertTrue("Could not confirm that Deployment Information text is present in Subheader of Add Database DR Failover curtain page.", addDatabaseDRFailoverCurtainPage.confirmDeploymentInformationTextIsPresent());
        assertTrue("Could not confirm that Failover to Master radio button is present for Databases Failover Type field.", addDatabaseDRFailoverCurtainPage.confirmFailoverToMasterOptionIsPresent());
        assertTrue("Could not confirm that Failover to DR radio button is present for Databases Failover Type field.", addDatabaseDRFailoverCurtainPage.confirmFailoverToDR_OptionIsPresent());
        assertTrue("Could not confirm that the Select All checkbox is present for the Databases field.", addDatabaseDRFailoverCurtainPage.confirmSelectAllDatabasesCheckboxIsPresent());
        assertTrue("Could not confirm the Master Databases text is present within Databases field.", addDatabaseDRFailoverCurtainPage.confirmMasterDatabasesTextIsPresent());
        assertTrue("Could not confirm the Slave Databases text is present within Databases field.", addDatabaseDRFailoverCurtainPage.confirmSlaveDatabasesTextIsPresent());
        assertTrue("Could not confirm that the green Submit button is present.", addDatabaseDRFailoverCurtainPage.confirmGreenSubmitButtonIsPresent());
        assertTrue("Could not click on the blue Cancel link in Add Database DR Failover curtain page.", addDatabaseDRFailoverCurtainPage.clickBlueCancelLink());
    }
}
