package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.insurance_subtab.InsurancePropertiesPage;
import page_objects.resident_insure_website.ResidentInsureWebsitePage;

import static org.junit.Assert.assertTrue;

public class ShouldLoadResidentInsureWebsiteWhenUsingClientAdminNavigationIT extends BaseBrowserTest {

    public ShouldLoadResidentInsureWebsiteWhenUsingClientAdminNavigationIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Entrata123");
    }

    @Test
    public void ShouldLoadResidentInsureWebsite_whenUsingClientAdminNavigation() {

        ClientAdminNavBar caNavigation = new ClientAdminNavBar(driver);
        assertTrue("Unable to click 'Support' tab in CA", caNavigation.clickSupportMenu());
        assertTrue("Unable to click 'Insurance' tab in CA", caNavigation.clickSupportInsurance());
        InsurancePropertiesPage insurancePropertiesPage = new InsurancePropertiesPage(driver);
        assertTrue("Unable to find 'Add Bulk Properties' button on Insurance page in CA", insurancePropertiesPage.findAddBulkProperties());
        assertTrue("Unable to find 'Select Company Name' dropdown on Insurance page in CA", insurancePropertiesPage.findSelectCompanyName());
        assertTrue("Unable to find 'Select Property Name' dropdown on Insurance page in CA", insurancePropertiesPage.findSelectPropertyName());
        assertTrue("Unable to find 'Select State Name' dropdown on Insurance page in CA", insurancePropertiesPage.findSelectStatName());
        assertTrue("Unable to find 'Zip Code' field on Insurance page in CA", insurancePropertiesPage.findZipCodeField());
        assertTrue("Unable to find 'Search' button on Insurance page in CA", insurancePropertiesPage.findSearchButton());
        assertTrue("Unable to click 'New Policy' button on Insurance page in CA", insurancePropertiesPage.clickNewPolicyButton());
        ResidentInsureWebsitePage residentInsureWebsitePage = new ResidentInsureWebsitePage(driver);
        assertTrue("Unable to switch to RI website page", residentInsureWebsitePage.switchToResidentInsureWebsite());
        assertTrue("Unable to find 'Enter Your Zip Code' field on RI website page", residentInsureWebsitePage.findWebsiteZipCodeField());
        assertTrue("Unable to find 'Get Quote' button on RI website page", residentInsureWebsitePage.findWebsiteGetQuoteButton());

    }

}
