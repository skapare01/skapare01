package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkPlaceOnNoticePage extends BasePage {
    public BulkPlaceOnNoticePage(WebDriver driver){
        super(driver);}

    private final By SEARCH_BUTTON = By.id("search_filter");
    private final By CLOSE_BUTTON = By.className("close-button");

    public boolean ConfirmVisibilityOfSearchButton(){return confirmElementIsVisible(SEARCH_BUTTON);}
    public boolean clickClose(){return clickElement(CLOSE_BUTTON);}
}
