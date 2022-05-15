package regression_tests.catalogs_and_asset_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.AssetCondition;
import page_objects.entrata_page_objects.accounting_tab.asset_list_subtab.AssetList;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.AssetLocation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab.CatalogManagement;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;
import static utils.RandomGenerator.randomNumber;

public class AssetRegressionIT extends BaseBrowserTest {

    public AssetRegressionIT() {
        super("avantic");
    }

    @Test
    public void shouldAddANewAssetLocation_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());

        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());

        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());

        AssetLocation assetLocation = new AssetLocation(driver);
        assertTrue("Could not select Asset Locations tab.", assetLocation.assetLocationsTabClick());
        assertTrue("Could not select Add Asset Location.", assetLocation.addAssetLocationClick());
        assertTrue("Could not find Location Name.", assetLocation.locationNameVisible());
        assertTrue("Could not find Address.", assetLocation.addressVisible());
        assertTrue("Could not find Address Line 1.", assetLocation.addressOneVisible());
        assertTrue("Could not find Address Line 2.", assetLocation.addressTwoVisible());
        assertTrue("Could not find Address Line 3.", assetLocation.addressThreeVisible());
        assertTrue("Could not find City.", assetLocation.cityVisible());
        assertTrue("Could not find State.", assetLocation.stateVisible());
        assertTrue("Could not find Zip.", assetLocation.zipVisible());
        assertTrue("Could not find Phone Number.", assetLocation.phoneNumberVisible());
        assertTrue("Could not find Selected Properties Box.", assetLocation.selectedPropertiesBoxVisible());
        assertTrue("Could not find Add Location button.", assetLocation.addLocationVisible());
        assertTrue("Could not find Cancel hyperlink.", assetLocation.cancelLocationVisible());
        assertTrue("Could not input Location Name.", assetLocation.locationName(randomName()));
        assertTrue("Could not select Add Properties button.", assetLocation.addPropertiesButton());
        assertTrue("Could not select Add All Properties.", assetLocation.addAllProperties());
        assertTrue("Could not select the Add Location button.", assetLocation.submitNewAssetLocation());
        assertTrue("Could not find green success banner.", assetLocation.successBannerVisible());

    }

    @Test
    public void shouldAddInventoryAdjustment_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Asset List.", navBar.clickAssetList());

        AssetList assetList = new AssetList(driver);
        assertTrue("Could not select Inventory tab.", assetList.inventoryTabClick());
        assertTrue("Could not find the side panel.", assetList.sidePanelVisible());
        assertTrue("Could not find Inventory Information header.", assetList.tableHeaderVisible());
        assertTrue("Could not click on Add Inventory Adjustment button.", assetList.addInventoryAdjustmentClick());
        assertTrue("Could not find Property dropdown.", assetList.inventoryPropertyVisible());
        assertTrue("Could not find Select Item dropdown.", assetList.selectItemVisible());
        assertTrue("Could not find Asset Location dropdown.", assetList.assetLocationVisible());
        assertTrue("Could not find Post Date.", assetList.inventoryPostDateVisible());
        assertTrue("Could not find Post Month.", assetList.inventoryPostMonthVisible());
        assertTrue("Could not find Quantity.", assetList.quantityVisible());
        assertTrue("Could not find Unit Cost.", assetList.unitCostVisible());
        assertTrue("Could not find Memo.", assetList.memoVisible());
        assertTrue("Could not find Save button.", assetList.saveButtonVisible());
        assertTrue("Could not find Cancel Hyperlink.", assetList.inventoryCancelHyperlinkVisible());
        assertTrue("Could not click Property dropdown.", assetList.propertyDropdownClick());
        assertTrue("Could not select first listed property.", assetList.firstListedPropertyClick());
        assertTrue("Could not click Item dropdown.", assetList.itemDropdownClick());
        assertTrue("Could not select first listed item.", assetList.inventoryFirstListedItemClick());
        assertTrue("Could not input Post Date Month.", assetList.inputPostDateMonth("01"));
        assertTrue("Could not input Post Date Day.", assetList.inputPostDateDay("01"));
        assertTrue("Could not input Post Date Year.", assetList.inputPostDateYear("2095"));
        assertTrue("Could not input a Post Month date.", assetList.postMonthInput("012095"));
        assertTrue("Could not input Quantity.", assetList.quantityInput("12"));
        assertTrue("Could not input Unit Cost.", assetList.unitCostInput("56"));
        assertTrue("Could not input Memo.", assetList.memoInput("Test Memo."));
        assertTrue("Could not select save button.", assetList.saveButtonClick());
        assertTrue("Could not find green success banner.", assetList.successBannerCheck());
    }

    @Test
    public void shouldAddANewFixedAsset_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not find Asset List.", navBar.clickAssetList());

        AssetList assetList = new AssetList(driver);
        assertTrue("Could not find the side panel.", assetList.sidePanelVisible());
        assertTrue("Could not find Fixed Assets Information header.", assetList.tableHeaderVisible());
        assertTrue("Could not find Add Fixed Asset button.", assetList.addFixedAssetClick());
        assertTrue("Could not find Item Name dropdown.", assetList.itemNameVisible());
        assertTrue("Could not find Property dropdown.", assetList.fixedAssetsPropertyVisible());
        assertTrue("Could not find Placed in Service toggle.", assetList.placedInServiceVisible());
        assertTrue("Could not find Placed in Service Date.", assetList.placedInServiceDateVisible());
        assertTrue("Could not find Location Type.", assetList.locationTypeVisible());
        assertTrue("Could not find Unit.", assetList.unitVisible());
        assertTrue("Could not find Location.", assetList.locationVisible());
        assertTrue("Could not find Asset Number.", assetList.assetNumberVisible());
        assertTrue("Could not find Serial Number.", assetList.serialNumberVisible());
        assertTrue("Could not find Purchased date.", assetList.purchasedVisible());
        assertTrue("Could not find Post Month.", assetList.fixedAssetPostMonthVisible());
        assertTrue("Could not find Purchase Price.", assetList.purchasePriceVisible());
        assertTrue("Could not find Make.", assetList.makeVisible());
        assertTrue("Could not find Model.", assetList.modelVisible());
        assertTrue("Could not find Color.", assetList.colorVisible());
        assertTrue("Could not find Condition.", assetList.conditionVisible());
        assertTrue("Could not find Warranty Vendor.", assetList.warrantyVendorVisible());
        assertTrue("Could not find Warranty Expiration.", assetList.warrantyExpirationVisible());
        assertTrue("Could not find Create New Vendor button.", assetList.createNewVendorButtonVisible());
        assertTrue("Could not find Add button.", assetList.addButtonVisible());
        assertTrue("Could not find Cancel Hyperlink.", assetList.fixedAssetCancelHyperlinkVisible());
        assertTrue("Could not select Item Name dropdown.", assetList.fixedAssetItemNameDropdownClick());
        assertTrue("Could not select first listed Item Name.", assetList.fixedAssetFirstListedItemClick());
        assertTrue("Could not select Property dropdown.", assetList.fixedAssetPropertyDropdownClick());
        assertTrue("Could not select first listed Property.", assetList.fixedAssetFirstListedPropertyClick());
        assertTrue("Could not toggle Placed in Service to No.", assetList.placedInServiceToggle());
        assertTrue("Could not input Serial Number.", assetList.serialNumber(randomNumber()));
        assertTrue("Could not select Purchased Date Picker.", assetList.purchasedDatePickerClick());
        assertTrue("Could not select Today button in Purchased date picker.", assetList.todayDateClick());
        assertTrue("Could not input Post Month date.", assetList.fixedAssetPostMonth("012095"));
        assertTrue("Could not input Purchase Price.", assetList.purchasePrice("147"));
        assertTrue("Could not select Add button.", assetList.fixedAssetAddButtonClick());
        assertTrue("Could not find green success banner.", assetList.successBannerCheck());

    }

    @Test
    public void shouldValidateAssetCondition_whenConditionIsAddedEditedDeleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not select Setup tab.", navBar.clickSetupButton());

        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());

        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());

        AssetCondition assetCondition = new AssetCondition(driver);
        assertTrue("Could not select Fixed Assets tab.", assetCondition.fixedAssetsTabClick());
        assertTrue("Could not select Add Asset Condition button.", assetCondition.addAssetConditionButtonClick());
        assertTrue("Could not find Add Asset Form.", assetCondition.addAssetFormVisible());
        assertTrue("Could not find Name box.", assetCondition.assetNameVisible());
        assertTrue("Could not find Description box.", assetCondition.assetDescriptionVisible());
        assertTrue("Could not find Enabled toggle.", assetCondition.assetEnablesToggleVisible());
        assertTrue("Could not find Add button.", assetCondition.addAssetButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", assetCondition.cancelAssetHyperlinkVisible());
        assertTrue("Could not input Name.", assetCondition.addAssetConditionName(randomName()));
        assertTrue("Could not submit new Asset Condition.", assetCondition.assetConditionSubmit());
        assertTrue("Could not find green success banner.", assetCondition.successBannerVisible());
        assertTrue("Could not select asset condition.", assetCondition.firstAssetConditionClick());
        assertTrue("Could not delete asset condition.", assetCondition.firstAssetConditionDeleteClick());
        assertTrue("Could not find green success banner.", assetCondition.successBannerVisible());
    }

    @Test
    public void shouldAddANewCatalogItemCategory_whenNameAndDescriptionFieldsAreCompleted() {
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        assertTrue("Could not select Setup tab.", entrata_navBar.clickSetupButton());

        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not select Financial tab.", companyFirstLevelNavigation.clickFinancialTab());

        FinancialNav financialNav = new FinancialNav(driver);
        assertTrue("Could not select Catalogs tab.", financialNav.catalogsTabClick());

        CatalogManagement catalogManagement = new CatalogManagement(driver);
        assertTrue("Could not select Catalog Management tab.", catalogManagement.catalogManagementClick());
        assertTrue("Could not select item category dropdown.", catalogManagement.itemCategoryDropdownClick());
        assertTrue("Could not select Add Catalog Item Category.", catalogManagement.addCatalogItemCategoryClick());
        assertTrue("Could not find Category Name.", catalogManagement.categoryNameVisible());
        assertTrue("Could not find Category Description.", catalogManagement.categoryDescriptionVisible());
        assertTrue("Could not find Enabled toggle.", catalogManagement.enabledToggleVisible());
        assertTrue("Could not find Add Item Category button.", catalogManagement.addItemCategoryButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", catalogManagement.cancelHyperlinkVisible());
        assertTrue("Could not input Category Name.", catalogManagement.categoryNameInput(randomName()));
        assertTrue("Could not input Category Description.", catalogManagement.categoryDetailsInput(randomName()));
        assertTrue("Could not click Add Item Category button.", catalogManagement.addItemCategoryButtonClick());
        assertTrue("Could not find green success banner.", catalogManagement.successBannerVisible());
    }
}
