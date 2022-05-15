package page_objects.client_admin_page_objects.tasks_tab.recurring_tasks_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.BasePage;

public class RecurringTasks extends BasePage {

    public RecurringTasks(WebDriver driver) {
        super(driver);
    }

    //Variables
    public String storedNumber;
    private final By RECURRING_TASK_COUNT = By.className("text-red");
    private final By RECURRING_TASK_CHECKBOX1 = By.xpath("//tr[@class='aRow']//input[@name='recurring_tasks[ids][]']");
    private final By RECURRING_TASK_CHECKBOX2 = By.xpath("//tr[@class='bRow']//input[@name='recurring_tasks[ids][]']");
    private final By RECURRING_TASKS_BULK_DELETE_BUTTON = By.id("delete_selected");
    private final By RECURRING_TASKS_BULK_DELETE_BUTTON_DELETE_CONFIRMATION = By.cssSelector("a[onclick='RecurringTaskModule.deleteSelectedTask( $recurringTaskId )']");

    //Methods
    public String locateNumberAndStoreAsString(By locator) {
        try {
            WebElement numberToBeStored = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
            storedNumber = numberToBeStored.getAttribute("innerHTML");
            System.out.println("The number stored is: " + storedNumber);
            return storedNumber;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String storedRecurringTaskCount() {
        return locateNumberAndStoreAsString(RECURRING_TASK_COUNT);
    }

    public boolean clickRecurringTaskCheckbox1() {
        return clickElement(RECURRING_TASK_CHECKBOX1);
    }

    public boolean clickRecurringTaskCheckbox2() {
        return clickElement(RECURRING_TASK_CHECKBOX2);
    }

    public boolean clickBulkDeleteButton() {
        return clickElement(RECURRING_TASKS_BULK_DELETE_BUTTON);
    }

    public boolean clickBulkDeleteButtonConfirmDelete() {
        return clickElement(RECURRING_TASKS_BULK_DELETE_BUTTON_DELETE_CONFIRMATION);
    }

    public boolean didTheTextChange() {
        return confirmElementTextNoLongerMatches(RECURRING_TASK_COUNT, storedNumber);
    }

}