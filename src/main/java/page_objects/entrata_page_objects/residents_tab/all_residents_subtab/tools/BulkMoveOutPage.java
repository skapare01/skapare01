package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkMoveOutPage extends BasePage {

    public BulkMoveOutPage(WebDriver driver){
        super(driver);}

    private final By SEARCH_BUTTON = By.cssSelector("input[value = 'Search']");


    public boolean confirmVisibilityOfSearchButton(){return confirmElementIsVisible(SEARCH_BUTTON);}
}
