package smoke_and_sanity_tests.entrata_pricing.web_recon;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.competitors_subtab.CompetitorsPage;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyScraperDetailsPageWhenUsingNavigationInClientAdminIT extends BaseBrowserTest {

    public ShouldVerifyScraperDetailsPageWhenUsingNavigationInClientAdminIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Entrata123");
    }

    @Test
    public void shouldVerifyScraperDetailsPage_whenUsingNavigationInClientAdmin() {

        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);
        assertTrue("Unable to click 'Support' menu in ClientAdmin", caNav.clickSupportMenu());
        assertTrue("Unable to click 'Competitors' tab in ClientAdmin", caNav.clickSupportCompetitors());
        CompetitorsPage competitorsCA = new CompetitorsPage(driver);
        assertTrue("Unable to click 'Scraper Details' tab on Competitors page in ClientAdmin", competitorsCA.clickScraperDetailsTab());
        assertTrue("Unable to find 'Choose Filter Options' dropdown on Scraper Details page", competitorsCA.findFilterOptionsDropdown());
        assertTrue("Unable to find 'Select a Competitor Property' dropdown on Scraper Details page", competitorsCA.findSelectCompetitorDropdown());
        assertTrue("Unable to find 'Select an Associated Property' dropdown on Scraper Details page", competitorsCA.findSelectAssociatedPropertyDropdown());
        assertTrue("Unable to find 'Select an Associated Company' dropdown on Scraper Details page", competitorsCA.findSelectAssociatedCompanyDropdown());
        assertTrue("Unable to find 'Submit' button on Scraper Details page", competitorsCA.findSubmitFilterButton());
        assertTrue("Unable to find 'Updated On' column on Scraper Details page", competitorsCA.findUpdatedOn());
        assertTrue("Unable to find 'Scraper URL' column on Scraper Details page", competitorsCA.findScraperURL());
        assertTrue("Unable to find 'Status' column on Scraper Details page", competitorsCA.findStatus());
        assertTrue("Unable to find 'Scraper Data Type' column on Scraper Details page", competitorsCA.findScraperDataType());
        assertTrue("Unable to find 'Competitor Property' column on Scraper Details page", competitorsCA.findCompetitorProperty());
        assertTrue("Unable to find 'Associated Property' column on Scraper Details page", competitorsCA.findAssociatedProperty());
        assertTrue("Unable to find 'Associated Company' column on Scraper Details page", competitorsCA.findAssociatedCompany());
        assertTrue("Unable to find 'URL ID' column on Scraper Details page", competitorsCA.findUrlId());
        assertTrue("Unable to find 'Action' column on Scraper Details page", competitorsCA.findAction());

    }

}
