package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;


    public class AddInspectionCurtain extends BasePage {
        public AddInspectionCurtain(WebDriver driver) {
            super(driver);
        }

        private final By CREATE_INSPECTION_BTN = By.cssSelector("a[onclick*='module=inspection_newxxx']");
        private final By INSPECTIONS_SIDE_PANEL_FILTER_BUTTON = By.id("open-filter-by-default");
        private final By FILTER_INSPECTIONS = By.cssSelector("a[class='button action first green text-white bold font14 generate-report submit-filter']");
        private final By INSPECTIONS_FILTER = By.id("open-filter-by-default");
        private final By ALL_STATUSES_FILTER = By.cssSelector("input[class='form-checkbox select-all-drop bindedall']");
        private final By STATUSES_DROP_DOWN = By.id("inspection_statuses_label");
        private final By NOT_STARTED_AND_IN_PROGRESS_FILTER = By.id("inspection_statuses_1");
        private final By UNDER_REVIEW_STATUS_FILTER = By.id("inspection_statuses_3");
        private final By APPROVED_STATUS_FILTER = By.id("inspection_statuses_5");
        //Overlay Selector
        private final By OVERLAY_SELECTOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
        //Overlay Method
        private void overlayAddInspections() { waitForOverlay(OVERLAY_SELECTOR); }

        public boolean clickUnderReviewStatusFilter() { return clickElement(UNDER_REVIEW_STATUS_FILTER); }

        public boolean clickApprovedStatusFilter() { return clickElement(APPROVED_STATUS_FILTER); }

        public boolean clickNotStartedAndInProgress() { return clickElement(NOT_STARTED_AND_IN_PROGRESS_FILTER); }

        public boolean clickStatusDropDown() { return clickElement(STATUSES_DROP_DOWN); }

        public boolean clickAllStatuses() { return clickElement(ALL_STATUSES_FILTER, waitTimes.LONG_WAIT); }

        public boolean verifyInspectionsFilterAppears() { return confirmElementIsVisible(INSPECTIONS_FILTER); }

        public boolean clickFilterInspections() { return clickElement(FILTER_INSPECTIONS); }

        public boolean clickFilterButtonOnInspectionsSidePanel() {overlayAddInspections(); return clickElement(INSPECTIONS_SIDE_PANEL_FILTER_BUTTON); }

        public boolean clickCreateInspectionButton() { return clickElement(CREATE_INSPECTION_BTN); }
}
