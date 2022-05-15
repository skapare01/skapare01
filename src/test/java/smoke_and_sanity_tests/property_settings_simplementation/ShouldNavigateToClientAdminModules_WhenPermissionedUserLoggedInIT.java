package smoke_and_sanity_tests.property_settings_simplementation;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.SimplementationPage;
import page_objects.client_admin_page_objects.development_tab.setup_subtab.PropertySettingsGroupsPage;
import page_objects.client_admin_page_objects.development_tab.setup_subtab.PropertySettingsKeyPage;
import page_objects.client_admin_page_objects.support_tab.tooltips_subtab.ToolTipsPage;

import static org.junit.Assert.assertTrue;

public class ShouldNavigateToClientAdminModules_WhenPermissionedUserLoggedInIT extends BaseBrowserTest{
    public ShouldNavigateToClientAdminModules_WhenPermissionedUserLoggedInIT(){
        super("clientadmin",SitesEnum.CLIENTADMIN,"mkhairnar","Xento123");
    }
    @Test
    public void shouldNavigateToToolTips_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        ToolTipsPage toolTipsPage = new ToolTipsPage(driver);
        assertTrue("unable to click support tab", navBar.clickSupportMenu());
        assertTrue("unable to click tool tips",navBar.clickSupportToolTips());
        assertTrue("unable to find add tooltips",toolTipsPage.confirmAddToolTipVisible());
    }
    @Test
    public void shouldNavigateToPropertySettingGroups_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        PropertySettingsGroupsPage propertySettingsGroupsPage = new PropertySettingsGroupsPage(driver);
        assertTrue("unable to find development tab", navBar.moveToDevelopmentTab());
        assertTrue("unable to find setup tab",navBar.moveToSetupSubtab());
        assertTrue("unable to click property settings groups", navBar.clickPropertySettingGroups());
        assertTrue("unable to find add property setting group button",propertySettingsGroupsPage.findAddPropertySettingGroup());
        assertTrue("unable to find quick search", propertySettingsGroupsPage.findQuickSearch());
    }
    @Test
    public void shouldNavigateToPropertySettingsKey_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        PropertySettingsKeyPage propertySettingsKeyPage = new PropertySettingsKeyPage(driver);
        assertTrue("unable to find development tab", navBar.moveToDevelopmentTab());
        assertTrue("unable to find setup tab",navBar.moveToSetupSubtab());
        assertTrue("unable to click property setting key", navBar.clickPropertySettingsKey());
        assertTrue("unable to find quick search", propertySettingsKeyPage.findQuickSearch());
        assertTrue("unable to find add setting key", propertySettingsKeyPage.findAddSettingKey());
    }
    @Test
    public void shouldNavigatetoClientsSimPortalLibrary_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        SimplementationPage simplementationPage = new SimplementationPage(driver);
        assertTrue("unable to find client page",navBar.moveToClientsTab());
        assertTrue("unable to click simplementation", navBar.clickSimplementation());
        assertTrue("unable to find create portal button",simplementationPage.findCreatePortalButton());

    }
}
