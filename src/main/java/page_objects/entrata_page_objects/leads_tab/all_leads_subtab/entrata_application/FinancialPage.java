package page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialPage extends BasePage {

    private final By NEXT_APPLICATION_STEP = By.xpath("//*[@id=\"next-prev-step\"]/a[2]");

    public FinancialPage(WebDriver driver){
        super(driver);
    }

    public boolean clickNextApplicationStep(){return clickElement(NEXT_APPLICATION_STEP);}

}
