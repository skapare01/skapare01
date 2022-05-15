package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PreCollectionsPage extends BasePage {
    public PreCollectionsPage(WebDriver driver){
        super(driver);}

    private final By EDIT_COLLECTION_SETTING = By.id("collections-button");

    public boolean verifyEditCollectionButton(){return confirmElementIsVisible(EDIT_COLLECTION_SETTING);}
}
