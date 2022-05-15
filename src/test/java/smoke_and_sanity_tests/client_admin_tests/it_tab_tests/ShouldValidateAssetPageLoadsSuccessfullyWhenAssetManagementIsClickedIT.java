package smoke_and_sanity_tests.client_admin_tests.it_tab_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.it_tab.asset_management.AssetManagementPage;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;

public class ShouldValidateAssetPageLoadsSuccessfullyWhenAssetManagementIsClickedIT extends BaseBrowserTest {
    public ShouldValidateAssetPageLoadsSuccessfullyWhenAssetManagementIsClickedIT(){
        super("clientadmin",CLIENTADMIN,"wbell","Xento123");
    }

    @Test
    public void ValidateAssetManagementPageLoadsSuccessfully(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        AssetManagementPage assetManagement = new AssetManagementPage(driver);
        assertTrue ("Unable to locate IT header tab.",nav.moveToITTab());
        assertTrue("unable to select Asset management from dropdown.", nav.clickAssetManagement());
        assertTrue("Add Asset Button not visible.", assetManagement.verifyAddAssetButton());
        assertTrue("Add Bulk Assets is not visible.",assetManagement.verifyAddBulkAssetsButton());
        assertTrue("Edit pencil not available for selection.", assetManagement.clickEditAssetButton());
        assertTrue("Edit modal failed to load in 20 seconds.", assetManagement.verifyEditModal());
    }
}
