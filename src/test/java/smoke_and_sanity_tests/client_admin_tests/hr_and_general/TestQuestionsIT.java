package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.dashboard_tab.tests_subtab.QuestionsPage;

import static org.junit.Assert.*;

public class TestQuestionsIT extends BaseBrowserTest {
    public TestQuestionsIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"spandey","Xento123");
    }
    @Test
    public void shouldAddAndPreviewTestQuestion_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        QuestionsPage questionsPage = new QuestionsPage(driver);
        assertTrue("unable to find dashboard tab",nav.moveToDashboardsTab());
        assertTrue("unable to find tests sub option",nav.moveToTestsSubtab());
        assertTrue("unable to click questions option",nav.clickQuestionsOption());
        assertTrue("unable to click add question",questionsPage.clickAddQuestion());
        assertTrue("unable to select multiple choice option",questionsPage.selectMultipleChoice());
        assertTrue("unable to select general group option",questionsPage.selectGeneralGroup());
        assertTrue("unable to select beginner level option", questionsPage.selectBeginnerLevel());
        assertTrue("unable to enter random question in question field",questionsPage.enterQuestion());
        assertTrue("unable to enter maximum points value of 3",questionsPage.enterMaximumPoints());
        assertTrue("unable to enter answer one option",questionsPage.enterAnswerOne());
        assertTrue("unable to enter answer two option",questionsPage.enterAnswerTwo());
        assertTrue("unable to enter answer three option",questionsPage.enterAnswerThree());
        assertTrue("unable to enter answer four option",questionsPage.enterAnswerFour());
        assertTrue("unable to identify question two as correct answer",questionsPage.clickCorrectAnswerTwo());
        assertTrue("unable to click cancel button",questionsPage.clickCancelButton());
        assertTrue("unable to click preview icon",questionsPage.clickPreviewIcon());
        assertTrue("unable to find test question text on preview popup",questionsPage.confirmVisibilityOfTestQuestion());

    }
}
