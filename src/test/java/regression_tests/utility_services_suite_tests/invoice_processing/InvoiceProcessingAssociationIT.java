package regression_tests.utility_services_suite_tests.invoice_processing;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.utilities_tab.utility_bills.BillAssociationPage;
import page_objects.client_admin_page_objects.utilities_tab.utility_bills.UploadIPBillsModal;
import page_objects.client_admin_page_objects.utilities_tab.utility_bills.UtilityBillsPage;
import page_objects.login.ClientAdminLoginPage;


import static org.junit.Assert.assertTrue;

public class InvoiceProcessingAssociationIT extends BaseBrowserTest {

    public InvoiceProcessingAssociationIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN,"sdhanawade", System.getProperty("clientadmin.login.password"));
    }

    @Test //Test case ID#: 2224945
    public void VerifyInvoiceProcessingUploadFunctionality_whenLoggedInAsDataEntryUser() {
        //navigate to Utility Bills
        ClientAdminNavBar clientAdmin = new ClientAdminNavBar(driver);
        assertTrue("Failed to click on Utilities Tab.", clientAdmin.clickUtilitiesTab());
        assertTrue("Failed to click on Utility Bills Sub Tab.", clientAdmin.clickUtilityBillsSubTab());
        UtilityBillsPage utilityBills = new UtilityBillsPage(driver);
        //Upload IP bill
        assertTrue("Failed to click Upload IP Bills.", utilityBills.clickUploadIPBillsButton());
        UploadIPBillsModal uploadIP = new UploadIPBillsModal(driver);
        assertTrue("Failed to select test company from Company Dropdown.", uploadIP.selectTestCompanyFromDropdown());
        assertTrue("Failed to enter file path into Upload File field.", uploadIP.enterTestFilePathIntoUploadField());
        assertTrue("Failed to click on Preview / Upload Invoice(s) button.", uploadIP.clickPreviewUploadInvoice());
        assertTrue("Failed to click on Complete Upload.", uploadIP.clickCompleteUpload());
        assertTrue("Failed to confirm visibility of Upload Success Message.", utilityBills.confirmVisibilityOfUploadSuccessMessage());
    }

    @Test //Test case ID#: 2623433
    public void VerifyInvoiceProcessingAssociationReviewCreation_whenLoggedInAsDataEntryUser() {
        String invoiceNumber = "123456";
        String totalAmount = "10.00";
        String secondUser = "dkamle";

        //navigate to Utility Bills
        ClientAdminNavBar clientAdmin = new ClientAdminNavBar(driver);
        assertTrue("Failed to click on Utilities Tab.", clientAdmin.clickUtilitiesTab());
        assertTrue("Failed to click on Utility Bills Sub Tab.", clientAdmin.clickUtilityBillsSubTab());
        UtilityBillsPage utilityBills = new UtilityBillsPage(driver);
        //Upload IP bill
        assertTrue("Failed to click Upload IP Bills.", utilityBills.clickUploadIPBillsButton());
        UploadIPBillsModal uploadIP = new UploadIPBillsModal(driver);
        assertTrue("Failed to select test company from Company Dropdown.", uploadIP.selectTestCompanyFromDropdown());
        assertTrue("Failed to enter file path into Upload File field.", uploadIP.enterTestFilePathIntoUploadField());
        assertTrue("Failed to click on Preview / Upload Invoice(s) button.", uploadIP.clickPreviewUploadInvoice());
        assertTrue("Failed to click on Complete Upload.", uploadIP.clickCompleteUpload());
        assertTrue("Failed to confirm visibility of Upload Success Message.", utilityBills.confirmVisibilityOfUploadSuccessMessage());
        //Associate Bill
        assertTrue("Failed to click on Associate button in bill listing table.", utilityBills.clickFirstAssociateButtonInBillListingTable());
        BillAssociationPage associate = new BillAssociationPage(driver);
        assertTrue("Failed to click on Bill Details Date Picker.", associate.clickBillDatePicker());
        assertTrue("Failed to click on Date Picker Today Button.", associate.clickDatePickerTodayButton());
        assertTrue("Failed to enter Invoice Number.", associate.enterInvoiceNumber(invoiceNumber));
        assertTrue("Failed to enter Total Amount.", associate.enterTotalAmount(totalAmount));
        assertTrue("Failed to click on Bill Details Next Button.", associate.clickBillDetailsNextButton());
        assertTrue("Failed to click on Search Property Dropdown.", associate.clickSearchPropertyDropdown());
        assertTrue("Failed to select Azure Park in Search Property Dropdown", associate.selectAspenAssetManagementInPropertyDropdown());
        assertTrue("Failed to click Properties Next Button.", associate.clickPropertiesNextButton());
        //Log out of current user and log in with new user to complete second association pass
        assertTrue("Failed to click on User Profile Dropdown.", clientAdmin.clickUserProfileDropdown());
        assertTrue("Failed to click Logout.", clientAdmin.clickLogOut());
        ClientAdminLoginPage clientAdminLogin = new ClientAdminLoginPage(driver);
        assertTrue("Failed to click Click Here to login.", clientAdminLogin.clickClickHereToLogin());
        assertTrue("Failed to enter username into login.", clientAdminLogin.enterClientAdminUsername(secondUser));
        assertTrue("Failed to enter password into login.", clientAdminLogin.enterClientAdminPassword(System.getProperty("clientadmin.login.password")));
        assertTrue("Failed to click Login button.", clientAdminLogin.clickLoginButton());


    }
}
