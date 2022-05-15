package page_objects.entrata_page_objects.residents_tab.packages_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PackagesPage extends BasePage {

    public PackagesPage(WebDriver driver) {
        super(driver);
    }

    private final By PACKAGE_LISTING_FORM = By.id("frm_packages_listing");
    private final By ADD_PACKAGE_BUTTON = By.id("create-packages");
    private final By ADD_PACKAGE_FORM = By.id("enter_packages");


    public boolean enterPackageButton() {
        return clickElement(ADD_PACKAGE_BUTTON);
    }

    //Visibility

    public boolean packageListingFormVisible() {
        return confirmElementIsVisible(PACKAGE_LISTING_FORM);
    }

    public boolean enterPackageFormVisible() {
        return confirmElementIsVisible(ADD_PACKAGE_FORM);
    }
}
