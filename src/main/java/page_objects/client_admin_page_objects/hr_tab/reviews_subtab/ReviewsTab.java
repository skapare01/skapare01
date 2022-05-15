package page_objects.client_admin_page_objects.hr_tab.reviews_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReviewsTab extends BasePage {

public ReviewsTab(WebDriver driver) {
    super(driver);
}

//Variables
    private final By ASSIGN_BULK_REVIEW = By.linkText("Assign Bulk Reviews");
    private final By FIRST_TO_BE_BULK_ASSIGNED = By.xpath("//tr[@class='aRow']//input[@TYPE='checkbox']");
    private final By SUBMIT_BULK_REVIEW = By.xpath("//input[@type='submit']");

//Methods
    public boolean clickAssignBulkReview() {
        return clickElement(ASSIGN_BULK_REVIEW);
    }

    public boolean clickFirstBulkAssignedEmployee() {
        return clickElement(FIRST_TO_BE_BULK_ASSIGNED);
    }

    public boolean clickSubmitBulkReview() {
        return clickElement(SUBMIT_BULK_REVIEW);
    }

}