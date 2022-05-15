package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveInNav extends BasePage {
    public MoveInNav(WebDriver driver){
        super(driver);}
    private final By MOVEIN_TAB = By.id("property_residents_movein_moveinxxx");
    private final By MOVEIN_SCHEDULER = By.id("property_residents_movein_movein_schedulerxxx");

    public boolean clickMoveInTab(){return clickElement(MOVEIN_TAB);}
    public boolean clickMoveInScheduler(){return clickElement(MOVEIN_SCHEDULER);}

}
