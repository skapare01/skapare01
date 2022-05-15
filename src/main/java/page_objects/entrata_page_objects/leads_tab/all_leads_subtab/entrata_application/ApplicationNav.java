package page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApplicationNav extends BasePage {

    private final By MARK_APPLICATION_COMPLETE_BUTTON = By.xpath("//*[text() = 'Mark Complete']");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public ApplicationNav(WebDriver driver){
        super(driver);}

    private void waitForLoadingOverlay(){waitForOverlay(LOADING_OVERLAY);}
    public boolean clickMarkApplicationCompleteButton(){waitForLoadingOverlay(); return clickElement(MARK_APPLICATION_COMPLETE_BUTTON);}


}
