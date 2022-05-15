package smoke_and_sanity_tests.client_admin_tests.hr_and_general;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.hr_tab.HrSubTabsNavigation;
import static junit.framework.Assert.assertTrue;

public class RecruitmentAddApplicationButtonIT extends BaseBrowserTest {
    public RecruitmentAddApplicationButtonIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "pjaiswal", "Xento123");
    }

    @Test
    public void shouldCheckAddApplicationButton_whenAddApplicationButtonIsSelected() {
        ClientAdminNavBar clientNav = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'HR' tab.",clientNav.clickHrTab());
        HrSubTabsNavigation hrNav = new HrSubTabsNavigation(driver);
        assertTrue("Unable to locate/select 'Recruitment' sub-tab.", hrNav.clickRecruitmentSubTab());
        assertTrue("Unable to locate/select 'Add Application' button.",hrNav.clickAddApplicationBtn());
        assertTrue("Unable to locate 'Add Application' info page.",hrNav.viewAddApplicationBasicInfoText());
    }
}
