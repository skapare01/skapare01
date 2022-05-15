package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;

import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.application_tab.RoommateInterestsPage;
import utils.RandomGenerator;

import static org.junit.Assert.*;

public class RoommateInterestQuestionsIT extends BaseBrowserTest {
    public RoommateInterestQuestionsIT(){
        super("campusapartments"); }


    @Test
    public void shouldAddInterestQuestion_whenStudentPropertyIsActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click on setup tab.",nav.clickSetupButton());
        assertTrue("Unable to click company sub tab.",nav.clickCompanyButton());
        CompanyFirstLevelNavigation first = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to click leasing tab.",first.clickLeasingTab());
        CompanyLeasingNav leasingNav = new CompanyLeasingNav(driver);
        assertTrue("Unable to click application subtab.",leasingNav.clickApplicationTab());
        RoommateInterestsPage roommateInterests = new RoommateInterestsPage(driver);
        assertTrue("Unable to click add question button.",roommateInterests.clickAddQuestion());
        assertTrue("Unable to select personality question type.", roommateInterests.selectPersonalityQuestionType());
        String title = RandomGenerator.randomName();
        assertTrue("Unable to enter interest question title", roommateInterests.enterInterestQuestionTitle(title));
        assertTrue("Unable to click single select button",roommateInterests.clickSingleSelectButton());
        String optionOne = RandomGenerator.randomName();
        assertTrue("Unable to enter information for option one",roommateInterests.enterOptionOne(optionOne));
        assertTrue("Unable to click save button",roommateInterests.clickSaveButton());
        assertEquals("Success message not displaying","Roommate Interest Question inserted successfully. ",roommateInterests.checkSuccessMessage());
        assertTrue("Unable to find added question",roommateInterests.checkAddedQuestion(title));



    }
}
