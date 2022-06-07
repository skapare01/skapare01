package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import page_objects.BasePage;

public class ImportNewData_Screen extends BasePage {

    public ImportNewData_Screen(WebDriver driver) {
        super(driver);
    }
    private final By selectStatus = By.xpath("//*[@data-options-category=\"Options\"]");

    private final By selectProperties = By.xpath("//*[@data-options-category='Properties']");

    private final By checkFromDropdown = By.xpath("//ul[@class = 'round-corners-bottom']/li");
    private final By checkFromDropdown1 = By.xpath("//li[@class = 'binded-label']/label");

    private final By checkFromDropdown3= By.xpath("//input[@data-property-name='MIGConventional']");

    private final By checkFromDropdown2 = By.xpath("//li[@class = 'binded-label']/input");

    private final By selectDateRange = By.id("masked-import_data_filters[date_range]");

    private final By filter = By.xpath("//input[@class = 'form-submit-slim margin5-left filter-submit']");

    public boolean SelectStatus()
    {
        return clickElement(selectStatus);
    }

    public boolean CheckFromDropdown()
    {
        return selectFromDropdownForOtherTypeElement(checkFromDropdown,"All Statuses");
    }

    public boolean UnCheckFromDropdown()
    {
        return selectFromDropdownForOtherTypeElement(checkFromDropdown,"In Progress");
    }
    public boolean SelectProperties()
    {
        return clickElement(selectProperties);
    }

    public boolean SelectPropertiesFromDropdownDropdown()
    {
        return clickElement(checkFromDropdown3);
      // return selectFromDropdownForOtherTypeElement(checkFromDropdown1,"000test1");
    }

    public boolean SelectProperty_Test()
    {
        return selectFromDropdownForOtherTypeElement(checkFromDropdown2,"AP_Swapnil_test");
    }

    public boolean ClearDataRange()
    {
        return elementClearTextField(selectDateRange);
    }
     public boolean SelectDateRange()
     {
         return sendKeysToElement(selectDateRange,"1001202102022022");
     }



    public boolean Filter()
    {

        return clickElement(filter);
    }

}
