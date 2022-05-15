package page_objects.client_admin_page_objects.support_tab.screening_subtab;

import org.apache.commons.io.input.BOMInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Screening_Manual_Review extends BasePage {

    private final By RESIDENT_VERIFY_MANUAL_REVIEW = By.id("resident_verify_manual_reviews-new");
    private final By VENDOR_ACCESS = By.id("vendor_access_manual_reviews-new");
    private final By CORI_COCOURT_REVIEW = By.id("cori_cocourt_reviews-new");
    private final By NEW_RESIDENT_VERIFY_MANUAL_REVIEW = By.id("new_resident_verify_manual_reviews-new");

    public Screening_Manual_Review(WebDriver driver) {
        super(driver);
    }

    public boolean confirmRVManualReviewIsVisible() {
        return confirmElementIsVisible(RESIDENT_VERIFY_MANUAL_REVIEW);
    }

    public boolean confirmVendorAccessIsVisible() {
        return confirmElementIsVisible(VENDOR_ACCESS);
    }

    public boolean confirmCoriCoCourtIsVisible() {
        return confirmElementIsVisible(CORI_COCOURT_REVIEW);
    }

    public boolean confirmNewResidentVerifyManualReviewIsVisible() {
        return confirmElementIsVisible(NEW_RESIDENT_VERIFY_MANUAL_REVIEW);
    }

    public boolean openNewResidentVerifyManualReview() {
        return clickElement(NEW_RESIDENT_VERIFY_MANUAL_REVIEW);
    }

}
