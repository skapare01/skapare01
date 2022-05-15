package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.preferences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Preferences_General extends BasePage {

    public Preferences_General(WebDriver driver) {
        super(driver);}

    private final By EDIT_PRICING_OPTIONS = By.linkText("Edit Pricing Options");
    private final By SAVE_BUTTON = By.xpath("//*[@id=\"options-edit\"]/div/div/input");
    private final By CONFIRM_SAVE= By.linkText("Yes");


    public boolean clickEditPricingOptions(){return clickElement(EDIT_PRICING_OPTIONS);}
    public boolean clickSaveButton(){ return clickElement(SAVE_BUTTON);}
    public boolean clickConfirmSave(){return clickElement(CONFIRM_SAVE);}

}
