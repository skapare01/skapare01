package page_objects.client_admin_page_objects.support_tab.screening_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Screening_Data_Providers extends BasePage {
    private final By SCREENING_DATA_PROVIDERS = By.cssSelector("#center_container > div.columnAllowance > div > ul > li.selected > a");
    private final By LIVE_DATA_PROVIDERS = By.cssSelector("#div_screening_data_providers_container > ul > li.show_live_test.selected > a");
    private final By TEST_DATA_PROVIDERS = By.cssSelector("#div_screening_data_providers_container > ul > li:nth-child(2) > a");

    public Screening_Data_Providers(WebDriver driver) {
        super(driver);
    }

    public boolean openScreeningDataProviders() {
        return clickElement(SCREENING_DATA_PROVIDERS);
    }

    public boolean openLivedataProviders() {
        return clickElement(LIVE_DATA_PROVIDERS);
    }

    //This is just added for now as this will eventually need to be a test itself in the future.
    public boolean openTestDataProviders() {
        return clickElement(TEST_DATA_PROVIDERS);
    }

    //DataProvider finders (after discussion with David for now we will pass in the name from the test. Consider updating this to read from a PoJo
    public boolean verifyDataProvider(String dataprovidername) {
        return confirmElementIsVisible(By.xpath("//*[text()='" + dataprovidername + "']"));
    }

}
