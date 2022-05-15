package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.resident_portal_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralSubTab extends BasePage {
    public GeneralSubTab(WebDriver driver) {super(driver);}

    //Variables-Standard Section
    private final By EDIT_STANDARD_SETTINGS_BUTTON = By.id("standard-button");
    private final By DEFAULT_WEBSITE_DROPDOWN = By.id("RESIDENT_PORTAL_AUTO_LOGIN_DOMAIN");
    private final By SELECT_DEFAULT_WEBSITE = By.cssSelector("option[value='rainbowforest']");
    private final By SAVE_BUTTON = By.xpath("//*[@id='standard-edit']/div[7]/div/input[2]");



    //Methods-Standard Section
    public boolean clickEditStandardSettingsButton() { return clickElement(EDIT_STANDARD_SETTINGS_BUTTON);}
    public boolean clickDefaultWebsiteDropdown() { return clickElement(DEFAULT_WEBSITE_DROPDOWN);}
    public boolean selectDefaultWebsite() { return clickElement(SELECT_DEFAULT_WEBSITE);}
    public boolean clickSaveButton() { return clickElement(SAVE_BUTTON);}


}
