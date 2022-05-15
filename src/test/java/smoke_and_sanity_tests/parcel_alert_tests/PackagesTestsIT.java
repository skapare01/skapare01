package smoke_and_sanity_tests.parcel_alert_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.packages_subtab.PackagesPage;

import static org.junit.Assert.assertTrue;

public class PackagesTestsIT extends BaseBrowserTest {

    public PackagesTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldFindPackageListForm_whenNavigatedToPackagesTab() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        PackagesPage packagesPage = new PackagesPage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Packages tab.", navBar.clickPackagesTab());
        assertTrue("Could not find Package Listing form.", packagesPage.packageListingFormVisible());
    }

    @Test
    public void shouldFindEnterPackagesForm_whenEnterPackagesIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        PackagesPage packagesPage = new PackagesPage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Packages tab.", navBar.clickPackagesTab());
        assertTrue("Could not click Enter Packages button.", packagesPage.enterPackageButton());
        assertTrue("Could not find Enter Packages form.", packagesPage.enterPackageFormVisible());
    }
}
