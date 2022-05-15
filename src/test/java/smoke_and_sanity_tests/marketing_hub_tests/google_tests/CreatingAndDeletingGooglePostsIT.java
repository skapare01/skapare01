package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Ignore;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab.GooglePostsSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab.GooglePostsModal;

import static org.junit.Assert.assertTrue;

public class CreatingAndDeletingGooglePostsIT extends BaseBrowserTest {

    public CreatingAndDeletingGooglePostsIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 3176077 1/3

    @Ignore //TODO Ignoring tests until product team makes product more reliable and testable. 4/6/22
    @Test
    public void shouldVerifyWhatsNewPost_whenCreatingNewGooglePost() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        //Navigate to Google tab of Marketing Hub Sub-tab
        assertTrue("Failed to move to the 'Tools' tab.", navBar.moveToToolsTab());
        assertTrue("Failed to select the 'Marketing Hub' sub-tab from the Tools tab.", navBar.clickMarketingHubSubTab());

        MarketingHubNav mshNav = new MarketingHubNav(driver);
        //Navigate to Google tab in Marketing Hub Sub-tab.
        assertTrue("Unable to select the 'Google' subtab of Marketing Hub.", mshNav.clickGoogleTab());

        GooglePostsSubtab gPostsTab = new GooglePostsSubtab(driver);
        //Create a "What's new" post.
        assertTrue("Failed to select the 'Posts' subtab of the Google subtab.", gPostsTab.clickGooglePostsSubTab());
        assertTrue("Failed to select the 'Create Post' on the subtab of Google Posts.", gPostsTab.clickCreatePost());

        GooglePostsModal gPostsModal = new GooglePostsModal(driver);
        //Verification of Google Post Creation and Deletion.
        assertTrue("Failed to click the 'Add Photo' option of the New Google Post modal.", gPostsModal.clickAddPhotoOption());
        assertTrue("Failed to select the test photo of an airplane from the Media Library.", gPostsModal.clickF35Photo());
        assertTrue("Failed to select the 'Use Selected' button from the Media Library.", gPostsModal.clickUseSelectedButton());
        assertTrue("Failed to enter text into the 'Write your post' field of the New Google Post modal.", gPostsModal.enterGenericMessageText());
        assertTrue("Failed to click the post button.", gPostsModal.clickPostButton());

        //Confirm the Post saved correctly and then delete it. Then finally confirm it was deleted correctly.
        assertTrue("Post did not save correctly.", gPostsTab.confirmAutomationTestSavedCorrectly("Automation Test post to be deleted."));
        assertTrue("Failed to click the edit button.", gPostsTab.clickFirstGooglePostEditButton());
        assertTrue("Failed to click the delete button.", gPostsModal.clickDeletePostButton());
        assertTrue("Failed to click the confirm delete button.", gPostsModal.clickConfirmDeleteButton());
        assertTrue("Failed to confirm Google Post was deleted.", gPostsTab.confirmPostDeletedSuccessfullyMessageIsDisplayed());

    }

}