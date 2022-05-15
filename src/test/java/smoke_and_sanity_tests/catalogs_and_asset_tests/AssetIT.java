package smoke_and_sanity_tests.catalogs_and_asset_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.AssetCondition;
import page_objects.entrata_page_objects.accounting_tab.asset_list_subtab.AssetList;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.AssetLocation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.CatalogManagement;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.FixedAssets;

import static org.junit.Assert.assertTrue;

public class AssetIT extends BaseBrowserTest {

    public AssetIT() {
        super("avantic");
    }

    @Test //TC: 3239182
    public void shouldFindAddANewAssetLocationForm_whenAddAssetLocationButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AssetLocation assetLocation = new AssetLocation(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());
        assertTrue("Could not select Asset Locations tab.", assetLocation.assetLocationsTabClick());
        assertTrue("Could not select Add Asset Location.", assetLocation.addAssetLocationClick());
        assertTrue("Could not find Add Asset Location form.", assetLocation.addAssetLocationFormVisible());
    }

    @Test //TC: 3239253
    public void shouldFindAddInventoryAdjustmentForm_whenAddInventoryAdjustmentButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AssetList assetList = new AssetList(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Asset List.", navBar.clickAssetList());
        assertTrue("Could not select Inventory tab.", assetList.inventoryTabClick());
        assertTrue("Could not click on Add Inventory Adjustment button.", assetList.addInventoryAdjustmentClick());
        assertTrue("Could not find Inventory Adjustment form.", assetList.addInventoryAdjustmentFormVisible());
    }

    @Test //TC: 3239311
    public void shouldFindAddNewFixedAssetForm_whenAddFixedAssetButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AssetList assetList = new AssetList(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not find Asset List.", navBar.clickAssetList());
        assertTrue("Could not find Add Fixed Asset button.", assetList.addFixedAssetClick());
        assertTrue("Could not find Add Fixed Asset form.", assetList.addFixedAssetFormVisible());
    }

    @Test //TC: 3239340
    public void shouldFindAddAssetConditionForm_whenAddAssetConditionButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AssetCondition assetCondition = new AssetCondition(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());
        assertTrue("Could not select Fixed Assets tab.", assetCondition.fixedAssetsTabClick());
        assertTrue("Could not select Add Asset Condition button.", assetCondition.addAssetConditionButtonClick());
        assertTrue("Could not find Add Asset Condition Form.", assetCondition.addAssetFormVisible());
    }

    @Test //TC: 3239263
    public void shouldFindAddNewCatalogItemCategoryForm_whenAddANewItemCategoryIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CatalogManagement catalogManagement = new CatalogManagement(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());
        assertTrue("Could not select Catalog Management tab.", catalogManagement.catalogManagementClick());
        assertTrue("Could not select item category dropdown.", catalogManagement.itemCategoryDropdownClick());
        assertTrue("Could not select Add Catalog Item Category.", catalogManagement.addCatalogItemCategoryClick());
        assertTrue("Could not find Add Catalog Item Category form.", catalogManagement.addCatalogItemCategoryFormVisible());
    }

    @Test //TC: 3239349
    public void shouldFindAddCatalogItemForm_whenAddCatalogItemButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CatalogManagement catalogManagement = new CatalogManagement(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());
        assertTrue("Could not select Catalog Management tab.", catalogManagement.catalogManagementClick());
        assertTrue("Could not select Add Catalog Item button.", catalogManagement.addCatalogItemButtonClick());
        assertTrue("Could not find Add Catalog Item form.", catalogManagement.addCatalogItemFormVisible());
    }

    @Test //TC: 3239324
    public void shouldFindAddDepreciationCategoryForm_whenAddDepreciationCategoryButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        FixedAssets fixedAssets = new FixedAssets(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());
        assertTrue("Could not select Fixed Assets tab.", fixedAssets.fixedAssetsTabClick());
        assertTrue("Could not select Add Depreciation Category button.", fixedAssets.addDepreciationCategoryButtonClick());
        assertTrue("Could not find Add Depreciation Category form.", fixedAssets.addDepreciationCategoryFormVisible());
    }

    @Test //TC: 3239334
    public void shouldFindBulkTransferFixedAssetsForm_whenBulkTransferFixedAssetsButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AssetList assetList = new AssetList(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not find Asset List.", navBar.clickAssetList());
        assertTrue("Could not find the tools button.", assetList.inventoryMenuHover());
        assertTrue("Could not click Bulk Transfer Fixed Assets button.", assetList.bulkTransferButton());
        assertTrue("Could not find Bulk Transfer Fixed Assets form.", assetList.bulkTransferFormVisible());
    }
}
