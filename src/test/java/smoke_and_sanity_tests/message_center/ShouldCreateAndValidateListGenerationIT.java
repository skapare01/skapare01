package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterCreateNewListGeneralNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MyLists;
import utils.RandomGenerator;
import static junit.framework.Assert.assertTrue;

public class ShouldCreateAndValidateListGenerationIT extends BaseBrowserTest {

    //Constructor
    public ShouldCreateAndValidateListGenerationIT() { super("dittmarcompany"); }

    @Test
    public void shouldCreateAndValidateListGeneration_whenInMessageCenter() {
        // Message Center Test ID: 2226992 - To validate create & update list in Message Center
        // Navigate to Tools tab, then to the "Message Center" subtab
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Tools tab in Dashboard -> Tools!", useEntrataNavBar.clickToolsTab());
        assertTrue("Couldn't navigate to the Message Center area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
        //Message Center > "Create New" popup/dropdown and selecting the "List" option
        MessageCenterNav messageCenterSmokeNavigation = new MessageCenterNav(driver);
        assertTrue("Unable to open the \"Create New\" Message Center item box!", messageCenterSmokeNavigation.createNewMessageCenterItem());
        MessageCenterCreateNewListGeneralNav useMessageCenterCreateListGeneral = new MessageCenterCreateNewListGeneralNav(driver);
        assertTrue("Unable to use the \"Create New\" Message Center \"List\" option!", messageCenterSmokeNavigation.messageCenterSelectCreateListOption());
        //Creating List name with a Random name using the RandomGenerator
        String randomName1 = RandomGenerator.randomName();
        assertTrue("Unable to select and enter keys into the \"Name this List:\" field!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListNameThisList(randomName1));
        //Selecting the "Select Recipients:" dropdown, and selecting the "Leads and Applicants" option
        assertTrue("Unable to select the \"Select Recipients:\" dropdown option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());
        assertTrue("Unable to select the Recipient type \"Leads and Applicants\"!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipientsTypeLeadsAndApplicants());
        //Need to re-click the "Select Recipients" dropdown here since it covers the Save & Continue button still on Recipient type selection
        assertTrue("Unable to enter re-click the \"Select Recipients:\" dropdown option after selecting the List Type!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());
        assertTrue("Unable to use the \"Save and Continue\" option in the 1st page \"(Select Recipients)\" of the create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinue());
        //"Save & Continue" on the second page requires a different selector, hence the different method specific to page 2 (Select Properties)
        assertTrue("Unable to use the \"Save and Continue\" option in the 2nd page \"(Select Properties)\" of the create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinuePage2());
        //Generating and Saving the List
        assertTrue("Unable to use the Generate List option in the create list Screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListGenerateList());
        assertTrue("Unable to use the Save List option!", useMessageCenterCreateListGeneral.generateListSaveList());
        //Nav to Message Center> "My Lists" and locating the newly created list created with the Random name
        MyLists useMyLists = new MyLists(driver);
        assertTrue("Unable to navigate to the Message Center My Lists after saving the new list!", useMyLists.navigateToMyLists());
        assertTrue("Unable to locate the newly created list!", messageCenterSmokeNavigation.viewNewlyCreatedList(randomName1));
        //Navigating back to Tools>"Message Center" and creating a new list again
        assertTrue("Couldn't navigate to the Message Center area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
        assertTrue("Unable to open the create new Message Center item box!", messageCenterSmokeNavigation.createNewMessageCenterItem());
        //Creating another list with another random name using the randomName2 string
        assertTrue("Unable to use the Create New Message Center List option!", messageCenterSmokeNavigation.messageCenterSelectCreateListOption());
        String randomName2 = RandomGenerator.randomName();
        assertTrue("Unable to enter keys into the \"Name this List\" option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListNameThisList2(randomName2));
        assertTrue("Unable to enter keys into the \"Name this List\" option!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());
        //Creating List with the "Residents" Recipient type
        assertTrue("Unable to select the Recipient type \"Residents\"!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipientsTypeResidents());
        //Re-selecting the "Select Recipients:" dropdown since it covers the "Save & Continue" button
        assertTrue("Unable to enter recheck the recipients dropdown option",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSelectRecipients());
        //Finishing creating the "Residents" type list
        assertTrue("Unable to use the First Save and Continue option in create list screen!"
                , useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinue());
        assertTrue("Unable to use the Second Save and Continue option in create list screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListSaveAndContinuePage2());
        assertTrue("Unable to use the Generate List option in the create list Screen!",
                useMessageCenterCreateListGeneral.messageCenterCreateNewListGenerateList());
        assertTrue("Unable to use the Save List option!", useMessageCenterCreateListGeneral.generateListSaveList());
        //Navigating to My Lists and locating the "Residents" type created list created in this test
        assertTrue("Unable to navigate to the Message Center \"My Lists\" section after saving the new list!", useMyLists.navigateToMyLists());
        assertTrue("Unable to locate the newly created list!", messageCenterSmokeNavigation.viewNewlyCreatedList(randomName2));


    }
}
